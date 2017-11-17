package com.small.common;

import org.apache.commons.lang3.StringUtils;

public class Constants {

	public static final String SPLIT_MARK = ",";

	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_VERCODE = "verCode";
	public static final String MENU_TOP = "0"; // 顶部菜单
	public static final String MENU_LEFT = "1";// 左侧菜单

	public static enum RoleType {
		ADMIN("0", "管理员"), PROXY("1", "代理用户"), USER("2", "普通用户");

		private RoleType(String code, String value) {
			this.code = code;
			this.value = value;
		}

		private String code;
		private String value;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getValueByCode(String code) {
			for (RoleType el : RoleType.values()) {
				if(StringUtils.equals(code, el.getCode())){
					return el.getValue();
				}
			}
			return null;
		}
	}
}
