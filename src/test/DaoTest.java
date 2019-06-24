import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.po.UserPO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoTest {
    private ApplicationContext applicationContext;
    public static void main(String []args){
        java.text.NumberFormat percentFormat=java.text.NumberFormat.getPercentInstance();
        percentFormat.setMaximumFractionDigits(2);
        percentFormat.setMaximumIntegerDigits(3);
        percentFormat.setMinimumFractionDigits(0);
        percentFormat.setMinimumIntegerDigits(1);
        String a="0.21";
        System.out.println(percentFormat.format(Double.parseDouble(a)));
    }
    @Test
    public void userTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        Map<String,String> map = new HashMap<String,String>();
        map.put("password","123");
        map.put("username","leo");
        UserPO userPO = new UserPO();
        userPO.setUsername("test2");
        userPO.setPassword("123");
        userPO.setDepartment("test2");
        userPO.setJBZ("1234");
        userPO.setZQ("test");
        userPO.setId("0B839AE71C8E41E98E3CE2AA73427AE8");

        /*User user=userDAO.login(map);

        user=userDAO.getUser("FB9AF6332AEB453B816B18C1ABC02117");
        try {
            userDAO.updateUser(userPO);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            userDAO.deleteUser(userPO);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void userManagementTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        UserManagementDAO userManagementDAO = (UserManagementDAO) applicationContext.getBean("userManagementDAO");
        List<RolePO> rolePOList = userManagementDAO.getRoleByUsername("leo");
        List<PermissionPO> permissionPOList = userManagementDAO.getPermissionByUsername("leo");
        RolePO rolePO = rolePOList.get(0);
        PermissionPO permissionPO = permissionPOList.get(0);
    }

}
