package com.onps.service.serviceimpl.schedule;



import com.onps.dao.ProjectMapper;
import com.onps.dao.SubprojectMapper;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import com.onps.model.Subproject;
import com.onps.model.SubprojectExample;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleExcelService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProjectScheduleExcelServiceImpl implements ProjectScheduleExcelService{

    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private SubprojectMapper subprojectMapper;



    public void makeProjectExcel(OutputStream out) throws Exception {
        HSSFWorkbook workbook =new HSSFWorkbook();//创建文件对象
        HSSFSheet sheet =workbook.createSheet();//创建sheet
        //表格标题字体
        Font titleFont =workbook.createFont();
        titleFont.setFontName("方正小标宋简体");//设置字体
        titleFont.setFontHeightInPoints((short)20);//字体大小
        //表头字体
        Font headerFont =workbook.createFont();
        headerFont.setFontName("黑体");
        headerFont.setFontHeightInPoints((short)6);//字体大小
        //正文字体
        Font contextFont =workbook.createFont();
        contextFont.setFontName("宋体");
        contextFont.setFontHeightInPoints((short)6);//字体大小
        //表格标题格式 左右上下居中
        CellStyle titleStyle=workbook.createCellStyle();
        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //表头格式 左右上下居中
        CellStyle headerStyle=workbook.createCellStyle();
        headerStyle.setFont(headerFont);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);//上下居中
        headerStyle.setWrapText(true);//自动换行
        //正文格式 左对齐
        CellStyle contextStyle1=workbook.createCellStyle();

        contextStyle1.setFont(contextFont);
        contextStyle1.setAlignment(HorizontalAlignment.LEFT);
        contextStyle1.setWrapText(true);//自动换行
        //正文格式 左右上下居中
        CellStyle contextStyle=workbook.createCellStyle();
        contextStyle.setFont(contextFont);
        contextStyle.setVerticalAlignment(VerticalAlignment.CENTER);//上下居中
        contextStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        contextStyle.setWrapText(true);//自动换行

        //设置列宽
        for(int i=0;i<=48;i++){
            if(i==0){
                sheet.setColumnWidth(i, 1000);
            }
            if(i==1){
                sheet.setColumnWidth(i,1000);
            }
            else if(i==2){
                sheet.setColumnWidth(i, 5000);
            }
            else if(i==30){
                sheet.setColumnWidth(i, 5000);
            }
            else{
                sheet.setColumnWidth(i,1500);
            }
        }
        //第一行，共49列
        int rowNum=0;
        HSSFRow row0=sheet.createRow(rowNum++);
        HSSFCell cell=row0.createCell(0);
        cell.setCellValue("XX单位军事设施建设计划执行情况");
        cell.setCellStyle(titleStyle);
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,48)); //合并单元格
        //第二行
        HSSFRow row1=sheet.createRow(rowNum++);
        HSSFCell r1Cell0=row1.createCell(0);//r1cell0是row1的cell0
        r1Cell0.setCellValue("序号");
        r1Cell0.setCellStyle(headerStyle);
        HSSFCell r1Cell1=row1.createCell(1);//r1cell1是row1的cell1
        r1Cell1.setCellValue("战略\r\n方向");
        r1Cell1.setCellStyle(headerStyle);
        HSSFCell r1Cell2=row1.createCell(2);//r1cell2是row1的cell2
        r1Cell2.setCellValue("A-规划/计划安排情况");
        r1Cell2.setCellStyle(headerStyle);
        HSSFCell r1Cell10=row1.createCell(10);//row1的cell10
        r1Cell10.setCellValue("B-项目审批情况");
        r1Cell10.setCellStyle(headerStyle);
        HSSFCell r1cell37=row1.createCell(37);//row1的cell28
        r1cell37.setCellValue("C-建设进展情况");
        r1cell37.setCellStyle(headerStyle);
        HSSFCell r1Cell43=row1.createCell(48);//row1的cell43
        r1Cell43.setCellValue("备注");
        r1Cell43.setCellStyle(headerStyle);
        sheet.addMergedRegion(new CellRangeAddress(1,1,2,9)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,1,10,36)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,1,37,47)); //合并单元格
        //第三行

        HSSFRow row2=sheet.createRow(rowNum++);
        String [] row2Names={"序号","战略方向","项目名称","规划/计划文件","","","规划/计划投资（万元）","审批权限" ,"建设周期",
                "规划纲要重点项目","子项目名称","填报单位","立项送审(上报）","","","","立项批复","","","","设计任务书送审（上报）",
                "","","","下达设计任务书、建设计划（批复）","","","","军委机关审核意见回复时间","审批进展","主要建设内容和工程量","工程代号",
                "建设地点","建设单位","建设周期","","下达投资（万元）","建设阶段","建设周期","","","","","","","完成投资（万元）",
                "已形成能力","完工后预期形成能力",""};
        for(int i=0;i<=48;i++){
            HSSFCell cellx=row2.createCell(i);
            cellx.setCellValue(row2Names[i]);
            cellx.setCellStyle(headerStyle);
        }
        sheet.addMergedRegion(new CellRangeAddress(2,2,3,5)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,12,15)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,16,19)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,20,23)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,24,27)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,34,35)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,38,44)); //合并单元格
        //第四行
        HSSFRow row3=sheet.createRow(rowNum++);
        String[] row3Names={"","","","文件名","文号","时间","","","","","","","文件名","送审（上报）单位","文号","时间",
                "文件名","审批单位","文号","时间","文件名","送审（上报）单位","文号","时间","文件名","审批单位","文号","时间",
                "","","","","","","开工时间","竣工时间", "","","初步设计","招标采购","施工图设计","开工时间","初验时间","竣工时间",
                "工程进度（工程完成率）","","","",""};
        //写入数据
        for(int i=0;i<=48;i++){
            HSSFCell cellM=row3.createCell(i);
            cellM.setCellStyle(headerStyle);
            cellM.setCellValue(row3Names[i]);
            System.out.println(i);
        }
        //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,0,0)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,1,1)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,2,2)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,6,6)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,7,7)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,8,8)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,9,9)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,10,10)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,11,11)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,28,28)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,29,29)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,30,30)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,31,31)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,32,32)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,33,33)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,36,36)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,37,37)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,45,45)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,46,46)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,47,47)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,48,48)); //合并单元格
        /*HSSFCell r2cell0=row1.createCell(0);
        r2cell0.setCellValue("序号");
        r2cell0.setCellStyle(headerStyle);**/
        //第五行
        HSSFRow row4=sheet.createRow(rowNum++);
        row4.setHeight((short)1000);
        HSSFCell r4cell0=row4.createCell(0);
        r4cell0.setCellValue("总\r\n体\r\n情\r\n况");
        r4cell0.setCellStyle(contextStyle);
        HSSFCell r4cell2=row4.createCell(2);
        r4cell2.setCellValue(new HSSFRichTextString(
                "项目名称应严格按照军委和后勤保障部下达的规划项目准确填写，包含多个子项目的要与规划项目一一对应\r\n " +
                        "1.A-规划安排情况。（1）审批权限：填写“军委”或“军种”；“210工程”不填写" +
                        "（2）规划纲要重点项目：属重点项目的填写“是”，不属于的不填（“210工程”不填写）\r\n" +
                        "2.B-项目审批情况（1）立项、设计任务书送审时间：填写立项、设计任务书报送军委机关审查时间" +
                        "（2）军委审查意见回复时间\r\n" +
                        "3.C-计划下达情况（1）计划进展：根据项目审批情况，已全部下达的填写“全部下达”，下达部分的填写“部分下达”\r\n" +
                        "4.D-建设进展情况（1）建设阶段：根据建设进展情况，分别填写“未开工”，“在建”，“竣工”" ));
        r4cell2.setCellStyle(contextStyle1);
        sheet.addMergedRegion(new CellRangeAddress(4,4,2,48)); //合并单元格
        //项目内容
        ProjectExample projectExample=new ProjectExample();
        projectExample.setOrderByClause(" Level1 ASC,Level2 ASC");
        List<Project> projects=projectMapper.selectByExample(projectExample);//数据库中projects列表
        List<Subproject> subprojects;

        for(int projectNumber=0;projectNumber<projects.size();projectNumber++){
            //通过projectId,查出project对应的subproject列表subprojects
            SubprojectExample subprojectExample=new SubprojectExample();
            SubprojectExample.Criteria criteria=subprojectExample.createCriteria();
            criteria.andProjectidEqualTo(projects.get(projectNumber).getId());
            subprojects=subprojectMapper.selectByExample(subprojectExample);
            System.out.println(subprojects.size());
           //如果子项目为空，则只填入project数据
            if(subprojects.size()==0){
                HSSFRow row=sheet.createRow(rowNum++);
                HSSFCell cell0=row.createCell(0);
                cell0.setCellValue(projectNumber+1);
                cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!= null){
                HSSFCell cell5=row.createCell(5);
                cell5.setCellValue( projects.get(projectNumber).getDocumentdate().toString());
                cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                HSSFCell cell6=row.createCell(6);
                cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}
                System.out.println("空");
            }
            //如果子项目只有一条，则不用合并单元格，依次写入
            else if(subprojects.size()==1){
                //主项目
                HSSFRow row=sheet.createRow(rowNum++);
                 HSSFCell cell0=row.createCell(0);
                 cell0.setCellValue(projectNumber+1);
                 cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!=null){
                    HSSFCell cell5=row.createCell(5);
                    cell5.setCellValue( projects.get(projectNumber).getDocumentdate().toString());
                    cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                    HSSFCell cell6=row.createCell(6);
                    cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                    cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}

                //子项目
                if(subprojects.get(0).getSubname()!=null){
                    HSSFCell cell10=row.createCell(10);
                    cell10.setCellValue((String)subprojects.get(0).getSubname());
                    cell10.setCellStyle(contextStyle);}
                if(subprojects.get(0).getDepartment()!=null){
                    HSSFCell cell11=row.createCell(11);
                    cell11.setCellValue((String)subprojects.get(0).getDepartment());
                    cell11.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitfilename()!=null){
                    HSSFCell cell12=row.createCell(12);
                    cell12.setCellValue((String)subprojects.get(0).getSubmitfilename());
                    cell12.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdepartment()!=null){
                    HSSFCell cell13=row.createCell(13);
                    cell13.setCellValue((String)subprojects.get(0).getSubmitdepartment());
                    cell13.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitnumber()!=null){
                    HSSFCell cell14=row.createCell(14);
                    cell14.setCellValue((String)subprojects.get(0).getSubmitnumber());
                    cell14.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdate()!=null){
                    HSSFCell cell15=row.createCell(15);
                    cell15.setCellValue(subprojects.get(0).getSubmitdate().toString());
                    cell15.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalname()!=null){
                    HSSFCell cell16=row.createCell(16);
                    cell16.setCellValue((String)subprojects.get(0).getApprovalname());
                    cell16.setCellStyle(contextStyle); }
                if(subprojects.get(0).getApprovaldepartment()!=null){
                    HSSFCell cell17=row.createCell(17);
                    cell17.setCellValue((String)subprojects.get(0).getApprovaldepartment());
                    cell17.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnumber()!=null){
                    HSSFCell cell18=row.createCell(18);
                    cell18.setCellValue((String)subprojects.get(0).getApprovalnumber());
                    cell18.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldate()!=null){
                    HSSFCell cell19=row.createCell(19);
                    cell19.setCellValue(subprojects.get(0).getApprovaldate().toString());
                    cell19.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitfilenameTa()!=null){
                    HSSFCell cell20=row.createCell(20);
                cell20.setCellValue((String)subprojects.get(0).getSubmitfilenameTa());
                cell20.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdepartmentTa()!=null){
                    HSSFCell cell21=row.createCell(21);
                    cell21.setCellValue((String)subprojects.get(0).getSubmitdepartmentTa());
                    cell21.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitnumberTa()!=null){
                    HSSFCell cell22=row.createCell(22);
                    cell22.setCellValue((String)subprojects.get(0).getSubmitnumberTa());
                    cell22.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdateTa()!=null){
                    HSSFCell cell23=row.createCell(23);
                    cell23.setCellValue(subprojects.get(0).getSubmitdateTa().toString());
                    cell23.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnameTa()!=null){
                    HSSFCell cell24=row.createCell(24);
                    cell24.setCellValue((String)subprojects.get(0).getApprovalnameTa());
                    cell24.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldepartmentTa()!=null){
                    HSSFCell cell25=row.createCell(25);
                    cell25.setCellValue((String)subprojects.get(0).getApprovaldepartmentTa());
                    cell25.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnumberTa()!=null){
                    HSSFCell cell26=row.createCell(26);
                    cell26.setCellValue((String)subprojects.get(0).getApprovalnumberTa());
                    cell26.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldateTa()!=null){
                    HSSFCell cell27=row.createCell(27);
                    cell27.setCellValue(subprojects.get(0).getApprovaldateTa().toString());
                    cell27.setCellStyle(contextStyle);}
                if(subprojects.get(0).getReplydate()!=null){
                   HSSFCell cell28=row.createCell(28);
                   cell28.setCellValue(subprojects.get(0).getReplydate().toString());
                   cell28.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalprogress()!=null){
                   HSSFCell cell29=row.createCell(29);
                   cell29.setCellValue((String)subprojects.get(0).getApprovalprogress());
                   cell29.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructioncontent()!=null){
                   HSSFCell cell30=row.createCell(30);
                   cell30.setCellValue((String)subprojects.get(0).getConstructioncontent());
                   cell30.setCellStyle(contextStyle);}
                if(subprojects.get(0).getProjectnumber()!=null){
                   HSSFCell cell31=row.createCell(31);
                   cell31.setCellValue((String)subprojects.get(0).getProjectnumber());
                   cell31.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructionplace()!=null){
                   HSSFCell cell32=row.createCell(32);
                   cell32.setCellValue((String)subprojects.get(0).getConstructionplace());
                   cell32.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructioncompany()!=null){
                   HSSFCell cell33=row.createCell(33);
                   cell33.setCellValue((String)subprojects.get(0).getConstructioncompany());
                   cell33.setCellStyle(contextStyle);}
                if(subprojects.get(0).getStarttimeCon()!=null){
                   HSSFCell cell34=row.createCell(34);
                   cell34.setCellValue(subprojects.get(0).getStarttimeCon().toString());
                   cell34.setCellStyle(contextStyle);}
                if(subprojects.get(0).getEndtimeCon()!=null){
                   HSSFCell cell35=row.createCell(35);
                   cell35.setCellValue(subprojects.get(0).getEndtimeCon().toString());
                   cell35.setCellStyle(contextStyle);}
                if(subprojects.get(0).getReleaseinvestment()!=null){
                   HSSFCell cell36=row.createCell(36);
                   cell36.setCellValue(subprojects.get(0).getReleaseinvestment().toString());
                   cell36.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructionphase()!=null){
                   HSSFCell cell37=row.createCell(37);
                   cell37.setCellValue((String)subprojects.get(0).getConstructionphase());
                   cell37.setCellStyle(contextStyle);}
                if(subprojects.get(0).getFirstdesign()!=null){
                HSSFCell cell38=row.createCell(38);
                cell38.setCellValue((String)subprojects.get(0).getFirstdesign());
                cell38.setCellStyle(contextStyle);}
                if(subprojects.get(0).getBidding()!=null){
                HSSFCell cell39=row.createCell(39);
                cell39.setCellValue((String)subprojects.get(0).getBidding());
                cell39.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructiondesign()!=null){
                HSSFCell cell40=row.createCell(40);
                cell40.setCellValue((String)subprojects.get(0).getConstructiondesign());
                cell40.setCellStyle(contextStyle);}
                if(subprojects.get(0).getStarttime()!=null){
                HSSFCell cell41=row.createCell(41);
                cell41.setCellValue(subprojects.get(0).getStarttime().toString());
                cell41.setCellStyle(contextStyle);}
                if(subprojects.get(0).getTesttime()!=null){
                HSSFCell cell42=row.createCell(42);
                cell42.setCellValue(subprojects.get(0).getTesttime().toString());
                cell42.setCellStyle(contextStyle);}
                if(subprojects.get(0).getEndtime()!=null){
                HSSFCell cell43=row.createCell(43);
                cell43.setCellValue(subprojects.get(0).getEndtime().toString());
                cell43.setCellStyle(contextStyle);}
                if(subprojects.get(0).getProjectprogress()!=null){
                HSSFCell cell44=row.createCell(44);
                cell44.setCellValue((String)subprojects.get(0).getProjectprogress());
                cell44.setCellStyle(contextStyle);}
                if(subprojects.get(0).getCompletedinvestment()!=null){
                HSSFCell cell45=row.createCell(45);
                cell45.setCellValue(subprojects.get(0).getCompletedinvestment().toString());
                cell45.setCellStyle(contextStyle);}
                if(subprojects.get(0).getFormedability()!=null){
                HSSFCell cell46=row.createCell(46);
                cell46.setCellValue((String)subprojects.get(0).getFormedability());
                cell46.setCellStyle(contextStyle);}
                if(subprojects.get(0).getDesignedability()!=null){
                HSSFCell cell47=row.createCell(47);
                cell47.setCellValue((String)subprojects.get(0).getDesignedability());
                cell47.setCellStyle(contextStyle);}
                if(subprojects.get(0).getRemarks()!=null){
                HSSFCell cell48=row.createCell(48);
                cell48.setCellValue((String)subprojects.get(0).getRemarks());
                cell48.setCellStyle(contextStyle);}
                System.out.println("1");
            }
            //如果有多条子项目，在子项目那里需要添加一行小计
            else{
              int subprojectRows=subprojects.size()+1;
              System.out.println(subprojectRows);
               //开始合并 第一个参数是需要合并的第一行行号，第二个参数是需要合并的最后一行行号
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,0,0));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,1,1));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,2,2));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,3,3));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,4,4));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,5,5));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,6,6));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,7,7));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,8,8));
            sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,9,9));
                //先填入A表数据
                HSSFRow row=sheet.createRow(rowNum++);
                HSSFCell cell0=row.createCell(0);
                cell0.setCellValue(projectNumber+1);
                cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!=null){
                    HSSFCell cell5=row.createCell(5);
                    cell5.setCellValue(123 );//projects.get(projectNumber).getDocumentdate().toString()
                    cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                    HSSFCell cell6=row.createCell(6);
                    cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                    cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}
                double releaseInvesment=0;//小计中的下达投资
                double finishedInvesment=0;//小计中的完成投资

                //填入subproject数据(包括小计)
                for(int i=0;i<subprojects.size();i++){
                    HSSFRow rowX=sheet.createRow(rowNum++);
                    if(subprojects.get(i).getSubname()!=null){
                        HSSFCell cell10=rowX.createCell(10);
                        cell10.setCellValue((String)subprojects.get(i).getSubname());
                        cell10.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getDepartment()!=null){
                        HSSFCell cell11=rowX.createCell(11);
                        cell11.setCellValue((String)subprojects.get(i).getDepartment());
                        cell11.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitfilename()!=null){
                        HSSFCell cell12=rowX.createCell(12);
                        cell12.setCellValue((String)subprojects.get(i).getSubmitfilename());
                        cell12.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdepartment()!=null){
                        HSSFCell cell13=rowX.createCell(13);
                        cell13.setCellValue((String)subprojects.get(i).getSubmitdepartment());
                        cell13.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitnumber()!=null){
                        HSSFCell cell14=rowX.createCell(14);
                        cell14.setCellValue((String)subprojects.get(i).getSubmitnumber());
                        cell14.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdate()!=null){
                        HSSFCell cell15=rowX.createCell(15);
                        cell15.setCellValue(subprojects.get(i).getSubmitdate().toString());
                        cell15.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalname()!=null){
                        HSSFCell cell16=rowX.createCell(16);
                        cell16.setCellValue((String)subprojects.get(i).getApprovalname());
                        cell16.setCellStyle(contextStyle); }
                    if(subprojects.get(i).getApprovaldepartment()!=null){
                        HSSFCell cell17=rowX.createCell(17);
                        cell17.setCellValue((String)subprojects.get(i).getApprovaldepartment());
                        cell17.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnumber()!=null){
                        HSSFCell cell18=rowX.createCell(18);
                        cell18.setCellValue((String)subprojects.get(i).getApprovalnumber());
                        cell18.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldate()!=null){
                        HSSFCell cell19=rowX.createCell(19);
                        cell19.setCellValue(subprojects.get(i).getApprovaldate().toString());
                        cell19.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitfilenameTa()!=null){
                        HSSFCell cell20=rowX.createCell(20);
                        cell20.setCellValue((String)subprojects.get(i).getSubmitfilenameTa());
                        cell20.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdepartmentTa()!=null){
                        HSSFCell cell21=rowX.createCell(21);
                        cell21.setCellValue((String)subprojects.get(i).getSubmitdepartmentTa());
                        cell21.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitnumberTa()!=null){
                        HSSFCell cell22=rowX.createCell(22);
                        cell22.setCellValue((String)subprojects.get(i).getSubmitnumberTa());
                        cell22.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdateTa()!=null){
                        HSSFCell cell23=rowX.createCell(23);
                        cell23.setCellValue(subprojects.get(i).getSubmitdateTa().toString());
                        cell23.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnameTa()!=null){
                        HSSFCell cell24=rowX.createCell(24);
                        cell24.setCellValue((String)subprojects.get(i).getApprovalnameTa());
                        cell24.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldepartmentTa()!=null){
                        HSSFCell cell25=rowX.createCell(25);
                        cell25.setCellValue((String)subprojects.get(i).getApprovaldepartmentTa());
                        cell25.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnumberTa()!=null){
                        HSSFCell cell26=rowX.createCell(26);
                        cell26.setCellValue((String)subprojects.get(i).getApprovalnumberTa());
                        cell26.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldateTa()!=null){
                        HSSFCell cell27=rowX.createCell(27);
                        cell27.setCellValue(subprojects.get(i).getApprovaldateTa().toString());
                        cell27.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getReplydate()!=null){
                        HSSFCell cell28=rowX.createCell(28);
                        cell28.setCellValue(subprojects.get(i).getReplydate().toString());
                        cell28.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalprogress()!=null){
                        HSSFCell cell29=rowX.createCell(29);
                        cell29.setCellValue((String)subprojects.get(i).getApprovalprogress());
                        cell29.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructioncontent()!=null){
                        HSSFCell cell30=rowX.createCell(30);
                        cell30.setCellValue((String)subprojects.get(i).getConstructioncontent());
                        cell30.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getProjectnumber()!=null){
                        HSSFCell cell31=rowX.createCell(31);
                        cell31.setCellValue((String)subprojects.get(i).getProjectnumber());
                        cell31.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructionplace()!=null){
                        HSSFCell cell32=rowX.createCell(32);
                        cell32.setCellValue((String)subprojects.get(i).getConstructionplace());
                        cell32.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructioncompany()!=null){
                        HSSFCell cell33=rowX.createCell(33);
                        cell33.setCellValue((String)subprojects.get(i).getConstructioncompany());
                        cell33.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getStarttimeCon()!=null){
                        HSSFCell cell34=rowX.createCell(34);
                        cell34.setCellValue(subprojects.get(i).getStarttimeCon().toString());
                        cell34.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getEndtimeCon()!=null){
                        HSSFCell cell35=rowX.createCell(35);
                        cell35.setCellValue(subprojects.get(i).getEndtimeCon().toString());
                        cell35.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getReleaseinvestment()!=null){
                        HSSFCell cell36=rowX.createCell(36);
                        cell36.setCellValue(subprojects.get(i).getReleaseinvestment().doubleValue());
                        releaseInvesment=releaseInvesment+subprojects.get(i).getReleaseinvestment().doubleValue();
                        cell36.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructionphase()!=null){
                        HSSFCell cell37=rowX.createCell(37);
                        cell37.setCellValue((String)subprojects.get(i).getConstructionphase());
                        cell37.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getFirstdesign()!=null){
                        HSSFCell cell38=rowX.createCell(38);
                        cell38.setCellValue((String)subprojects.get(i).getFirstdesign());
                        cell38.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getBidding()!=null){
                        HSSFCell cell39=rowX.createCell(39);
                        cell39.setCellValue((String)subprojects.get(i).getBidding());
                        cell39.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructiondesign()!=null){
                        HSSFCell cell40=rowX.createCell(40);
                        cell40.setCellValue((String)subprojects.get(i).getConstructiondesign());
                        cell40.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getStarttime()!=null){
                        HSSFCell cell41=rowX.createCell(41);
                        cell41.setCellValue(subprojects.get(i).getStarttime().toString());
                        cell41.setCellStyle(contextStyle);}
                    System.out.println(subprojects.get(i).getStarttime().toString());
                    if(subprojects.get(i).getTesttime()!=null){
                        HSSFCell cell42=rowX.createCell(42);
                        cell42.setCellValue(subprojects.get(i).getTesttime().toString());
                        cell42.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getEndtime()!=null){
                        HSSFCell cell43=rowX.createCell(43);
                        cell43.setCellValue(subprojects.get(i).getEndtime().toString());
                        cell43.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getProjectprogress()!=null){
                        HSSFCell cell44=rowX.createCell(44);
                        cell44.setCellValue((String)subprojects.get(i).getProjectprogress());
                        cell44.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getCompletedinvestment()!=null){
                        HSSFCell cell45=rowX.createCell(45);
                        cell45.setCellValue(subprojects.get(i).getCompletedinvestment().doubleValue());
                        finishedInvesment=finishedInvesment+subprojects.get(i).getCompletedinvestment().doubleValue();
                        cell45.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getFormedability()!=null){
                        HSSFCell cell46=rowX.createCell(46);
                        cell46.setCellValue((String)subprojects.get(i).getFormedability());
                        cell46.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getDesignedability()!=null){
                        HSSFCell cell47=rowX.createCell(47);
                        cell47.setCellValue((String)subprojects.get(i).getDesignedability());
                        cell47.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getRemarks()!=null){
                        HSSFCell cell48=rowX.createCell(48);
                        cell48.setCellValue((String)subprojects.get(i).getRemarks());
                        cell48.setCellStyle(contextStyle);}

                    if(i==subprojects.size()-1){
                        //根据子项目填入的投资额，计算小计，并填入
                        HSSFCell xcell10=row.createCell(10);
                        xcell10.setCellValue("小计算啦");
                        xcell10.setCellStyle(contextStyle);
                        HSSFCell xcell36=row.createCell(36);
                        xcell36.setCellValue(releaseInvesment);
                        xcell36.setCellStyle(contextStyle);
                        HSSFCell xcell45=row.createCell(45);
                        xcell45.setCellValue(finishedInvesment);
                        xcell45.setCellStyle(contextStyle);
                    }
                }

        }
            }
