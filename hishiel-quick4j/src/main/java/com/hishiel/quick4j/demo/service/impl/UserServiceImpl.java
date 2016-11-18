package com.hishiel.quick4j.demo.service.impl;

import org.springframework.stereotype.Service;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.base.BaseServiceImpl;
import com.hishiel.quick4j.demo.dao.UserDao;
import com.hishiel.quick4j.demo.entity.User;
import com.hishiel.quick4j.demo.service.UserService;

/**
 * 用户Service实现类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:57:39
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

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
		// TODO Auto-generated method stub
		return null;
	}

}
