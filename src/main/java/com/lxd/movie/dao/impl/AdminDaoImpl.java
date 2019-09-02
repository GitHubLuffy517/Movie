package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.Admin;
import com.lxd.movie.dao.AdminDao;
import com.lxd.movie.mapper.AdminMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class AdminDaoImpl implements AdminDao {
    @Override
    public int addAdmin(Admin admin) {
        String sql = "insert into admin(Title,UserName,Pwd,AddTime,LastTime,LogCount) values(?,?,?,?,?,?)";
        return DBUtil.executeUpdate(sql, admin.getTitle(),
                admin.getUserName(), admin.getPwd(), admin.getAddTime(),
                admin.getLastTime(), admin.getLogCount());
    }

    @Override
    public int deleteAdmin(int Id) {
        String sql = "delete from admin where Id=?";
        return DBUtil.executeUpdate(sql, Id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        String sql = "update admin set Title=?,UserName=?,Pwd=?,AddTime=?,LastTime=?,LogCount=? where Id=?";
        return DBUtil.executeUpdate(sql, admin.getTitle(), admin.getUserName(), admin.getPwd(), admin.getAddTime(), admin.getLastTime(), admin.getLogCount(), admin.getId());
    }

    @Override
    public List<Admin> selectAdminAll() {
        String sql = "select * from admin";
        List list = DBUtil.executeQuery(sql, new AdminMapper(), null);
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public Admin selectAdminByName(String adminName) {
        String sql = "select * from admin where UserName=?";
        List list = DBUtil.executeQuery(sql, new AdminMapper(), adminName);
        if (list != null) {
            return ((Admin) list.get(0));
        }
        return null;
    }

}
