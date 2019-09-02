package com.lxd.movie.mapper;

import com.lxd.movie.bean.Type;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeMapper implements RowMapper {
    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        Type type = new Type();
        type.setTypeId(rs.getInt("TypeId"));
        type.setTypeName(rs.getString("TypeName"));
        return type;
    }
}
