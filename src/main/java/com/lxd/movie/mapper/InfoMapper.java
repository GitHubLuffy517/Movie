package com.lxd.movie.mapper;

import com.lxd.movie.bean.InforMation;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoMapper implements RowMapper {
    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        InforMation inforMation=new InforMation();
        inforMation.setAddTime(rs.getDate("AddTime"));
        inforMation.setContent(rs.getString("Content"));
        inforMation.setDaoYan(rs.getString("DaoYan"));
        inforMation.setHits(rs.getInt("Hits"));
        inforMation.setMovieId(rs.getInt("MovieId"));
        inforMation.setPicAddress(rs.getString("PicAddress"));
        inforMation.setShowTime(rs.getString("ShowTime"));
        inforMation.setZhuYan(rs.getString("ZhuYan"));
        inforMation.setTypeId(rs.getInt("TypeId"));
        inforMation.setMovieName(rs.getString("MovieName"));
        inforMation.setMovieScore(rs.getInt("MovieScore"));
        inforMation.setVote(rs.getString("Vote"));
        inforMation.setAudioAddress(rs.getString("AudioAddress"));
        return inforMation;
    }
}
