package com.small.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Where;

import com.small.user.model.SysUser;

@Where(clause = "delete_flag='N'")
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "create_user",columnDefinition="int default null comment '创建人'")
	private SysUser createUser;
	
	@Column(name = "create_time", columnDefinition = "DATETIME default NOW() comment '创建时间'")
	private Date createTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modify_user",columnDefinition="int default null comment '修改人'")
	private SysUser modifyUser;
	
	@Column(name = "modify_time", columnDefinition = "DATETIME default null comment '修改时间'")
	private Date modifyTime;
	
	@Column(name = "delete_flag", columnDefinition = "varchar(1) default 'N' comment '软删除标识'")
	private String deleteFlag;
	

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SysUser getCreateUser() {
		return createUser;
	}

	public void setCreateUser(SysUser createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public SysUser getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(SysUser modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	

}
