package com.hishiel.quick4j.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hishiel.quick4j.base.BaseDao;
import com.hishiel.quick4j.base.BaseServiceImpl;
import com.hishiel.quick4j.demo.dao.RoleDao;
import com.hishiel.quick4j.demo.entity.Role;
import com.hishiel.quick4j.demo.service.RoleService;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService {

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
