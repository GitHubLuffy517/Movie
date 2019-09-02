package com.lxd.movie.service;

import com.lxd.movie.bean.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(int memberid);
    int updateUser(User user);
    List<User> selectUserAll();
    User selectUserById(int memberid);
}
