package com.hishiel.quick4j.demo.service;

import com.hishiel.quick4j.base.BaseService;
import com.hishiel.quick4j.demo.entity.User;

/**
 * @author Hishiel
 * @create 2016年11月17日下午11:41:37
 */
public interface UserService extends BaseService<User, Long> {

	/**
	 * 用户登录验证查询
	 * 
	 * @param user
	 * @return
	 */
	User authentication(User user);

	/**
	 * 根据用户名查询用户信息
	 * 
	 * @param username
	 * @return
	 */
	User selectByUsername(String username);
}
