package com.small.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.small.common.BaseEntity;

@Entity
@Table(name = "sys_permissions")
public class SysPermissions extends BaseEntity{

	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_id",columnDefinition= "int(11) comment '菜单编号'")
	private SysMenu menu;
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",columnDefinition= "int(11) comment '用户编号'")
	private SysUser user;

	public SysMenu getMenu() {
		return menu;
	}

	public void setMenu(SysMenu menu) {
		this.menu = menu;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SysPermissions [menu=" + menu + ", user=" + user + "]";
	}
}
