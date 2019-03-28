import com.onps.model.AbstractLink;
import com.onps.model.entity.FiberLink;
import com.onps.utils.StringUtils;
import org.junit.Test;

public class ModelTest {
    @Test
    public void linkTest(){
        String uuid = StringUtils.getUUID36();
        AbstractLink fiberLink = new FiberLink.Builder(uuid)
                .canDelete(true)
                .canDisplay(false)
                .canGrant(true)
                .department("北京邮电大学")
                .department("shan")
                .id(1)
                .build();
        AbstractLink fiberLink2 = new FiberLink.Builder(uuid)
                .canDelete(true)
                .canDisplay(false)
                .canGrant(true)
                .department("北京邮电大学")
                .id(1)
                .build();
        if(fiberLink.equals(fiberLink2)){
            System.out.println("OK");
        }
    }

}
