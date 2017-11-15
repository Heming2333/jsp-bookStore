package jUnit;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bs.model.BsAdmin;
import cn.bs.service.BsAdminService;
import cn.bs.service.impl.BsAdminServiceImpl;

/** 
 * @Description TODO(采用Spring的注解调试，仅仅支持Spring3.1及以上) 
 * 
 */  
/* 
 * Spring3.1后多了个spring-test-4.2.4.RELEASE.jar包，这个jar包专门用来支持JUnit基于注解的测试的，该jar包在spring-4.2.4-core中 
 * 该jar包里有个SpringJUnit4ClassRunner.class，用@RunWith注解加进来即可 
 *  
 * 注解@ContextConfiguration表示将ApplicationContext对象注入进来，就不用像以往那样在测试程序里先new了，直接使用 
 */  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:beans.xml")  
public class SSHTest {
    
  @Resource  
  private Date date;  
  
  @Resource  
  private BsAdminService bsAdminService;  
  
  @Test //测试Spring IOC的开发环境  
  public void springIoc() {  
      System.out.println(date);  
  }  
  
//  @Test  //测试Hibernate的开发环境，因为没有整合，可以直接new  
//  public void hihernate() {  
//      BsAdminService bsAdminService = new BsAdminServiceImpl();  
//      BsAdmin bsAdmin = new BsAdmin("admin","123456","13735501806","yxl","330184199605162628");  
//      bsAdminService.save(bsAdmin);  
//      System.out.println("^_^");  
//  } 
  
  @Test //测试Hibernate和Spring整合后  
  public void hibernateAndSpring() {  
	  bsAdminService.update(new BsAdmin(1, "admin","admin","13735501806","yxl","330184199605162628")); //categoryService通过Spring从上面注入进来的
      System.out.println("^_^");    
  } 
}
