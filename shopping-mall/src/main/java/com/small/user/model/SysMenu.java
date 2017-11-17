package com.small.user.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name = "sys_menu")
public class SysMenu extends BaseEntity{

	@Column(name = "menu_name", columnDefinition = "varchar(200)  default null comment '菜单名称'")
	private String menuName;

	@Column(name = "menu_href", columnDefinition = "varchar(1000)  default null comment '菜单链接'")
	private String menuHref;
	
	@Column(name = "menu_icon", columnDefinition = "varchar(1000)  default null comment '菜单Icon'")
	private String menuIcon;

	@Column(name = "postion", columnDefinition = "varchar(1)  default null comment '位置：0横菜单，1竖菜单'")
	private String postion;
	
	@Column(name = "target", columnDefinition = "varchar(1000)  default null comment '同<a>标签的target属性'")
	private String target;
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_id",columnDefinition = "int(11) comment '父级菜单'")
	private SysMenu parentMenu;
	
	@OneToMany(mappedBy = "parentMenu", fetch = FetchType.EAGER)
	private List<SysMenu> chlidMenus;
	
	@OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
	private List<SysPermissions> permiss;
	
	
	
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuHref() {
		return menuHref;
	}

	public void setMenuHref(String menuHref) {
		this.menuHref = menuHref;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public SysMenu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(SysMenu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public List<SysMenu> getChlidMenus() {
		return chlidMenus;
	}

	public void setChlidMenus(List<SysMenu> chlidMenus) {
		this.chlidMenus = chlidMenus;
	}
	
	

	public List<SysPermissions> getPermiss() {
		return permiss;
	}

	public void setPermiss(List<SysPermissions> permiss) {
		this.permiss = permiss;
	}

	@Override
	public String toString() {
		return "SysMenu [menuName=" + menuName + ", menuHref=" + menuHref + ", menuIcon=" + menuIcon + ", postion="
				+ postion + ", target=" + target + ", parentMenu=" + parentMenu + ", chlidMenus=" + chlidMenus
				+ ", permiss=" + permiss + "]";
	}

}
