import com.likainan.cmfz.dao.CarouselDao;
import com.likainan.cmfz.dao.ManagerDao;
import com.likainan.cmfz.dao.MenuDao;
import com.likainan.cmfz.entity.Manager;
import com.likainan.cmfz.service.CarouselService;
import com.likainan.cmfz.service.ManagerService;
import com.likainan.cmfz.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2018/7/4.
 */
public class Tt {
    /**
     *
     */
    @Test
    public void test1(){

        ApplicationContext atx= new ClassPathXmlApplicationContext("/applicationContext.xml");
        System.out.println(atx);
        MenuDao md= (MenuDao) atx.getBean("menuDao");
        MenuService ms= (MenuService) atx.getBean("menuServiceImpl");
        System.out.println(ms.queryAllMenu());
    }
    /**
     * 轮播图测试类
     */
    @Test
    public void test2(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("/applicationContext.xml");
        CarouselDao cd= (CarouselDao) atx.getBean("carouselDao");
        CarouselService cs= (CarouselService) atx.getBean("carouselServiceImpl");
        System.out.println(cs.queryAllPic());
    }
}
