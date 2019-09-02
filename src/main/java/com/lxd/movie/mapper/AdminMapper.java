package com.lxd.movie.mapper;

import com.lxd.movie.bean.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminMapper implements RowMapper {
    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        Admin admin = new Admin();
        admin.setId(rs.getInt("Id"));
        admin.setTitle(rs.getString("Title"));
        admin.setUserName(rs.getString("UserName"));
        admin.setPwd(rs.getString("Pwd"));
        admin.setLastTime(rs.getDate("LastTime"));
        admin.setAddTime(rs.getDate("AddTime"));
        admin.setLogCount(rs.getInt("LogCount"));
        return admin;
    }
}
