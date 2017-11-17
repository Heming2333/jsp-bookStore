package cn.bs.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bs.dao.BsBooksDao;
import cn.bs.model.BsBooks;

@Repository("bsBooksDao")
public class BsBooksDaoImpl extends BaseDaoImpl<BsBooks> implements BsBooksDao {

}
