package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.InforMation;
import com.lxd.movie.dao.InforMationDao;
import com.lxd.movie.mapper.InfoMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class InformationDaoImpl implements InforMationDao {
    @Override
    public int addInfo(InforMation inforMation) {
        String sql = "insert into information(MovieName,TypeId,DaoYan,ZhuYan,ShowTime,PicAddress,Content,AddTime,Hits,MovieScore,Vote) values(?,?,?,?,?,?,?,?,?,?,?)";
        return DBUtil.executeUpdate(sql, inforMation.getMovieName(), inforMation.getTypeId(),
                inforMation.getDaoYan(), inforMation.getZhuYan(),
                inforMation.getShowTime(), inforMation.getPicAddress(),
                inforMation.getContent(), inforMation.getAddTime(),
                inforMation.getHits(), inforMation.getMovieScore(), inforMation.getVote());
    }

    @Override
    public int deleteInfo(int MovieId) {
        String sql = "delete from information where MovieId=?";
        return DBUtil.executeUpdate(sql, MovieId);
    }

    @Override
    public int updateInfo(InforMation inforMation) {
        String sql = "update information set DaoYan=?,ZhuYan=?,Vote=?,TypeId=? where MovieId=?";
        return DBUtil.executeUpdate(sql, inforMation.getDaoYan(), inforMation.getZhuYan(), inforMation.getVote(),inforMation.getTypeId(),inforMation.getMovieId());
    }

    @Override
    public List<InforMation> selectInfoAll() {
        String sql = "select * from information";
        List list = DBUtil.executeQuery(sql, new InfoMapper(), null);
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public InforMation selectInfoById(int MovieId) {
        String sql = "select * from information where MovieId=?";
        List list = DBUtil.executeQuery(sql, new InfoMapper(), MovieId);
        if (list != null || list.size() == 0) {
            return ((InforMation) list.get(0));
        }
        return null;
    }

    @Override
    public List<InforMation> selectAdvance() {
        String sql = "select * from information where Content is not null";
        List list = DBUtil.executeQuery(sql, new InfoMapper());
        if (list == null || list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override
    public int updateAdvance(String MovieName, String Content) {
        String sql = "update information set Content=? where MovieName=?";
        return DBUtil.executeUpdate(sql, Content, MovieName);
    }

    @Override
    public int deleteAdvance(String MovieName) {
        String sql = "update information set Content=null where MovieName=?";
        return DBUtil.executeUpdate(sql, MovieName);
    }

    @Override
    public List<InforMation> selectAdvanceNull() {
        String sql = "select * from information where Content is  null";
        List<InforMation> advanceNullList = DBUtil.executeQuery(sql, new InfoMapper(), null);
        if (advanceNullList == null || advanceNullList.size() == 0) {
            return null;
        }
        return advanceNullList;
    }

    @Override
    public int addAdvance(InforMation inforMation) {
        String sql = "update information set Content=?,AudioAddress=?,ShowTime=? where MovieId=?";
        return DBUtil.executeUpdate(sql, inforMation.getContent(), inforMation.getAudioAddress(), inforMation.getShowTime(), inforMation.getMovieId());
    }
}
