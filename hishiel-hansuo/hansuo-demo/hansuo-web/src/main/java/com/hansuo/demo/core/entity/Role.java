package com.hansuo.demo.core.entity;

/**
 * 角色实体类
 * 
 * @author hishiel
 * @since Oct 31, 20165:18:52 PM
 */
public class Role {

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

	// TODO 实际上线后需debug掉
	@Override
	public String toString() {
		return "User [id=" + id + ", roleName=" + roleName + ", roleSign=" + roleSign + ", description=" + description
				+ "]";
	}
}
