package com.small.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name = "sys_user")
public class SysUser extends BaseEntity{
	
	@Column(name="user_name",columnDefinition="varchar(500) comment '用户名称'")
	private String userName;
	
	@Column(name="user_password",columnDefinition="varchar(50) comment '用户密码'")
	private String userPassword;
	
	@Column(name="user_phone",columnDefinition="varchar(15) comment '用户手机号'")
	private String userPhone;

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
}
