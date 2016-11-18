package com.hansuo.demo.core.dao;

import java.util.List;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.core.entity.Permission;

public interface PermissionDao extends BaseDao<Permission, Long> {

	/**
	 * 根据角色id获取角色拥有的权限
	 */
	List<Permission> selectPermissionsByRoleId(Long roleId);

}
