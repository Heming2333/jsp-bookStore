package com.hdu.dao;

import java.util.List;

import com.hdu.model.Message;

public interface MessageDao {
	public void add(Message message);
	public List<Message> selectMessagesByStudentId(String studentId);
}