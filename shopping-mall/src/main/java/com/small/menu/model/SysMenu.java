package com.small.menu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name = "sys_menu")
public class SysMenu extends BaseEntity{

	

	@Column(name = "menu_name", columnDefinition = "varchar(200)  default null comment '菜单名称'")
	private String menuName;

	@Column(name = "menu_href", columnDefinition = "varchar(1000)  default null comment '菜单链接'")
	private String menuHref;

	@Column(name = "postion", columnDefinition = "varchar(1)  default null comment '位置：0横菜单，1竖菜单'")
	private String postion;
	
	@Column(name = "target", columnDefinition = "varchar(1000)  default null comment '同<a>标签的target属性'")
	private String target;
	
	@Column(name = "parent_id", columnDefinition = "int default null comment '父级菜单'")
	private Integer parentId;
	
	
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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}
