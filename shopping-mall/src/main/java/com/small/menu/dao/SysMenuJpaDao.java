package com.small.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.small.menu.model.SysMenu;

public interface SysMenuJpaDao extends JpaRepository<SysMenu, Integer>{

}
