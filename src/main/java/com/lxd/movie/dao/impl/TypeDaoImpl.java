package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.Type;
import com.lxd.movie.dao.TypeDao;
import com.lxd.movie.mapper.TypeMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class TypeDaoImpl implements TypeDao {
    @Override
    public int addType(String TypeName) {
        String sql = "insert into type(TypeName) values(?)";
        return DBUtil.executeUpdate(sql, TypeName);
    }

    @Override
    public int deleteType(int TypeId) {
        String sql = "delete from type where TypeId=?";
        return DBUtil.executeUpdate(sql, TypeId);
    }

    @Override
    public List<Type> selectTypeAll() {
        String sql = "select * from type";
        List list = DBUtil.executeQuery(sql, new TypeMapper(), null);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    @Override
    public Type selectTypeById(int id) {
        String sql = "select * from type where TypeId=?";
        List<Type> typeList = DBUtil.executeQuery(sql, new TypeMapper(), id);
        if (typeList != null && typeList.size() > 0) {
            Type type = typeList.get(0);
            return type;
        }
        return null;
    }
}
