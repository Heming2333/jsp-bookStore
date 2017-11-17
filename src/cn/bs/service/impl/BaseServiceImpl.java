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
 * @Description TODO（公共模块的抽取） 
 * 
 */  
@Service("baseService")
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {  
  
    private Class clazz; //clazz中存储了当前操作的类型，即泛型T  
    //@Resource
    //private SessionFactory sessionFactory;  
      
    public BaseServiceImpl() {  
                //下面三个打印信息可以去掉，这里是给自己看的  
        System.out.println("this代表的是当前调用构造方法的对象" + this);  
        System.out.println("获取当前this对象的父类信息" + this.getClass().getSuperclass());  
        System.out.println("获取当前this对象的父类信息(包括泛型信息)" + this.getClass().getGenericSuperclass());  
        //拿到泛型的参数类型  
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();  
        clazz = (Class)type.getActualTypeArguments()[0];  
    }  
      
    //public void setSessionFactory(SessionFactory sessionFactory) {  
    //    this.sessionFactory = sessionFactory;  
    //}  
      
    //protected Session getSession() {  
        //从当前线程获取session，如果没有则创建一个新的session  
    //    return sessionFactory.getCurrentSession();  
    //}  
	
	@PostConstruct
	public void init() {
		//根据clazz的类型，把不同的dao对象复制给baseDao对象
		String clazzName = clazz.getSimpleName();
		String clazzDao = clazzName.substring(0, 1).toLowerCase() 
				+ clazzName.substring(1) + "Dao"; //例如Account==>accountDao
		System.out.println(clazzDao);
		try {
//			Field clazzField = this.getClass().getField(clazzDao);
//			Field baseField = this.getClass().getField("baseDao");
			Field clazzField = this.getClass().getSuperclass().getDeclaredField(clazzDao);
			Field baseField = this.getClass().getSuperclass().getDeclaredField("baseDao");
			baseField.set(this, clazzField.get(this)); //baseDao就有值了
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//@Resource //baseDao是泛型，不能够注入只能通过上面的init方法赋值
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