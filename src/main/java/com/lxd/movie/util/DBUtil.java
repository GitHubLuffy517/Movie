package com.lxd.movie.util;

import com.lxd.movie.mapper.RowMapper;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    private static PreparedStatement ps = null;

    //    封装更新语句
    public static int executeUpdate(String sql, Object... params) {
        int a;
        Connection conn;
        conn = null;
        try {
            conn = DBconn.getConn();
            ps = conn.prepareStatement(sql);
//            获取参数个数
            for (int i = 0; i < params.length; i++) {
//                将参数放进占位符中
                ps.setObject(i + 1, params[i]);
            }
            try {
                a = ps.executeUpdate();
            } catch (MySQLIntegrityConstraintViolationException e) {
                a = -2;
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            psClose();
            try {
                if (conn == null) {
                    throw new AssertionError();
                }
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    //    封装查询语句，可变参数
    public static List executeQuery(String sql, RowMapper rowMapper, Object... params) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        try {
            conn = DBconn.getConn();
            ps = conn.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) ps.setObject((i + 1), params[i]);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object obj = rowMapper.rowMapper(rs);
                list.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            psClose();
            try {
                assert conn != null;
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (list.size() > 0 && list != null) {
            return list;
        }
        return null;
    }

    private static void psClose() {
        try {
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
