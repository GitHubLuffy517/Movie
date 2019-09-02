package com.lxd.movie.service.impl;

import com.lxd.movie.bean.Admin;
import com.lxd.movie.dao.AdminDao;
import com.lxd.movie.dao.impl.AdminDaoImpl;
import com.lxd.movie.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public int addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    @Override
    public int deleteAdmin(int id) {
        return adminDao.deleteAdmin(id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    @Override
    public List<Admin> selectAdminAll() {
        List<Admin> list = adminDao.selectAdminAll();
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public Admin selectAdminByName(String adminName) {
        Admin admin = adminDao.selectAdminByName(adminName);
        if (admin != null) {
            return admin;
        }
        return null;
    }

    @Override
    public int adminLogin(String UserName, String Pwd) {
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.selectAdminByName(UserName);
        if (admin != null) {
            if (admin.getPwd().equals(Pwd)) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int adminLoginCheck(String username) {
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.selectAdminByName(username);
        if (admin != null) {
            return 1;
        }
        return 0;
    }
}
