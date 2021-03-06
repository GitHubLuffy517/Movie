package com.lxd.movie.dao;

import com.lxd.movie.bean.Admin;

import java.util.List;

public interface AdminDao {
    int addAdmin(Admin admin);

    int deleteAdmin(int id);

    int updateAdmin(Admin admin);

    List<Admin> selectAdminAll();

    Admin selectAdminByName(String adminName);


}
