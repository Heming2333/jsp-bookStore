package cn.bs.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bs.dao.BsAdminDao;
import cn.bs.model.BsAdmin;

@Repository("bsAdminDao")
public class BsAdminDaoImpl extends BaseDaoImpl<BsAdmin> implements BsAdminDao {

@Override
public BsAdmin login(BsAdmin bsAdmin) {
String hql = "from BsAdmin u where u.username=:username and u.password=:password";
return (BsAdmin) getSession().createQuery(hql) //
	.setString("username", bsAdmin.getUsername()) //
	.setString("password", bsAdmin.getPassword()) //
	.uniqueResult();
}

}
