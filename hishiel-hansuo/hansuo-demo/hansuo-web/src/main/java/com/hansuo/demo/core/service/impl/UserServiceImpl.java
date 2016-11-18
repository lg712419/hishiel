package com.hansuo.demo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.base.BaseServiceImpl;
import com.hansuo.demo.core.dao.UserDao;
import com.hansuo.demo.core.entity.User;
import com.hansuo.demo.core.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public BaseDao<User, Long> getDao() {
		return userDao;
	}

	@Override
	public User authentication(User user) {
		return userDao.authentication(user);
	}

	@Override
	public User selectByUsername(String username) {
		return userDao.selectByUsername(username);
	}

}
