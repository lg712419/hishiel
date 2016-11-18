package com.hansuo.demo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.base.BaseServiceImpl;
import com.hansuo.demo.core.dao.PermissionDao;
import com.hansuo.demo.core.entity.Permission;
import com.hansuo.demo.core.service.PermissionService;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission, Long> implements PermissionService {

	@Autowired
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
