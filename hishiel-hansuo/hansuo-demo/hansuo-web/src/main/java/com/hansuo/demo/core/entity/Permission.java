package com.hansuo.demo.core.entity;

/**
 * 权限实体类
 * 
 * @author hishiel
 * @since Oct 31, 20165:18:52 PM
 */
public class Permission {

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

	// TODO 实际上线后需debug掉
	@Override
	public String toString() {
		return "User [id=" + id + ", permissionName=" + permissionName + ", permissionSign=" + permissionSign
				+ ", description=" + description + "]";
	}
}
