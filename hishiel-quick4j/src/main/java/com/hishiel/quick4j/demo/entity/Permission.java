package com.hishiel.quick4j.demo.entity;

import java.io.Serializable;

/**
 * 权限实体类
 * 
 * @author Hishiel
 * @create 2016年11月17日下午11:47:08
 */
public class Permission implements Serializable {

	private static final long serialVersionUID = -5862645293744943262L;

	private Long id;
	private String permissionName;
	private String permissionSign;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionSign() {
		return permissionSign;
	}

	public void setPermissionSign(String permissionSign) {
		this.permissionSign = permissionSign;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "permission[id = " + id + ", permissionName = " + permissionName + ", permissionSign = " + permissionSign
				+ ", description = " + description + "]";
	}
}
