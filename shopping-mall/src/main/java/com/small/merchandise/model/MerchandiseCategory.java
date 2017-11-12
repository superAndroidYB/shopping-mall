package com.small.merchandise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name = "merchan_cate")
public class MerchandiseCategory extends BaseEntity{

	@Column(name="cate_name",columnDefinition="varchar(50) comment '分类名称'")
	public String cateName;
	
	@Column(name="cate_desc",columnDefinition="varchar(50) comment '分类描述'")
	public String cateDesc;

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getCateDesc() {
		return cateDesc;
	}

	public void setCateDesc(String cateDesc) {
		this.cateDesc = cateDesc;
	}

	@Override
	public String toString() {
		return "MerchandiseCategory [cateName=" + cateName + ", cateDesc=" + cateDesc + "]";
	}
	
	
	
}
