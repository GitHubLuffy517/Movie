package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.Poster;
import com.lxd.movie.dao.PosterDao;
import com.lxd.movie.mapper.PosterMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class PosterDaoImpl implements PosterDao {

    public void addPoster(Poster Poster) {
        String sql = "insert into poster (MovieId, MovieName, PostDescription, PostAddress) values(?, ?, ?, ?)";
        DBUtil.executeUpdate(sql, Poster.getMovieId(), Poster.getMovieName(), Poster.getPostDescription(), Poster.getPostAddress());
    }

    public void deletePoster(int PosterId) {
        String sql = "delete from poster where PostId = ?";
        DBUtil.executeUpdate(sql, PosterId);
    }

    public List<Poster> selectAll() {
        String sql = "select * from poster";
        List list = DBUtil.executeQuery(sql, new PosterMapper(), null);
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public void updatePoster(String PostDescription, int PosterId) {
        String sql = "update poster set PostDescription=? where PostId=?";
        DBUtil.executeUpdate(sql, PostDescription, PosterId);
    }
}