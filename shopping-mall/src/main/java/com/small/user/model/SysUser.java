package com.small.user.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Where;

import com.small.common.BaseEntity;

@Entity
@Table(name = "sys_user")
@Where(clause = "delete_flag='N'")
public class SysUser extends BaseEntity {

	@Column(name = "user_name", columnDefinition = "varchar(500) comment '用户名称'")
	private String userName;

	@Column(name = "user_password", columnDefinition = "varchar(50) comment '用户密码'")
	private String userPassword;

	@Column(name = "user_phone", columnDefinition = "varchar(15) comment '用户手机号'")
	private String userPhone;

	@Column(name = "role", columnDefinition = "varchar(500) comment '用户角色，0,普通用户；1,代理用户,2,普通用户'")
	private String role;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<SysPermissions> permiss;

	@Transient
	private String randomCode;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}

	public List<SysPermissions> getPermiss() {
		return permiss;
	}

	public void setPermiss(List<SysPermissions> permiss) {
		this.permiss = permiss;
	}

	@Override
	public String toString() {
		return "SysUser [userName=" + userName + ", userPassword=" + userPassword + ", userPhone=" + userPhone
				+ ", role=" + role + ", permiss=" + permiss + ", randomCode=" + randomCode + "]";
	}

}
