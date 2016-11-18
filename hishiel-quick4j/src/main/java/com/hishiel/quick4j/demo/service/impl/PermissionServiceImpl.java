package com.hishiel.quick4j.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.base.BaseServiceImpl;
import com.hishiel.quick4j.demo.dao.PermissionDao;
import com.hishiel.quick4j.demo.entity.Permission;
import com.hishiel.quick4j.demo.service.PermissionService;

/**
 * @author hishiel
 * @since 2016年11月18日上午10:40:43
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission, Long> implements PermissionService {

	private PermissionDao permissionDao;

	@Override
	public BaseDao<Permission, Long> getDao() {
		return permissionDao;
	}

	@Override
	public List<Permission> selectPermissionsByRoleId(Long roleId) {
		return permissionDao.selectPermissionsByRoleId(roleId);
	}

}
