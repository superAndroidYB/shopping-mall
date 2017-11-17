package com.small.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.small.user.model.SysMenu;

public interface SysMenuJpaDao extends JpaRepository<SysMenu, Integer>{

}
