package cn.bs.service;

import cn.bs.model.BsAdmin;

//BsAdminService�ӿڼ̳�BaseService�ӿ�  
public interface BsAdminService extends BaseService<BsAdmin> {
	//�û���½���ɹ����ظ�User
	public BsAdmin login(BsAdmin bsAdmin);
//	  public void save(BsAdmin bsAdmin); //��������Hibernate����  ����
//	
//    public void update(BsAdmin bsAdmin); //��������Spring��Hibernate���Ϻ�  ����
//    
//    public void delete(int id); // ɾ��
//    
//    public BsAdmin get(int id); // ��ȡһ������
//    
//    public List<BsAdmin> query(); // ��ȡȫ������
/* 
 * ֻҪ���CategoryService������Ҫ���µķ������ɣ����������Ѿ���BaseService���� 
 */  
}
