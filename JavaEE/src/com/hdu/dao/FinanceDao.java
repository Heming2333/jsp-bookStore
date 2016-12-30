package com.hdu.dao;

import java.util.List;

import com.hdu.model.Finance;

public interface FinanceDao {
	public void add(Finance finance);
	public List<Finance> queryFinances();
}
