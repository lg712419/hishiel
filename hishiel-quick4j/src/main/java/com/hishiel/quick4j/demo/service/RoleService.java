package com.hishiel.quick4j.demo.service;

import java.util.List;

import com.hishiel.quick4j.base.BaseService;
import com.hishiel.quick4j.demo.entity.Role;

/**
 * @author hishiel
 * @since 2016年11月18日上午10:32:44
 */
public interface RoleService extends BaseService<Role, Long> {

	/**
	 * 通过用户ID查询用户拥有的角色信息
	 */
	List<Role> selectRolesByUserId(Long userId);
}
