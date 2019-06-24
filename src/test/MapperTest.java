import com.onps.model.MyUser;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import com.onps.model.Subproject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MapperTest {
    private ApplicationContext applicationContext;
    @Test
    public void projectTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectMapper projectMapper = (ProjectMapper) applicationContext.getBean("projectMapper");
        Date date=new Date();
//        SimpleDateFormat format=new SimpleDateFormat();
//        format.applyPattern("yyyy-MM-dd");
//        Date date2=format.parse("2010-12-31");
        Project project = new Project();
        project.setProjectname("项目测试6");
        project.setDocumentname("文件1");
        project.setDocumentnumber("25");
        project.setDocumentdate(date);
        BigDecimal A=new BigDecimal(333.2);
        project.setInvestmentamount(A);
        project.setApprovalauthority("军区");
        project.setConstructionperiod("1年");
        project.setIsimportent(A);
        project.setLevel1("东部");
        project.setLevel2("东海");
        project.setLevel3("战场建设计划");
        project.setLevel4("十二五规划");
        project.setLevel5("陆军");
        project.setTimestamp(date);
       //project.setUserid(" ");
        projectMapper.insertSelective(project);
        projectMapper.selectByPrimaryKey("213423");//
        projectMapper.deleteByPrimaryKey("342");//根据主键删除
        System.out.println(projectMapper.selectByPrimaryKey("213423").getId());
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria c1=projectExample.createCriteria();
        c1.andIdEqualTo("213423");
        List<Project> projects = projectMapper.selectByExample(projectExample);
        projectMapper.deleteByExample(projectExample);
    }
    @Test
    public void subprojectTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        SubprojectMapper subprojectMapper = (SubprojectMapper) applicationContext.getBean("subprojectMapper");
        Subproject sp=new Subproject();
        Date date=new Date();
        sp.setSubname("北京");
        sp.setStarttime(date);
        sp.setProjectid("97AA268170E34900800D10EB2DF74606");
        sp.setUserid("000154FC9C2F45C483AEA7E002070F0C");
        subprojectMapper.insertSelective(sp);

        subprojectMapper.selectByPrimaryKey("2323");
        subprojectMapper.deleteByPrimaryKey("2323");


    }
    @Test
    public void myuserTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        MyUserMapper myuserMapper = (MyUserMapper) applicationContext.getBean("myUserMapper");
        MyUser myuser=new MyUser();
        myuser.setUsername("张");
        myuser.setDepartment("信通");
        myuserMapper.insertSelective(myuser);
        myuserMapper.selectByPrimaryKey("9FD2EC0C74A941708B8BCBCBF76EE2E5");
        myuserMapper.deleteByPrimaryKey("9FD2EC0C74A941708B8BCBCBF76EE2E5");

    }
    @Test
    public void big(){
        BigDecimal bigDecimal = new BigDecimal(1);
        System.out.println(bigDecimal);
        BigDecimal bigDecimal2 = new BigDecimal(1.0);
        System.out.println(bigDecimal2);

    }
}
