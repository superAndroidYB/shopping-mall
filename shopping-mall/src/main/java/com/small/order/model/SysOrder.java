package com.small.order.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.small.common.BaseEntity;
import com.small.merchandise.model.Merchandise;
import com.small.user.model.SysUser;

@Entity
@Table(name = "sys_order")
public class SysOrder extends BaseEntity{
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
	@JoinColumn(name = "merchandise_id", columnDefinition="int comment '订单商品编号'")
	private Merchandise merchandise;
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
	@JoinColumn(name = "user_id", columnDefinition="int comment '订单用户编号'")
	private SysUser user;
	
	@Column(name="amt", columnDefinition="DECIMAL(18,2) comment '订单金额'")
	private BigDecimal amt;
	
	@Column(name="unit_price", columnDefinition="DECIMAL(18,2) comment '订单单价'")
	private BigDecimal unitPrice;
	
	@Column(name="num", columnDefinition="int(11) default 1 comment '商品数量'")
	private int num;
	
	@Column(name="type", columnDefinition="varchar(1) comment '订单类型'")
	private String type;
	
	@Column(name="status", columnDefinition="varchar(1) comment '订单状态'")
	private String status;
	
	@Column(name="remark", columnDefinition="varchar(200) comment '下单备注'")
	private String remark;

	@Column(name="consignee_name", columnDefinition="varchar(50) comment '收货人姓名'")
	private String consigneeName;
	
	@Column(name="consignee_adress", columnDefinition="varchar(500) comment '收货人地址'")
	private String consigneeAdress;
	
	@Column(name="consignee_tel", columnDefinition="varchar(11) comment '收货人手机号'")
	private String consigneeTel;

	public Merchandise getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneeAdress() {
		return consigneeAdress;
	}

	public void setConsigneeAdress(String consigneeAdress) {
		this.consigneeAdress = consigneeAdress;
	}

	public String getConsigneeTel() {
		return consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	@Override
	public String toString() {
		return "SysOrder [merchandise=" + merchandise + ", user=" + user + ", amt=" + amt + ", unitPrice=" + unitPrice
				+ ", num=" + num + ", type=" + type + ", status=" + status + ", remark=" + remark + ", consigneeName="
				+ consigneeName + ", consigneeAdress=" + consigneeAdress + ", consigneeTel=" + consigneeTel + "]";
	}
	
	
	
}
