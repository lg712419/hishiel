package com.hansuo.demo.core.dao;

import java.util.List;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.core.entity.User;

/**
 * 用户DAO接口
 * 
 * @author hishiel
 * @since Oct 31, 20165:04:03 PM
 */
public interface UserDao extends BaseDao<User, Long> {

	/**
	 * 用户登录验证查询
	 */
	User authentication(User user);

	/**
	 * 根据用户名查询用户信息
	 */
	User selectByUsername(String username);

}
