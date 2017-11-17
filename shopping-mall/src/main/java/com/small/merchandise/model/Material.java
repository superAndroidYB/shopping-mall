package com.small.merchandise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.small.common.BaseEntity;

@Entity
@Table(name="material")
public class Material extends BaseEntity{

	@Column(name = "mat_type",columnDefinition="varchar(1) comment '素材类型'")
	private String type;
	
	@Column(name = "mat_url",columnDefinition="text comment 'url'")
	private String url;
	
	@Column(name = "mat_content",columnDefinition="text comment '文字描述'")
	private String content;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Material [type=" + type + ", url=" + url + ", content=" + content + "]";
	}
	
}
