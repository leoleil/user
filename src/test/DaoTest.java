import com.onps.dao.DepartmentDAO;
import com.onps.model.po.DepartmentPO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoTest {
    private ApplicationContext applicationContext;
    @Test
    public void departmentTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        DepartmentDAO departmentDAO =(DepartmentDAO) applicationContext.getBean("departmentDAO");
        DepartmentPO departmentPO = new DepartmentPO();
        departmentPO.setName("计算机学院");
        /*try {
            departmentDAO.insertDepartment(departmentPO);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        departmentPO = departmentDAO.getDepartment("3F6A09D8D4D24722ACD09C77C23AAC09");
        List<DepartmentPO> departmentPOList;
        departmentPOList = departmentDAO.getDepartmentList();
        String s = "光研院";
        for (DepartmentPO d:departmentPOList
             ) {
            if(d.getName().equals(s)){
                departmentPO = d;
                break;
            }
        }
        try {
            departmentDAO.deleteDepartment(departmentPO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
