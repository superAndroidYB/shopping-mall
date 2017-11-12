package com.small.merchandise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name = "merchandise")
public class Merchandise extends BaseEntity{

	@Column(name = "merc_name", columnDefinition = "varchar(200)  default null comment '名称'")
	private String merchanName;
	
	@Column(name = "merc_desc", columnDefinition = "varchar(1000)  default null comment '描述'")
	private String merchanDesc;
	
	@Column(name = "merc_weight", columnDefinition = "varchar(1000)  default null comment '重量'")
	private String merchanWeight;
	
	@Column(name = "merc_weight_unit", columnDefinition = "varchar(10)  default null comment '重量单位：克，毫克'")
	private String merchanWeightUnit;
	
	@Column(name = "merc_color", columnDefinition = "varchar(50)  default null comment '颜色描述'")
	private String merchanColor;
	
	@Column(name = "merc_shape", columnDefinition = "varchar(50)  default null comment '形状'")
	private String merchanShape;
	
	@Column(name = "merc_polis", columnDefinition = "varchar(50)  default null comment '抛光'")
	private String merchanPolishing;
	
	@Column(name = "merchan_cut", columnDefinition = "varchar(50)  default null comment '切工'")
	private String merchanCut;
	
	@Column(name = "merchan_fluor", columnDefinition = "varchar(50)  default null comment '荧光'")
	private String merchanFluorescent;

	public String getMerchanName() {
		return merchanName;
	}

	public void setMerchanName(String merchanName) {
		this.merchanName = merchanName;
	}

	public String getMerchanDesc() {
		return merchanDesc;
	}

	public void setMerchanDesc(String merchanDesc) {
		this.merchanDesc = merchanDesc;
	}

	public String getMerchanWeight() {
		return merchanWeight;
	}

	public void setMerchanWeight(String merchanWeight) {
		this.merchanWeight = merchanWeight;
	}

	public String getMerchanWeightUnit() {
		return merchanWeightUnit;
	}

	public void setMerchanWeightUnit(String merchanWeightUnit) {
		this.merchanWeightUnit = merchanWeightUnit;
	}

	public String getMerchanColor() {
		return merchanColor;
	}

	public void setMerchanColor(String merchanColor) {
		this.merchanColor = merchanColor;
	}

	public String getMerchanShape() {
		return merchanShape;
	}

	public void setMerchanShape(String merchanShape) {
		this.merchanShape = merchanShape;
	}

	public String getMerchanPolishing() {
		return merchanPolishing;
	}

	public void setMerchanPolishing(String merchanPolishing) {
		this.merchanPolishing = merchanPolishing;
	}

	public String getMerchanCut() {
		return merchanCut;
	}

	public void setMerchanCut(String merchanCut) {
		this.merchanCut = merchanCut;
	}

	public String getMerchanFluorescent() {
		return merchanFluorescent;
	}

	public void setMerchanFluorescent(String merchanFluorescent) {
		this.merchanFluorescent = merchanFluorescent;
	}

	@Override
	public String toString() {
		return "Merchandise [merchanName=" + merchanName + ", merchanDesc=" + merchanDesc + ", merchanWeight="
				+ merchanWeight + ", merchanWeightUnit=" + merchanWeightUnit + ", merchanColor=" + merchanColor
				+ ", merchanShape=" + merchanShape + ", merchanPolishing=" + merchanPolishing + ", merchanCut="
				+ merchanCut + ", merchanFluorescent=" + merchanFluorescent + "]";
	}
	
	
}
