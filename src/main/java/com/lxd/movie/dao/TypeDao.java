package com.lxd.movie.dao;

import com.lxd.movie.bean.Type;

import java.util.List;

public interface TypeDao {
    int addType(String TypeName);
    int deleteType(int TypeId);
    List<Type> selectTypeAll();
    Type selectTypeById(int id);
}
