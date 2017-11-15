package cn.bs.dao;

import cn.bs.dao.BaseDao;
import cn.bs.model.BsAdmin;

public interface BsAdminDao extends BaseDao<BsAdmin> {
	//用户登陆，成功返回该User
	public BsAdmin login(BsAdmin bsAdmin);
}
