package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.User;
import com.lxd.movie.dao.UserDao;
import com.lxd.movie.mapper.UserMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) {
        String sql = "insert into user(UserName,UserPwd,Tel,QQ,Email,Sex,RegTime,LoginCount) values(?,?,?,?,?,?,?,?)";
        return DBUtil.executeUpdate(sql, user.getUserName(), user.getUserPwd()
                , user.getTel(), user.getQQ(), user.getEmail(), user.getSex(), user.getRegTime(), user.getLoginCount());
    }

    @Override
    public int deleteUser(int MemberId) {
        String sql = "delete from user where MemberId=?";
        return DBUtil.executeUpdate(sql, MemberId);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set UserPwd=?,Tel=?,QQ=?,Email=?,Sex=? where MemberId=?";
        return DBUtil.executeUpdate(sql, user.getUserPwd(), user.getTel(), user.getQQ(),
                user.getEmail(), user.getSex(), user.getMemberId());
    }

    @Override
    public List<User> selectUserAll() {
        String sql = "select * from user";
        List list = DBUtil.executeQuery(sql, new UserMapper(), null);
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public User selectUserById(int MemberId) {
        String sql = "select * from user where MemberId=?";
        List list = DBUtil.executeQuery(sql, new UserMapper(), MemberId);
        if (list != null) {
            return ((User) list.get(0));
        }
        return null;
    }
}
