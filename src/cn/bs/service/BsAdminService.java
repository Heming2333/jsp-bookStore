package cn.bs.service;

import cn.bs.model.BsAdmin;

//BsAdminService接口继承BaseService接口  
public interface BsAdminService extends BaseService<BsAdmin> {
	//用户登陆，成功返回该User
	public BsAdmin login(BsAdmin bsAdmin);
//	  public void save(BsAdmin bsAdmin); //用来测试Hibernate环境  插入
//	
//    public void update(BsAdmin bsAdmin); //用来测试Spring和Hibernate整合后  更新
//    
//    public void delete(int id); // 删除
//    
//    public BsAdmin get(int id); // 获取一条数据
//    
//    public List<BsAdmin> query(); // 获取全部数据
/* 
 * 只要添加CategoryService本身需要的新的方法即可，公共方法已经在BaseService中了 
 */  
}
