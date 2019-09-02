package com.lxd.movie.service.impl;

import com.lxd.movie.bean.User;
import com.lxd.movie.dao.UserDao;
import com.lxd.movie.dao.impl.UserDaoImpl;
import com.lxd.movie.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(int memberid) {
        return userDao.deleteUser(memberid);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public List<User> selectUserAll() {
        List<User> list = userDao.selectUserAll();
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public User selectUserById(int MemberId) {
        User user = userDao.selectUserById(MemberId);
        if (user != null) {
            return user;
        }
        return null;
    }
}
