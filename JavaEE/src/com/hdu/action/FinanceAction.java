package com.hdu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hdu.dao.FinanceDao;
import com.hdu.model.Finance;
import com.hdu.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Scope("prototype")
@Component("financeAction")
public class FinanceAction extends ActionSupport {
	private Map<String, Object> dataMap;
	private Finance finance;
	private FinanceDao financeDao;
	
	public String pay() {
		dataMap = new HashMap<String, Object>();
		financeDao.add(finance);
		dataMap.put("status", 0);
		return "pay";
	}
	
	public String query() {
		dataMap = new HashMap<String, Object>();
		List<Finance> list = financeDao.queryFinances();
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("finance"+i, list.get(i));
		}
		return "query";
	}
	
//	public String login(){
//			System.out.println("aa");
//			Finance finance1 = financeDao.selectByFinancename(finance.getFinancename());
//			dataMap = new HashMap<String, Object>();
//			if(finance1 == null) 
//			{
//				dataMap.put("status", 1);
//				dataMap.put("finance", "Œﬁ¥À’À∫≈");
//			}
//			else if(finance1.getPassword().equals(finance.getPassword()))
//			{
//				dataMap.put("status", 0);
//				dataMap.put("identity", finance1.getIdentity());
//				ActionContext.getContext().getSession().put("financename",finance.getFinancename());
//			} else {
//				dataMap.put("status", 1);
//				dataMap.put("finance", "√‹¬Î¥ÌŒÛ");
//			}
//	
//			return "login";
//		}
	
	
	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		System.out.println("aa");
		this.finance = finance;
		System.out.println(finance.f_content);
	}

	public FinanceDao getFinanceDao() {
		return financeDao;
	}

	@Resource
	public void setFinanceDao(FinanceDao financeDao) {
		this.financeDao = financeDao;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
