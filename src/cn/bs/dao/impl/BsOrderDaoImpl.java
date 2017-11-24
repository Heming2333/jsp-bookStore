package cn.bs.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bs.dao.BsOrderDao;
import cn.bs.model.BsOrder;

@Repository("bsOrderDao")
public class BsOrderDaoImpl extends BaseDaoImpl<BsOrder> implements BsOrderDao {

}
