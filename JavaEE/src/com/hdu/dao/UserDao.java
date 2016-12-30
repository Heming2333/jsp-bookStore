package com.hdu.dao;

import com.hdu.model.User;

public interface UserDao {
	public void add(User user);
	public User selectByUsername(int username);
}
