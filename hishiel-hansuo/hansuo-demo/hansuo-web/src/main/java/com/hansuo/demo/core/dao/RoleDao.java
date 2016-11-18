package com.hansuo.demo.core.dao;

import java.util.List;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.core.entity.Role;

public interface RoleDao extends BaseDao<Role, Long> {

	/**
	 * 根据用户id获取用户拥有的角色
	 */
	List<Role> selectRolesByUserId(Long userId);

}
