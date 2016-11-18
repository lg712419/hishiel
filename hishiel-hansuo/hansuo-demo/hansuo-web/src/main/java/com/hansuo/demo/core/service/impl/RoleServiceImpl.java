package com.hansuo.demo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansuo.demo.base.BaseDao;
import com.hansuo.demo.base.BaseServiceImpl;
import com.hansuo.demo.core.dao.RoleDao;
import com.hansuo.demo.core.entity.Role;
import com.hansuo.demo.core.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public BaseDao<Role, Long> getDao() {
		return roleDao;
	}

	@Override
	public List<Role> selectRolesByUserId(Long userId) {
		return roleDao.selectRolesByUserId(userId);
	}

}
