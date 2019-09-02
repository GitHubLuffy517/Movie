package com.lxd.movie.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.lxd.movie.bean.Comment;
import com.lxd.movie.dao.CommentDao;
import com.lxd.movie.dao.impl.CommentDaoImpl;
import com.lxd.movie.service.CommentService;

public class CommentServiceImpl implements CommentService {

    private CommentDao comd = new CommentDaoImpl();

    public int addComment(Comment comm) {
        comm.setSubmitTime(getDate());
        return comd.addComment(comm);
    }

    private String getDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }

    public List<Comment> selectCommentAll() {
        return comd.selectCommentAll();
    }

    public Comment selectCommentById(int id) {
        return comd.selectCommentById(id);
    }

    public int updateComment(Comment comm) {
        return comd.updateComment(comm);
    }

    public int deleteComment(int id) {
        return comd.deleteComment(id);
    }

    @Override
    public int deleteCommentByMovieId(int MovieId) {
        return comd.deleteCommentByMovieId(MovieId);
    }
}