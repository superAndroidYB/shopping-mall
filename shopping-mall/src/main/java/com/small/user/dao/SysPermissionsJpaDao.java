package com.small.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.small.user.model.SysPermissions;

public interface SysPermissionsJpaDao extends JpaRepository<SysPermissions, Integer>{
	

}
