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
 * ֻ��ʵ��CategoryService�ӿ��������ķ������ɣ����������Ѿ���BaseServiceImpl��ʵ���� 
 */  
//    private SessionFactory sessionFactory;  
//      
//    //Spring��ע����  
//    public void setSessionFactory(SessionFactory sessionFactory) {  
//        this.sessionFactory = sessionFactory;  
//    }  
//      
//    protected Session getSession() {  
//        //�ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session  
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
//         /*��һ�ַ����и��׶ˣ�����ûɾ��һ�ε��Ȳ�ѯһ�� 
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
     
     
//	��������ʱ����
//    @Override //û�к�Spring���ϵ����  
//    public void save(BsAdmin bsAdmin) {  
//        //ͨ���ո����ɵ�sessionFactory��ȡsession  
//        Session session = HibernateSessionFactory.getSession();  
//        try {  
//            //�ֶ�����  
//            session.getTransaction().begin();  
//            //ִ��ҵ���߼�  
//            session.save(bsAdmin);  
//            //�ֶ��ύ  
//            session.getTransaction().commit();  
//        } catch(Exception e) {  
//            session.getTransaction().rollback();  
//            throw new RuntimeException(e);  
//        } finally {  
//            HibernateSessionFactory.closeSession();  
//        }         
//    }    
//    /*Spring��Hibernate������*/  
//    private SessionFactory sessionFactory; //����һ��sessionFactory  
//      
//    //����Ҫʹ��sessoinFactory��ʱ��Spring�ὫsessionFactoryע�����  
//    public void setSessionFactory(SessionFactory sessionFactory) {  
//        this.sessionFactory = sessionFactory;  
//    }    
//    protected Session getSession() {  
//        //�ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session  
//        return sessionFactory.getCurrentSession();  
//    }  
//    
//    @Override //Spring��Hibernate���Ϻ�����  
//    public void update(BsAdmin bsAdmin) {  
//        getSession().update(bsAdmin);      
//    }  
}
