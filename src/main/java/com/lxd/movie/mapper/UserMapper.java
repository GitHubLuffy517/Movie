package com.lxd.movie.mapper;

import com.lxd.movie.bean.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        User user = new User();
        user.setMemberId(rs.getInt("MemberId"));
        user.setUserName(rs.getString("UserName"));
        user.setUserPwd(rs.getString("UserPwd"));
        user.setTel(rs.getString("Tel"));
        user.setSex(rs.getString("Sex"));
        user.setRegTime(rs.getString("RegTime"));
        user.setQQ(rs.getString("QQ"));
        user.setLoginCount(rs.getInt("LoginCount"));
        user.setEmail(rs.getString("Email"));
        return user;
    }
}
