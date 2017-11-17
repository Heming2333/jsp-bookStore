package cn.bs.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bs.dao.BsUserDao;
import cn.bs.model.BsUser;

@Repository("bsUserDao")
public class BsUserDaoImpl extends BaseDaoImpl<BsUser> implements BsUserDao {

}
