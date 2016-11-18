package com.hansuo.demo.core.service;

import com.hansuo.demo.base.BaseService;
import com.hansuo.demo.core.entity.User;

/**
 * 用户服务接口
 * 
 * @author hishiel
 * @since Oct 31, 20163:35:54 PM
 */
public interface UserService extends BaseService<User, Long> {

	/**
	 * 用户验证
	 */
	User authentication(User user);

	/**
	 * 根据用户名查询用户信息
	 */
	User selectByUsername(String username);

}
