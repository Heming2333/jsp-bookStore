package cn.bs.dao.impl;

import org.springframework.stereotype.Repository;

import cn.bs.dao.BsQuestionDao;
import cn.bs.model.BsQuestion;

@Repository("bsQuestionDao")
public class BsQuestionDaoImpl extends BaseDaoImpl<BsQuestion> implements BsQuestionDao {

}
