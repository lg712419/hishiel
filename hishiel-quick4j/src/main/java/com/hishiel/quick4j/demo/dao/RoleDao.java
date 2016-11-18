package com.hishiel.quick4j.demo.dao;

import java.util.List;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.demo.entity.Role;

/**
 * 角色DAO接口
 * 
 * @author hishiel
 * @since 2016年11月18日上午9:47:21
 */
public interface RoleDao extends BaseDao<Role, Long> {

	/**
	 * 通过用户ID查询用户拥有的角色信息
	 */
	List<Role> selectRolesByUserId(Long userId);
}
