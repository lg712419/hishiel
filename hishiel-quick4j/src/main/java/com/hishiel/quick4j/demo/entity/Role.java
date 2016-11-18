package com.hishiel.quick4j.demo.entity;

import java.io.Serializable;

/**
 * 角色实体类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:47:08
 */
public class Role implements Serializable {

	private static final long serialVersionUID = -1392026492712353652L;

	private Long id;
	private String roleName;
	private String roleSign;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleSign() {
		return roleSign;
	}

	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role[id = " + id + ", roleName = " + roleName + ", roleSign = " + roleSign + ", description = "
				+ description + "]";
	}
}
