package com.lxd.movie.service.impl;

import com.lxd.movie.bean.InforMation;
import com.lxd.movie.dao.InforMationDao;
import com.lxd.movie.dao.impl.InformationDaoImpl;
import com.lxd.movie.service.InforMationService;

import java.util.List;

public class InformationServiceImpl implements InforMationService {
    private InforMationDao inforMationDao = new InformationDaoImpl();

    @Override
    public int addInfo(InforMation inforMation) {
        return inforMationDao.addInfo(inforMation);
    }

    @Override
    public int deleteInfo(int MovieId) {
        return inforMationDao.deleteInfo(MovieId);
    }

    @Override
    public int updateInfo(InforMation inforMation) {
        return inforMationDao.updateInfo(inforMation);
    }

    @Override
    public List<InforMation> selectInfoAll() {
        List<InforMation> list = inforMationDao.selectInfoAll();
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override
    public InforMation selectInfoById(int MovieId) {
        InforMation inforMation = inforMationDao.selectInfoById(MovieId);
        if (inforMation != null) {
            return inforMation;
        }
        return null;
    }

    @Override
    public List<InforMation> selectAdvance() {
        List<InforMation> advanceList = inforMationDao.selectAdvance();
        if (advanceList == null || advanceList.size() == 0) {
            return null;
        }
        return advanceList;
    }

    @Override
    public int updateAdvance(String MovieName, String Content) {
        return inforMationDao.updateAdvance(MovieName, Content);
    }

    @Override
    public int deleteAdvance(String MovieName) {
        return inforMationDao.deleteAdvance(MovieName);
    }

    @Override
    public List<InforMation> selectAdvanceNull() {
        return inforMationDao.selectAdvanceNull();
    }

    @Override
    public int addAdvance(InforMation inforMation) {
        return inforMationDao.addAdvance(inforMation);
    }
}
