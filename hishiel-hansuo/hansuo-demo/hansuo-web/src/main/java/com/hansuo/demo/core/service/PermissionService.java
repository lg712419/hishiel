package com.hansuo.demo.core.service;

import java.util.List;

import com.hansuo.demo.base.BaseService;
import com.hansuo.demo.core.entity.Permission;

/**
 * 权限服务接口
 * 
 * @author hishiel
 * @since Oct 31, 20165:25:33 PM
 */
public interface PermissionService extends BaseService<Permission, Long> {

	/**
	 * 根据角色id获取角色拥有的权限
	 */
	List<Permission> selectPermissionsByRoleId(Long roleId);
}
