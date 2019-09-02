package com.lxd.movie.service;

import com.lxd.movie.bean.Admin;

import java.util.List;

public interface AdminService {
    int addAdmin(Admin admin);
    int deleteAdmin(int id);
    int updateAdmin(Admin admin);
    List<Admin> selectAdminAll();
    Admin selectAdminByName(String adminName);
    int adminLogin(String UserName,String Pwd);
    int adminLoginCheck(String username);
}
