package com.hansuo.demo.core.service;

import java.util.List;

import com.hansuo.demo.base.BaseService;
import com.hansuo.demo.core.entity.Role;

/**
 * 角色服务接口
 * 
 * @author hishiel
 * @since Oct 31, 20163:35:54 PM
 */
public interface RoleService extends BaseService<Role, Long> {

	/**
	 * 根据用户id获取用户拥有的角色
	 */
	List<Role> selectRolesByUserId(Long userId);
}
