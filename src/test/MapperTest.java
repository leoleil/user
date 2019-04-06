import com.onps.dao.ProjectCatMapper;
import com.onps.dao.ProjectMapper;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MapperTest {
    private ApplicationContext applicationContext;
    @Test
    public void projectTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectMapper projectMapper = (ProjectMapper) applicationContext.getBean("projectMapper");
        Project project = new Project();
        project.setProjectname("项目测试2");
        //projectMapper.insertSelective(project);
        ProjectExample projectExample = new ProjectExample();
        projectExample.or()
                .andIdEqualTo("6B7FE3AE4E9943D3B65375A3322D85DF");

        List<Project> projects = projectMapper.selectByExample(projectExample);
        projectMapper.deleteByExample(projectExample);
    }
}
