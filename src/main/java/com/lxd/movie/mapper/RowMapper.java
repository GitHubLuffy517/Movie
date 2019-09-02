package com.lxd.movie.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper {
	 Object rowMapper(ResultSet rs) throws SQLException;
}
