package com.hishiel.quick4j.demo.dao;

import java.util.List;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.demo.entity.Permission;

/**
 * 权限DAO接口
 * 
 * @author hishiel
 * @since 2016年11月18日上午10:10:15
 */
public interface PermissionDao extends BaseDao<Permission, Long> {

	/**
	 * 通过角色ID查询用户拥有的权限信息
	 */
	List<Permission> selectPermissionsByRoleId(Long roleId);
}
