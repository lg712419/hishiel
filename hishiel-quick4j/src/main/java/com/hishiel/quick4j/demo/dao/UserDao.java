package com.hishiel.quick4j.demo.dao;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.demo.entity.User;

/**
 * 用户DAO接口
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:52:18
 */
public interface UserDao extends BaseDao<User, Long> {

	/**
	 * 用户登录验证查询
	 */
	User authentication(User user);

}
