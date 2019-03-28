import com.onps.dao.UserDAO;
import com.onps.model.User;
import com.onps.model.po.UserPO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class DaoTest {
    private ApplicationContext applicationContext;
    @Test
    public void userTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        UserPO userPO = new UserPO();
        userPO.setUsername("test2");
        userPO.setPassword("test2");
        userPO.setDepartment("test2");
        userPO.setJBZ("test2");
        userPO.setZQ("test2");

        User user;
        Map<String,String> map = new HashMap<String,String>();
        map.put("password","test");
        map.put("username","test");
        user = userDAO.login(map);
        try {
            userDAO.insertUser(userPO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
