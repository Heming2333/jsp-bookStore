package cn.bs.dao;

import cn.bs.dao.BaseDao;
import cn.bs.model.BsAdmin;

public interface BsAdminDao extends BaseDao<BsAdmin> {
	//�û���½���ɹ����ظ�User
	public BsAdmin login(BsAdmin bsAdmin);
}
