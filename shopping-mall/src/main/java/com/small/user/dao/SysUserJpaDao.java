package com.small.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.small.user.model.SysUser;

public interface SysUserJpaDao extends JpaRepository<SysUser, Integer>{

	SysUser findByUserNameOrUserPhone(String userName,String userPhone);
}
