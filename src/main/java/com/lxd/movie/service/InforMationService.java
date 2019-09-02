package com.lxd.movie.service;

import com.lxd.movie.bean.InforMation;

import java.util.List;

public interface InforMationService {
    int addInfo(InforMation inforMation);
    int addAdvance(InforMation inforMation);
    int deleteInfo(int MovieId);
    int updateInfo(InforMation inforMation);
    int updateAdvance(String MovieName,String Content);
    int deleteAdvance(String MovieName);
    List<InforMation> selectInfoAll();
    InforMation selectInfoById(int MovieId);
    List<InforMation> selectAdvance();
    List<InforMation> selectAdvanceNull();
}
