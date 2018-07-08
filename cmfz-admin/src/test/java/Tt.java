import com.likainan.cmfz.dao.*;
import com.likainan.cmfz.entity.Article;
import com.likainan.cmfz.entity.Carousel;
import com.likainan.cmfz.entity.Manager;
import com.likainan.cmfz.entity.Master;
import com.likainan.cmfz.service.*;
import com.likainan.cmfz.untils.ExcelUtil;
import com.likainan.cmfz.untils.GetUUID;
import org.aspectj.util.FileUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

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
//        MenuService ms= (MenuService) atx.getBean("menuServiceImpl");
        System.out.println(md.findAllMenu());
    }
    /**
     * 轮播图测试类
     */
    @Test
    public void test2(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("/applicationContext.xml");
        CarouselDao cd= (CarouselDao) atx.getBean("carouselDao");

        CarouselService cs= (CarouselService) atx.getBean("carouselServiceImpl");
//        System.out.println(cd.insertPic(new Carousel("5","url",new Date(),"测试",0)));
        System.out.println(cs.queryAllPic(2,2));
//        System.out.println(cs.addPic(new Carousel("10","url",new Date(),"哈哈",0)));
    }

    /**
     * 上师测试类
     */

    @Test
    public  void test3(){
        String Excelpath="C:\\Users\\ASUS\\Desktop\\teacher1\\持明法洲\\持明法州项目资料\\a.xlsx";
        List<Master> list= ExcelUtil.importExcel(Excelpath,1,1, Master.class);
        ApplicationContext atx=new ClassPathXmlApplicationContext("applicationContext.xml");
        MasterDao md= (MasterDao) atx.getBean("masterDao");
        MasterService ms= (MasterService) atx.getBean("masterServiceImpl");
//        System.out.println(ms.queryAllMaster(0,3));
//        System.out.println(md.findAllMaster(0,2,"b"));
//        System.out.println(ms.queryAllMaster(0,2,"aa"));
        for (Master master:list
             ) {
            master.setMasterId(GetUUID.getUUID());
        }
        System.out.println(ms.addMasters(list));
    }
    @Test
    public void test4(){
        String Excelpath="C:\\Users\\ASUS\\Desktop\\teacher1\\持明法洲\\持明法州项目资料\\a.xlsx";
       List<Master> list= ExcelUtil.importExcel(Excelpath,1,1, Master.class);
        System.out.println("导入数据共["+list.size()+"]行");
        System.out.println(list);
    }
    @Test
    public void test5(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("/applicationContext.xml");
        ArticleDao ad= (ArticleDao) atx.getBean("articleDao");
        ArticleService as= (ArticleService) atx.getBean("articleServiceImpl");
            Article article= new Article("a","第一篇","`   ","aaaaa","11",new Date());
//        System.out.println(ad.insertArticle(article));
        System.out.println(as.addArticle(article));
    }

}