//        response.setContentType("application/vnd.ms-excel");
//        response.setHeader("Content-disposition", "attachment;filename=ResultOutput.xls");
//        OutputStream out =response.getOutputStream();

        try{
            workbook.write(out);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 通过选择的条件列表导出excel
     *
     * @param projectScheduleVOList
     * @param response
     * @throws Exception
     */
    @Override
    public void makeProjectExcel(List<ProjectScheduleVO> projectScheduleVOList, HttpServletResponse response) throws Exception {

    }

    /**
     * 导出全部存在的excel
     *
     * @param response
     * @throws Exception
     */
    @Override
    public void makeProjectExcel(HttpServletResponse response) throws Exception {
        response.setContentType("application/vnd.ms-excel");
        response.addHeader("Content-Disposition", "attachment;filename="+java.net.URLEncoder.encode("汇总.xls", "UTF-8"));
        OutputStream out = response.getOutputStream();
        HSSFWorkbook workbook =new HSSFWorkbook();//创建文件对象
        HSSFSheet sheet =workbook.createSheet();//创建sheet
        //表格标题字体
        Font titleFont =workbook.createFont();
        titleFont.setFontName("方正小标宋简体");//设置字体
        titleFont.setFontHeightInPoints((short)20);//字体大小
        //表头字体
        Font headerFont =workbook.createFont();
        headerFont.setFontName("黑体");
        headerFont.setFontHeightInPoints((short)6);//字体大小
        //正文字体
        Font contextFont =workbook.createFont();
        contextFont.setFontName("宋体");
        contextFont.setFontHeightInPoints((short)6);//字体大小
        //表格标题格式 左右上下居中
        CellStyle titleStyle=workbook.createCellStyle();
        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //表头格式 左右上下居中
        CellStyle headerStyle=workbook.createCellStyle();
        headerStyle.setFont(headerFont);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);//上下居中
        headerStyle.setWrapText(true);//自动换行
        //正文格式 左对齐
        CellStyle contextStyle1=workbook.createCellStyle();

        contextStyle1.setFont(contextFont);
        contextStyle1.setAlignment(HorizontalAlignment.LEFT);
        contextStyle1.setWrapText(true);//自动换行
        //正文格式 左右上下居中
        CellStyle contextStyle=workbook.createCellStyle();
        contextStyle.setFont(contextFont);
        contextStyle.setVerticalAlignment(VerticalAlignment.CENTER);//上下居中
        contextStyle.setAlignment(HorizontalAlignment.CENTER);//左右居中
        contextStyle.setWrapText(true);//自动换行

        //设置列宽
        for(int i=0;i<=48;i++){
            if(i==0){
                sheet.setColumnWidth(i, 1000);
            }
            if(i==1){
                sheet.setColumnWidth(i,1000);
            }
            else if(i==2){
                sheet.setColumnWidth(i, 5000);
            }
            else if(i==30){
                sheet.setColumnWidth(i, 5000);
            }
            else{
                sheet.setColumnWidth(i,1500);
            }
        }
        //第一行，共49列
        int rowNum=0;
        HSSFRow row0=sheet.createRow(rowNum++);
        HSSFCell cell=row0.createCell(0);
        cell.setCellValue("XX单位军事设施建设计划执行情况");
        cell.setCellStyle(titleStyle);
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,48)); //合并单元格
        //第二行
        HSSFRow row1=sheet.createRow(rowNum++);
        HSSFCell r1Cell0=row1.createCell(0);//r1cell0是row1的cell0
        r1Cell0.setCellValue("序号");
        r1Cell0.setCellStyle(headerStyle);
        HSSFCell r1Cell1=row1.createCell(1);//r1cell1是row1的cell1
        r1Cell1.setCellValue("战略\r\n方向");
        r1Cell1.setCellStyle(headerStyle);
        HSSFCell r1Cell2=row1.createCell(2);//r1cell2是row1的cell2
        r1Cell2.setCellValue("A-规划/计划安排情况");
        r1Cell2.setCellStyle(headerStyle);
        HSSFCell r1Cell10=row1.createCell(10);//row1的cell10
        r1Cell10.setCellValue("B-项目审批情况");
        r1Cell10.setCellStyle(headerStyle);
        HSSFCell r1cell37=row1.createCell(37);//row1的cell28
        r1cell37.setCellValue("C-建设进展情况");
        r1cell37.setCellStyle(headerStyle);
        HSSFCell r1Cell43=row1.createCell(48);//row1的cell43
        r1Cell43.setCellValue("备注");
        r1Cell43.setCellStyle(headerStyle);
        sheet.addMergedRegion(new CellRangeAddress(1,1,2,9)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,1,10,36)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,1,37,47)); //合并单元格
        //第三行

        HSSFRow row2=sheet.createRow(rowNum++);
        String [] row2Names={"序号","战略方向","项目名称","规划/计划文件","","","规划/计划投资（万元）","审批权限" ,"建设周期",
                "规划纲要重点项目","子项目名称","填报单位","立项送审(上报）","","","","立项批复","","","","设计任务书送审（上报）",
                "","","","下达设计任务书、建设计划（批复）","","","","军委机关审核意见回复时间","审批进展","主要建设内容和工程量","工程代号",
                "建设地点","建设单位","建设周期","","下达投资（万元）","建设阶段","建设周期","","","","","","","完成投资（万元）",
                "已形成能力","完工后预期形成能力",""};
        for(int i=0;i<=48;i++){
            HSSFCell cellx=row2.createCell(i);
            cellx.setCellValue(row2Names[i]);
            cellx.setCellStyle(headerStyle);
        }
        sheet.addMergedRegion(new CellRangeAddress(2,2,3,5)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,12,15)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,16,19)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,20,23)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,24,27)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,34,35)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,2,38,44)); //合并单元格
        //第四行
        HSSFRow row3=sheet.createRow(rowNum++);
        String[] row3Names={"","","","文件名","文号","时间","","","","","","","文件名","送审（上报）单位","文号","时间",
                "文件名","审批单位","文号","时间","文件名","送审（上报）单位","文号","时间","文件名","审批单位","文号","时间",
                "","","","","","","开工时间","竣工时间", "","","初步设计","招标采购","施工图设计","开工时间","初验时间","竣工时间",
                "工程进度（工程完成率）","","","",""};
        //写入数据
        for(int i=0;i<=48;i++){
            HSSFCell cellM=row3.createCell(i);
            cellM.setCellStyle(headerStyle);
            cellM.setCellValue(row3Names[i]);
            System.out.println(i);
        }
        //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,0,0)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,1,1)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,2,2)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,6,6)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,7,7)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,8,8)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,9,9)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,10,10)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,11,11)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,28,28)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,29,29)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,30,30)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,31,31)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,32,32)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,33,33)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,36,36)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,37,37)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,45,45)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,46,46)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2,3,47,47)); //合并单元格
        sheet.addMergedRegion(new CellRangeAddress(1,3,48,48)); //合并单元格
        /*HSSFCell r2cell0=row1.createCell(0);
        r2cell0.setCellValue("序号");
        r2cell0.setCellStyle(headerStyle);**/
        //第五行
        HSSFRow row4=sheet.createRow(rowNum++);
        row4.setHeight((short)1000);
        HSSFCell r4cell0=row4.createCell(0);
        r4cell0.setCellValue("总\r\n体\r\n情\r\n况");
        r4cell0.setCellStyle(contextStyle);
        HSSFCell r4cell2=row4.createCell(2);
        r4cell2.setCellValue(new HSSFRichTextString(
                "项目名称应严格按照军委和后勤保障部下达的规划项目准确填写，包含多个子项目的要与规划项目一一对应\r\n " +
                        "1.A-规划安排情况。（1）审批权限：填写“军委”或“军种”；“210工程”不填写" +
                        "（2）规划纲要重点项目：属重点项目的填写“是”，不属于的不填（“210工程”不填写）\r\n" +
                        "2.B-项目审批情况（1）立项、设计任务书送审时间：填写立项、设计任务书报送军委机关审查时间" +
                        "（2）军委审查意见回复时间\r\n" +
                        "3.C-计划下达情况（1）计划进展：根据项目审批情况，已全部下达的填写“全部下达”，下达部分的填写“部分下达”\r\n" +
                        "4.D-建设进展情况（1）建设阶段：根据建设进展情况，分别填写“未开工”，“在建”，“竣工”" ));
        r4cell2.setCellStyle(contextStyle1);
        sheet.addMergedRegion(new CellRangeAddress(4,4,2,48)); //合并单元格
        //项目内容
        ProjectExample projectExample=new ProjectExample();
        projectExample.setOrderByClause("LEVEL1 ASC,PROJECTNAME ASC");
        List<Project> projects=projectMapper.selectByExample(projectExample);//数据库中projects列表
        List<Subproject> subprojects;

        for(int projectNumber=0;projectNumber<projects.size();projectNumber++){
            //通过projectId,查出project对应的subproject列表subprojects
            SubprojectExample subprojectExample=new SubprojectExample();
            SubprojectExample.Criteria criteria=subprojectExample.createCriteria();
            criteria.andProjectidEqualTo(projects.get(projectNumber).getId());
            subprojects=subprojectMapper.selectByExample(subprojectExample);
            System.out.println(subprojects.size());
            //如果子项目为空，则只填入project数据
            if(subprojects.size()==0){
                HSSFRow row=sheet.createRow(rowNum++);
                HSSFCell cell0=row.createCell(0);
                cell0.setCellValue(projectNumber+1);
                cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!= null){
                    HSSFCell cell5=row.createCell(5);
                    cell5.setCellValue( projects.get(projectNumber).getDocumentdate().toString());
                    cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                    HSSFCell cell6=row.createCell(6);
                    cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                    cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}
                System.out.println("空");
            }
            //如果子项目只有一条，则不用合并单元格，依次写入
            else if(subprojects.size()==1){
                //主项目
                HSSFRow row=sheet.createRow(rowNum++);
                HSSFCell cell0=row.createCell(0);
                cell0.setCellValue(projectNumber+1);
                cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!=null){
                    HSSFCell cell5=row.createCell(5);
                    cell5.setCellValue( projects.get(projectNumber).getDocumentdate().toString());
                    cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                    HSSFCell cell6=row.createCell(6);
                    cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                    cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}

                //子项目
                if(subprojects.get(0).getSubname()!=null){
                    HSSFCell cell10=row.createCell(10);
                    cell10.setCellValue((String)subprojects.get(0).getSubname());
                    cell10.setCellStyle(contextStyle);}
                if(subprojects.get(0).getDepartment()!=null){
                    HSSFCell cell11=row.createCell(11);
                    cell11.setCellValue((String)subprojects.get(0).getDepartment());
                    cell11.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitfilename()!=null){
                    HSSFCell cell12=row.createCell(12);
                    cell12.setCellValue((String)subprojects.get(0).getSubmitfilename());
                    cell12.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdepartment()!=null){
                    HSSFCell cell13=row.createCell(13);
                    cell13.setCellValue((String)subprojects.get(0).getSubmitdepartment());
                    cell13.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitnumber()!=null){
                    HSSFCell cell14=row.createCell(14);
                    cell14.setCellValue((String)subprojects.get(0).getSubmitnumber());
                    cell14.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdate()!=null){
                    HSSFCell cell15=row.createCell(15);
                    cell15.setCellValue(subprojects.get(0).getSubmitdate().toString());
                    cell15.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalname()!=null){
                    HSSFCell cell16=row.createCell(16);
                    cell16.setCellValue((String)subprojects.get(0).getApprovalname());
                    cell16.setCellStyle(contextStyle); }
                if(subprojects.get(0).getApprovaldepartment()!=null){
                    HSSFCell cell17=row.createCell(17);
                    cell17.setCellValue((String)subprojects.get(0).getApprovaldepartment());
                    cell17.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnumber()!=null){
                    HSSFCell cell18=row.createCell(18);
                    cell18.setCellValue((String)subprojects.get(0).getApprovalnumber());
                    cell18.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldate()!=null){
                    HSSFCell cell19=row.createCell(19);
                    cell19.setCellValue(subprojects.get(0).getApprovaldate().toString());
                    cell19.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitfilenameTa()!=null){
                    HSSFCell cell20=row.createCell(20);
                    cell20.setCellValue((String)subprojects.get(0).getSubmitfilenameTa());
                    cell20.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdepartmentTa()!=null){
                    HSSFCell cell21=row.createCell(21);
                    cell21.setCellValue((String)subprojects.get(0).getSubmitdepartmentTa());
                    cell21.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitnumberTa()!=null){
                    HSSFCell cell22=row.createCell(22);
                    cell22.setCellValue((String)subprojects.get(0).getSubmitnumberTa());
                    cell22.setCellStyle(contextStyle);}
                if(subprojects.get(0).getSubmitdateTa()!=null){
                    HSSFCell cell23=row.createCell(23);
                    cell23.setCellValue(subprojects.get(0).getSubmitdateTa().toString());
                    cell23.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnameTa()!=null){
                    HSSFCell cell24=row.createCell(24);
                    cell24.setCellValue((String)subprojects.get(0).getApprovalnameTa());
                    cell24.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldepartmentTa()!=null){
                    HSSFCell cell25=row.createCell(25);
                    cell25.setCellValue((String)subprojects.get(0).getApprovaldepartmentTa());
                    cell25.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalnumberTa()!=null){
                    HSSFCell cell26=row.createCell(26);
                    cell26.setCellValue((String)subprojects.get(0).getApprovalnumberTa());
                    cell26.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovaldateTa()!=null){
                    HSSFCell cell27=row.createCell(27);
                    cell27.setCellValue(subprojects.get(0).getApprovaldateTa().toString());
                    cell27.setCellStyle(contextStyle);}
                if(subprojects.get(0).getReplydate()!=null){
                    HSSFCell cell28=row.createCell(28);
                    cell28.setCellValue(subprojects.get(0).getReplydate().toString());
                    cell28.setCellStyle(contextStyle);}
                if(subprojects.get(0).getApprovalprogress()!=null){
                    HSSFCell cell29=row.createCell(29);
                    cell29.setCellValue((String)subprojects.get(0).getApprovalprogress());
                    cell29.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructioncontent()!=null){
                    HSSFCell cell30=row.createCell(30);
                    cell30.setCellValue((String)subprojects.get(0).getConstructioncontent());
                    cell30.setCellStyle(contextStyle);}
                if(subprojects.get(0).getProjectnumber()!=null){
                    HSSFCell cell31=row.createCell(31);
                    cell31.setCellValue((String)subprojects.get(0).getProjectnumber());
                    cell31.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructionplace()!=null){
                    HSSFCell cell32=row.createCell(32);
                    cell32.setCellValue((String)subprojects.get(0).getConstructionplace());
                    cell32.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructioncompany()!=null){
                    HSSFCell cell33=row.createCell(33);
                    cell33.setCellValue((String)subprojects.get(0).getConstructioncompany());
                    cell33.setCellStyle(contextStyle);}
                if(subprojects.get(0).getStarttimeCon()!=null){
                    HSSFCell cell34=row.createCell(34);
                    cell34.setCellValue(subprojects.get(0).getStarttimeCon().toString());
                    cell34.setCellStyle(contextStyle);}
                if(subprojects.get(0).getEndtimeCon()!=null){
                    HSSFCell cell35=row.createCell(35);
                    cell35.setCellValue(subprojects.get(0).getEndtimeCon().toString());
                    cell35.setCellStyle(contextStyle);}
                if(subprojects.get(0).getReleaseinvestment()!=null){
                    HSSFCell cell36=row.createCell(36);
                    cell36.setCellValue(subprojects.get(0).getReleaseinvestment().doubleValue());
                    cell36.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructionphase()!=null){
                    HSSFCell cell37=row.createCell(37);
                    cell37.setCellValue((String)subprojects.get(0).getConstructionphase());
                    cell37.setCellStyle(contextStyle);}
                if(subprojects.get(0).getFirstdesign()!=null){
                    HSSFCell cell38=row.createCell(38);
                    cell38.setCellValue((String)subprojects.get(0).getFirstdesign());
                    cell38.setCellStyle(contextStyle);}
                if(subprojects.get(0).getBidding()!=null){
                    HSSFCell cell39=row.createCell(39);
                    cell39.setCellValue((String)subprojects.get(0).getBidding());
                    cell39.setCellStyle(contextStyle);}
                if(subprojects.get(0).getConstructiondesign()!=null){
                    HSSFCell cell40=row.createCell(40);
                    cell40.setCellValue((String)subprojects.get(0).getConstructiondesign());
                    cell40.setCellStyle(contextStyle);}
                if(subprojects.get(0).getStarttime()!=null){
                    HSSFCell cell41=row.createCell(41);
                    cell41.setCellValue(subprojects.get(0).getStarttime().toString());
                    cell41.setCellStyle(contextStyle);}
                if(subprojects.get(0).getTesttime()!=null){
                    HSSFCell cell42=row.createCell(42);
                    cell42.setCellValue(subprojects.get(0).getTesttime().toString());
                    cell42.setCellStyle(contextStyle);}
                if(subprojects.get(0).getEndtime()!=null){
                    HSSFCell cell43=row.createCell(43);
                    cell43.setCellValue(subprojects.get(0).getEndtime().toString());
                    cell43.setCellStyle(contextStyle);}
                if(subprojects.get(0).getProjectprogress()!=null){
                    HSSFCell cell44=row.createCell(44);
                    java.text.NumberFormat percentFormat=java.text.NumberFormat.getPercentInstance();
                    percentFormat.setMaximumFractionDigits(2);
                    percentFormat.setMaximumIntegerDigits(3);
                    percentFormat.setMinimumFractionDigits(0);
                    percentFormat.setMinimumIntegerDigits(1);
                    System.out.println(percentFormat.format(Double.parseDouble((String)subprojects.get(0).getProjectprogress())));
                    cell44.setCellValue(percentFormat.format( Double.parseDouble((String)subprojects.get(0).getProjectprogress())));
                    cell44.setCellStyle(contextStyle);}
                if(subprojects.get(0).getCompletedinvestment()!=null){
                    HSSFCell cell45=row.createCell(45);
                    cell45.setCellValue(subprojects.get(0).getCompletedinvestment().doubleValue());
                    cell45.setCellStyle(contextStyle);}
                if(subprojects.get(0).getFormedability()!=null){
                    HSSFCell cell46=row.createCell(46);
                    cell46.setCellValue((String)subprojects.get(0).getFormedability());
                    cell46.setCellStyle(contextStyle);}
                if(subprojects.get(0).getDesignedability()!=null){
                    HSSFCell cell47=row.createCell(47);
                    cell47.setCellValue((String)subprojects.get(0).getDesignedability());
                    cell47.setCellStyle(contextStyle);}
                if(subprojects.get(0).getRemarks()!=null){
                    HSSFCell cell48=row.createCell(48);
                    cell48.setCellValue((String)subprojects.get(0).getRemarks());
                    cell48.setCellStyle(contextStyle);}
                System.out.println("1");
            }
            //如果有多条子项目，在子项目那里需要添加一行小计
            else{
                int subprojectRows=subprojects.size()+1;
                System.out.println(subprojectRows);
                //开始合并 第一个参数是需要合并的第一行行号，第二个参数是需要合并的最后一行行号
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,0,0));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,1,1));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,2,2));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,3,3));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,4,4));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,5,5));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,6,6));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,7,7));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,8,8));
                sheet.addMergedRegion(new CellRangeAddress(rowNum,rowNum+subprojectRows-1,9,9));
                //先填入A表数据
                HSSFRow row=sheet.createRow(rowNum++);
                HSSFCell cell0=row.createCell(0);
                cell0.setCellValue(projectNumber+1);
                cell0.setCellStyle(contextStyle);
                HSSFCell cell1=row.createCell(1);
                cell1.setCellValue( (String)projects.get(projectNumber).getLevel1());
                cell1.setCellStyle(contextStyle);
                HSSFCell cell2=row.createCell(2);
                cell2.setCellValue( (String)projects.get(projectNumber).getProjectname());
                cell2.setCellStyle(contextStyle);
                HSSFCell cell3=row.createCell(3);
                cell3.setCellValue( (String)projects.get(projectNumber).getDocumentname());
                cell3.setCellStyle(contextStyle);
                HSSFCell cell4=row.createCell(4);
                cell4.setCellValue( (String)projects.get(projectNumber).getDocumentnumber());
                cell4.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getDocumentdate()!=null){
                    HSSFCell cell5=row.createCell(5);
                    cell5.setCellValue( projects.get(projectNumber).getDocumentdate().toString());
                    cell5.setCellStyle(contextStyle);}
                if(projects.get(projectNumber).getInvestmentamount()!=null){
                    HSSFCell cell6=row.createCell(6);
                    cell6.setCellValue(projects.get(projectNumber).getInvestmentamount().doubleValue());
                    cell6.setCellStyle(contextStyle);}
                HSSFCell cell7=row.createCell(7);
                cell7.setCellValue((String)projects.get(projectNumber).getApprovalauthority());
                cell7.setCellStyle(contextStyle);
                HSSFCell cell8=row.createCell(8);
                cell8.setCellValue((String)projects.get(projectNumber).getConstructionperiod());
                cell8.setCellStyle(contextStyle);
                if(projects.get(projectNumber).getIsimportent()!=null){
                    HSSFCell cell9=row.createCell(9);
                    cell9.setCellValue(projects.get(projectNumber).getIsimportent().doubleValue());
                    cell9.setCellStyle(contextStyle);}
                double releaseInvesment=0;//小计中的下达投资
                double finishedInvesment=0;//小计中的完成投资

                //填入subproject数据(包括小计)
                for(int i=0;i<subprojects.size();i++){
                    HSSFRow rowX=sheet.createRow(rowNum++);
                    if(subprojects.get(i).getSubname()!=null){
                        HSSFCell cell10=rowX.createCell(10);
                        cell10.setCellValue((String)subprojects.get(i).getSubname());
                        cell10.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getDepartment()!=null){
                        HSSFCell cell11=rowX.createCell(11);
                        cell11.setCellValue((String)subprojects.get(i).getDepartment());
                        cell11.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitfilename()!=null){
                        HSSFCell cell12=rowX.createCell(12);
                        cell12.setCellValue((String)subprojects.get(i).getSubmitfilename());
                        cell12.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdepartment()!=null){
                        HSSFCell cell13=rowX.createCell(13);
                        cell13.setCellValue((String)subprojects.get(i).getSubmitdepartment());
                        cell13.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitnumber()!=null){
                        HSSFCell cell14=rowX.createCell(14);
                        cell14.setCellValue((String)subprojects.get(i).getSubmitnumber());
                        cell14.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdate()!=null){
                        HSSFCell cell15=rowX.createCell(15);
                        cell15.setCellValue(subprojects.get(i).getSubmitdate().toString());
                        cell15.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalname()!=null){
                        HSSFCell cell16=rowX.createCell(16);
                        cell16.setCellValue((String)subprojects.get(i).getApprovalname());
                        cell16.setCellStyle(contextStyle); }
                    if(subprojects.get(i).getApprovaldepartment()!=null){
                        HSSFCell cell17=rowX.createCell(17);
                        cell17.setCellValue((String)subprojects.get(i).getApprovaldepartment());
                        cell17.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnumber()!=null){
                        HSSFCell cell18=rowX.createCell(18);
                        cell18.setCellValue((String)subprojects.get(i).getApprovalnumber());
                        cell18.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldate()!=null){
                        HSSFCell cell19=rowX.createCell(19);
                        cell19.setCellValue(subprojects.get(i).getApprovaldate().toString());
                        cell19.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitfilenameTa()!=null){
                        HSSFCell cell20=rowX.createCell(20);
                        cell20.setCellValue((String)subprojects.get(i).getSubmitfilenameTa());
                        cell20.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdepartmentTa()!=null){
                        HSSFCell cell21=rowX.createCell(21);
                        cell21.setCellValue((String)subprojects.get(i).getSubmitdepartmentTa());
                        cell21.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitnumberTa()!=null){
                        HSSFCell cell22=rowX.createCell(22);
                        cell22.setCellValue((String)subprojects.get(i).getSubmitnumberTa());
                        cell22.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getSubmitdateTa()!=null){
                        HSSFCell cell23=rowX.createCell(23);
                        cell23.setCellValue(subprojects.get(i).getSubmitdateTa().toString());
                        cell23.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnameTa()!=null){
                        HSSFCell cell24=rowX.createCell(24);
                        cell24.setCellValue((String)subprojects.get(i).getApprovalnameTa());
                        cell24.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldepartmentTa()!=null){
                        HSSFCell cell25=rowX.createCell(25);
                        cell25.setCellValue((String)subprojects.get(i).getApprovaldepartmentTa());
                        cell25.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalnumberTa()!=null){
                        HSSFCell cell26=rowX.createCell(26);
                        cell26.setCellValue((String)subprojects.get(i).getApprovalnumberTa());
                        cell26.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovaldateTa()!=null){
                        HSSFCell cell27=rowX.createCell(27);
                        cell27.setCellValue(subprojects.get(i).getApprovaldateTa().toString());
                        cell27.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getReplydate()!=null){
                        HSSFCell cell28=rowX.createCell(28);
                        cell28.setCellValue(subprojects.get(i).getReplydate().toString());
                        cell28.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getApprovalprogress()!=null){
                        HSSFCell cell29=rowX.createCell(29);
                        cell29.setCellValue((String)subprojects.get(i).getApprovalprogress());
                        cell29.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructioncontent()!=null){
                        HSSFCell cell30=rowX.createCell(30);
                        cell30.setCellValue((String)subprojects.get(i).getConstructioncontent());
                        cell30.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getProjectnumber()!=null){
                        HSSFCell cell31=rowX.createCell(31);
                        cell31.setCellValue((String)subprojects.get(i).getProjectnumber());
                        cell31.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructionplace()!=null){
                        HSSFCell cell32=rowX.createCell(32);
                        cell32.setCellValue((String)subprojects.get(i).getConstructionplace());
                        cell32.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructioncompany()!=null){
                        HSSFCell cell33=rowX.createCell(33);
                        cell33.setCellValue((String)subprojects.get(i).getConstructioncompany());
                        cell33.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getStarttimeCon()!=null){
                        HSSFCell cell34=rowX.createCell(34);
                        cell34.setCellValue(subprojects.get(i).getStarttimeCon().toString());
                        cell34.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getEndtimeCon()!=null){
                        HSSFCell cell35=rowX.createCell(35);
                        cell35.setCellValue(subprojects.get(i).getEndtimeCon().toString());
                        cell35.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getReleaseinvestment()!=null){
                        HSSFCell cell36=rowX.createCell(36);
                        cell36.setCellValue(subprojects.get(i).getReleaseinvestment().doubleValue());
                        releaseInvesment=releaseInvesment+subprojects.get(i).getReleaseinvestment().doubleValue();
                        cell36.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructionphase()!=null){
                        HSSFCell cell37=rowX.createCell(37);
                        cell37.setCellValue((String)subprojects.get(i).getConstructionphase());
                        cell37.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getFirstdesign()!=null){
                        HSSFCell cell38=rowX.createCell(38);
                        cell38.setCellValue((String)subprojects.get(i).getFirstdesign());
                        cell38.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getBidding()!=null){
                        HSSFCell cell39=rowX.createCell(39);
                        cell39.setCellValue(subprojects.get(i).getBidding().toString());
                        cell39.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getConstructiondesign()!=null){
                        HSSFCell cell40=rowX.createCell(40);
                        cell40.setCellValue((String)subprojects.get(i).getConstructiondesign());
                        cell40.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getStarttime()!=null){
                        HSSFCell cell41=rowX.createCell(41);
                        cell41.setCellValue(subprojects.get(i).getStarttime().toString());
                        cell41.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getTesttime()!=null){
                        HSSFCell cell42=rowX.createCell(42);
                        cell42.setCellValue(subprojects.get(i).getTesttime().toString());
                        cell42.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getEndtime()!=null){
                        HSSFCell cell43=rowX.createCell(43);
                        cell43.setCellValue(subprojects.get(i).getEndtime().toString());
                        cell43.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getProjectprogress()!=null){
                        HSSFCell cell44=rowX.createCell(44);
                        java.text.NumberFormat percentFormat=java.text.NumberFormat.getPercentInstance();
                        percentFormat.setMaximumFractionDigits(2);
                        percentFormat.setMaximumIntegerDigits(3);
                        percentFormat.setMinimumFractionDigits(0);
                        percentFormat.setMinimumIntegerDigits(1);
                        subprojects.get(i).getProjectprogress();
                        //System.out.println(percentFormat.format( );
                        cell44.setCellValue(percentFormat.format(Double.parseDouble((String)subprojects.get(i).getProjectprogress())));
                        cell44.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getCompletedinvestment()!=null){
                        HSSFCell cell45=rowX.createCell(45);
                        cell45.setCellValue(subprojects.get(i).getCompletedinvestment().doubleValue());
                        finishedInvesment=finishedInvesment+subprojects.get(i).getCompletedinvestment().doubleValue();
                        cell45.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getFormedability()!=null){
                        HSSFCell cell46=rowX.createCell(46);
                        cell46.setCellValue((String)subprojects.get(i).getFormedability());
                        cell46.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getDesignedability()!=null){
                        HSSFCell cell47=rowX.createCell(47);
                        cell47.setCellValue((String)subprojects.get(i).getDesignedability());
                        cell47.setCellStyle(contextStyle);}
                    if(subprojects.get(i).getRemarks()!=null){
                        HSSFCell cell48=rowX.createCell(48);
                        cell48.setCellValue((String)subprojects.get(i).getRemarks());
                        cell48.setCellStyle(contextStyle);}
                    if(i==subprojects.size()-1){
                        //根据子项目填入的投资额，计算小计，并填入
                        HSSFCell xcell10=row.createCell(10);
                        xcell10.setCellValue("小计");
                        xcell10.setCellStyle(contextStyle);
                        HSSFCell xcell36=row.createCell(36);
                        xcell36.setCellValue(releaseInvesment);
                        xcell36.setCellStyle(contextStyle);
                        HSSFCell xcell45=row.createCell(45);
                        xcell45.setCellValue(finishedInvesment);
                        xcell45.setCellStyle(contextStyle);
                    }
                }

            }
        }
//        response.setContentType("application/vnd.ms-excel");
//        response.setHeader("Content-disposition", "attachment;filename=ResultOutput.xls");
//        OutputStream out =response.getOutputStream();

        try{
            workbook.write(out);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

