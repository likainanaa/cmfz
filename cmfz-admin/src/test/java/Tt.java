import com.likainan.cmfz.dao.ManagerDao;
import com.likainan.cmfz.entity.Manager;
import com.likainan.cmfz.service.ManagerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2018/7/4.
 */
public class Tt {
    @Test
    public void test1(){

        ApplicationContext atx= new ClassPathXmlApplicationContext("/applicationContext.xml");
        System.out.println(atx);
        ManagerService ms= (ManagerService) atx.getBean("managerServiceImpl");
        System.out.println(ms.queryManager(new Manager("1","lkn123","123456","1234",1)));
    }
}
