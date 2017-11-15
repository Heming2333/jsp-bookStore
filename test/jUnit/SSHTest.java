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
 * @Description TODO(����Spring��ע����ԣ�����֧��Spring3.1������) 
 * 
 */  
/* 
 * Spring3.1����˸�spring-test-4.2.4.RELEASE.jar�������jar��ר������֧��JUnit����ע��Ĳ��Եģ���jar����spring-4.2.4-core�� 
 * ��jar�����и�SpringJUnit4ClassRunner.class����@RunWithע��ӽ������� 
 *  
 * ע��@ContextConfiguration��ʾ��ApplicationContext����ע��������Ͳ��������������ڲ��Գ�������new�ˣ�ֱ��ʹ�� 
 */  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:beans.xml")  
public class SSHTest {
    
  @Resource  
  private Date date;  
  
  @Resource  
  private BsAdminService bsAdminService;  
  
  @Test //����Spring IOC�Ŀ�������  
  public void springIoc() {  
      System.out.println(date);  
  }  
  
//  @Test  //����Hibernate�Ŀ�����������Ϊû�����ϣ�����ֱ��new  
//  public void hihernate() {  
//      BsAdminService bsAdminService = new BsAdminServiceImpl();  
//      BsAdmin bsAdmin = new BsAdmin("admin","123456","13735501806","yxl","330184199605162628");  
//      bsAdminService.save(bsAdmin);  
//      System.out.println("^_^");  
//  } 
  
  @Test //����Hibernate��Spring���Ϻ�  
  public void hibernateAndSpring() {  
	  bsAdminService.update(new BsAdmin(1, "admin","admin","13735501806","yxl","330184199605162628")); //categoryServiceͨ��Spring������ע�������
      System.out.println("^_^");    
  } 
}
