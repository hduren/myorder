package com.sendinfo.myorder.service._impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sendinfo.myorder.dao.UserDao;
import com.sendinfo.myorder.model.User;
import com.sendinfo.myorder.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}


	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public int addUser(User user) {
		System.out.println(user.toString());
		userDao.addUser(user);
		return 1;
	}

}
