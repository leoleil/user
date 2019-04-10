import com.onps.dao.SubprojectMapper;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormAService;
import com.onps.service.ProjectScheduleFormBService;
import com.onps.service.serviceimpl.schedule.ProjectScheduleFormAServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    private ApplicationContext applicationContext;

    @Test
    public void ProjectScheduleFormAServiceImplTest() {
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectScheduleFormAService formA= (ProjectScheduleFormAService) applicationContext.getBean("projectScheduleFormAServiceImpl");
        ProjectScheduleVO vo = new ProjectScheduleVO();
        vo.setLevel1("东西南北");
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
        vo.setLevel1("东西南北");
        vo.setLevel2("东海");
        vo.setLevel3("战场建设计划");
        vo.setLevel4("十二五规划");
        vo.setLevel5("陆军");
        vo.setProjectName("项目测试6");
        vo.setBidding("55,555,555");
        vo.setSubName("北京");
//        try {
//            formB.updateBSchedule(vo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            formB.deleteBSchedule(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}