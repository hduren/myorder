package com.sendinfo.myorder.action;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.sendinfo.myorder.model.User;
import com.sendinfo.myorder.service.UserService;

public class UserAction extends BaseAction{
	@Autowired
	UserService userService;
	
	

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String addUser(){
		System.out.println("nihao");
		System.out.println("nihao");
		User user=new User();
		user.setEmail("longfei.hu1@zhiyoubao.com");
		user.setUserName("longfei.hu");
		user.setDeleted(false);
		user.setCreateTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		user.setModifiedTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		user.setMobile("12345678");
		user.setNow(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		user.setPassword("pwd");
		userService.addUser(user);
		return SUCCESS;
		
	}
	public void addUserPort(){
		System.out.println("nihao");

		
	}
}
