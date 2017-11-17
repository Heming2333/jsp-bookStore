package cn.bs.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import cn.bs.dao.BaseDao;
import cn.bs.dao.BsAdminDao;
import cn.bs.dao.BsBooksDao;
import cn.bs.dao.BsUserDao;
import cn.bs.service.BaseService;

/** 
 * @Description TODO������ģ��ĳ�ȡ�� 
 * 
 */  
@Service("baseService")
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {  
  
    private Class clazz; //clazz�д洢�˵�ǰ���������ͣ�������T  
    //@Resource
    //private SessionFactory sessionFactory;  
      
    public BaseServiceImpl() {  
                //����������ӡ��Ϣ����ȥ���������Ǹ��Լ�����  
        System.out.println("this������ǵ�ǰ���ù��췽���Ķ���" + this);  
        System.out.println("��ȡ��ǰthis����ĸ�����Ϣ" + this.getClass().getSuperclass());  
        System.out.println("��ȡ��ǰthis����ĸ�����Ϣ(����������Ϣ)" + this.getClass().getGenericSuperclass());  
        //�õ����͵Ĳ�������  
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();  
        clazz = (Class)type.getActualTypeArguments()[0];  
    }  
      
    //public void setSessionFactory(SessionFactory sessionFactory) {  
    //    this.sessionFactory = sessionFactory;  
    //}  
      
    //protected Session getSession() {  
        //�ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session  
    //    return sessionFactory.getCurrentSession();  
    //}  
	
	@PostConstruct
	public void init() {
		//����clazz�����ͣ��Ѳ�ͬ��dao�����Ƹ�baseDao����
		String clazzName = clazz.getSimpleName();
		String clazzDao = clazzName.substring(0, 1).toLowerCase() 
				+ clazzName.substring(1) + "Dao"; //����Account==>accountDao
		System.out.println(clazzDao);
		try {
//			Field clazzField = this.getClass().getField(clazzDao);
//			Field baseField = this.getClass().getField("baseDao");
			Field clazzField = this.getClass().getSuperclass().getDeclaredField(clazzDao);
			Field baseField = this.getClass().getSuperclass().getDeclaredField("baseDao");
			baseField.set(this, clazzField.get(this)); //baseDao����ֵ��
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//@Resource //baseDao�Ƿ��ͣ����ܹ�ע��ֻ��ͨ�������init������ֵ
	protected BaseDao baseDao;
	@Resource
	protected BsAdminDao bsAdminDao;
	@Resource
	protected BsUserDao bsUserDao;
	@Resource
	protected BsBooksDao bsBooksDao;
	
	
    //@Override  
    //public void save(T t) {  
    //    getSession().save(t);  
    //}  
  
    //@Override  
    //public void update(T t) {  
    //    getSession().update(t);   
    //}  
  
    //@Override  
    //public void delete(int id) {  
    //    System.out.println(clazz.getSimpleName());  
    //    String hql = "delete " + clazz.getSimpleName() + " as c where c.id=:id";  
    //    getSession().createQuery(hql) //  
    //              .setInteger("id", id) //  
    //              .executeUpdate();  
   // }  
  
   // @Override  
   // public T get(int id) {  
   //     return (T) getSession().get(clazz, id);  
   // }  
  
   // @Override  
   // public List<T> query() {  
   //     String hql = "from " + clazz.getSimpleName();  
   //     return getSession().createQuery(hql).list();  
  //  }  
	
	@Override
	public void save(T t) {
		baseDao.save(t);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);	
	}

	@Override
	public void delete(int id) {
		baseDao.delete(id);
	}

	@Override
	public T get(int id) {
		return (T) baseDao.get(id);
	}

	@Override
	public List<T> query() {
		return baseDao.query();
	}
  
}  