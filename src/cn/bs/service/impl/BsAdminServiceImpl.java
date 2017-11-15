package cn.bs.service.impl;


import org.springframework.stereotype.Service;

import cn.bs.dao.BsAdminDao;
import cn.bs.dao.impl.BsAdminDaoImpl;
import cn.bs.model.BsAdmin;
import cn.bs.service.BsAdminService;

@Service("bsAdminService")
public class BsAdminServiceImpl extends BaseServiceImpl<BsAdmin> implements BsAdminService {
	@Override
	public BsAdmin login(BsAdmin bsAdmin) {
		return bsAdminDao.login(bsAdmin);
	}
/* 
 * 只需实现CategoryService接口中新增的方法即可，公共方法已经在BaseServiceImpl中实现了 
 */  
//    private SessionFactory sessionFactory;  
//      
//    //Spring会注进来  
//    public void setSessionFactory(SessionFactory sessionFactory) {  
//        this.sessionFactory = sessionFactory;  
//    }  
//      
//    protected Session getSession() {  
//        //从当前线程获取session，如果没有则创建一个新的session  
//        return sessionFactory.getCurrentSession();  
//    }  
//    
//	 @Override   
//	 public void save(BsAdmin bsAdmin) {  
//	     getSession().save(bsAdmin);  
//	 }  
//	   
//	 @Override   
//	 public void update(BsAdmin bsAdmin) {  
//	     getSession().update(bsAdmin);    
//	 } 
//	  
//     @Override  
//     public void delete(int id) {  
//         /*第一种方法有个弊端，就是没删除一次得先查询一次 
//         Object obj = getSession().get(BsAdmin.class, id); 
//         if(obj != null) { 
//             getSession().delete(obj); 
//         }*/  
//         String hql = "delete BsAdmin while id=:id";  
//         getSession().createQuery(hql) //  
//                 .setInteger("id", id) //  
//                 .executeUpdate();  
//     }  
//  
//     @Override  
//     public BsAdmin get(int id) {  
//         return (BsAdmin) getSession().get(BsAdmin.class, id);  
//     }  
//  
//     @Override  
//     public List<BsAdmin> query() {  
//         String hql = "from BsAdmin";  
//         return getSession().createQuery(hql).list();  
//     } 
     
     
//	环境配置时测试
//    @Override //没有和Spring整合的情况  
//    public void save(BsAdmin bsAdmin) {  
//        //通过刚刚生成的sessionFactory获取session  
//        Session session = HibernateSessionFactory.getSession();  
//        try {  
//            //手动事务  
//            session.getTransaction().begin();  
//            //执行业务逻辑  
//            session.save(bsAdmin);  
//            //手动提交  
//            session.getTransaction().commit();  
//        } catch(Exception e) {  
//            session.getTransaction().rollback();  
//            throw new RuntimeException(e);  
//        } finally {  
//            HibernateSessionFactory.closeSession();  
//        }         
//    }    
//    /*Spring和Hibernate整个后*/  
//    private SessionFactory sessionFactory; //定义一个sessionFactory  
//      
//    //当需要使用sessoinFactory的时候，Spring会将sessionFactory注入进来  
//    public void setSessionFactory(SessionFactory sessionFactory) {  
//        this.sessionFactory = sessionFactory;  
//    }    
//    protected Session getSession() {  
//        //从当前线程获取session，如果没有则创建一个新的session  
//        return sessionFactory.getCurrentSession();  
//    }  
//    
//    @Override //Spring和Hibernate整合后的情况  
//    public void update(BsAdmin bsAdmin) {  
//        getSession().update(bsAdmin);      
//    }  
}
