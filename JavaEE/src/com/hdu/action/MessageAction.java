package com.hdu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hdu.dao.MessageDao;
import com.hdu.model.Message;
import com.hdu.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Scope("prototype")
@Component("messageAction")
public class MessageAction extends ActionSupport {
	private Map<String, Object> dataMap;
	private Message message;
	private MessageDao messageDao;
	
	public String send() {
		dataMap = new HashMap<String, Object>();
		messageDao.add(message);
		dataMap.put("status", 0);
		return "send";
	}
	
	public String recive() {
		System.out.println(message.getT_stu());
		dataMap = new HashMap<String, Object>();
		List<Message> list = messageDao.selectMessagesByStudentId(message.getT_stu());
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("message"+i, list.get(i));
		}
		return "recive";
	}
	
//	public String login(){
//			System.out.println("aa");
//			Message message1 = messageDao.selectByMessagename(message.getMessagename());
//			dataMap = new HashMap<String, Object>();
//			if(message1 == null) 
//			{
//				dataMap.put("status", 1);
//				dataMap.put("message", "ÎŞ´ËÕËºÅ");
//			}
//			else if(message1.getPassword().equals(message.getPassword()))
//			{
//				dataMap.put("status", 0);
//				dataMap.put("identity", message1.getIdentity());
//				ActionContext.getContext().getSession().put("messagename",message.getMessagename());
//			} else {
//				dataMap.put("status", 1);
//				dataMap.put("message", "ÃÜÂë´íÎó");
//			}
//	
//			return "login";
//		}
	
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		System.out.println("aa");
		this.message = message;
		System.out.println(message.f_stu);
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	@Resource
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}