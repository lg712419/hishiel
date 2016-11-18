package com.hishiel.quick4j.demo.service;

import java.util.List;

import com.hishiel.quick4j.base.BaseService;
import com.hishiel.quick4j.demo.entity.Permission;

/**
 * @author hishiel
 * @since 2016年11月18日上午10:39:22
 */
public interface PermissionService extends BaseService<Permission, Long> {

	/**
	 * 通过角色ID查询用户拥有的权限信息
	 */
	List<Permission> selectPermissionsByRoleId(Long roleId);
}
