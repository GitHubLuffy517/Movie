package com.lxd.movie.mapper;

import com.lxd.movie.bean.Poster;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PosterMapper implements RowMapper {

    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        Poster photo = new Poster();
        photo.setMovieId(rs.getInt("MovieId"));
        photo.setMovieName(rs.getString("MovieName"));
        photo.setPostId(rs.getInt("PostId"));
        photo.setPostDescription(rs.getString("PostDescription"));
        photo.setPostAddress(rs.getString("PostAddress"));
        return photo;
    }
}