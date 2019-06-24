import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormAService;
import com.onps.service.ProjectScheduleFormBService;
import com.onps.service.serviceimpl.schedule.ProjectScheduleExcelServiceImpl;
import com.onps.service.serviceimpl.schedule.ProjectScheduleFormAServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ServiceTest {
    private ApplicationContext applicationContext;

    @Test
    public void ProjectScheduleFormAServiceImplTest() {
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectScheduleFormAService formA= (ProjectScheduleFormAService) applicationContext.getBean("projectScheduleFormAServiceImpl");
        ProjectScheduleVO vo = new ProjectScheduleVO();
        vo.setLevel1("东部");
        vo.setLevel2("东海");
        vo.setLevel3("战场建设计划");
        vo.setLevel4("十二五规划");
        vo.setLevel5("陆军");
        vo.setProjectName("项目测试6");
        vo.setSubName("北京");
//        try {
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            formA.deleteASchedule(vo);//delete
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ProjectScheduleFormBServiceImplTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectScheduleFormBService formB= (ProjectScheduleFormBService) applicationContext.getBean("projectScheduleFormBServiceImpl");
        ProjectScheduleVO vo = new ProjectScheduleVO();
        vo.setLevel1("东部");
        vo.setLevel2("东海");
        vo.setLevel3("战场建设计划");
        vo.setLevel4("十二五规划");
        vo.setLevel5("陆军");
        vo.setProjectName("项目测试5");
        vo.setSubName("北京");
        vo.setProjectId("A8A4CEAB85004CD38DB01CC5E367FD60");

//        try {
         //   formB.updateBSchedule(vo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            formB.deleteBSchedule(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void excelTest(){

        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectScheduleExcelServiceImpl excel= (ProjectScheduleExcelServiceImpl) applicationContext.getBean("projectScheduleExcelServiceImpl");
        ProjectScheduleExcelServiceImpl out1=new ProjectScheduleExcelServiceImpl();
        OutputStream out= null;
        try {

            out = new FileOutputStream("F://表格导出.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            excel.makeProjectExcel(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}