package com.lxd.movie.dao.impl;

import com.lxd.movie.bean.Comment;
import com.lxd.movie.dao.CommentDao;
import com.lxd.movie.mapper.CommentMapper;
import com.lxd.movie.util.DBUtil;

import java.util.List;

public class CommentDaoImpl implements CommentDao {

    public int addComment(Comment comment) {
        String sql = "insert into comment(CommentTitle, MovieId,"
                + " CommentContent, CommentUser, CommentTime)"
                + " values (?, ?, ?, ?, ?);";
        int a = DBUtil.executeUpdate(sql, comment.getCommentTitle(),
                comment.getMovieId(), comment.getCommentContent(),
                comment.getAuthor(), comment.getSubmitTime());
        return a;
    }

    public int deleteComment(int id) {
        String sql = "delete from comment where CommentId = ?";
        int a = DBUtil.executeUpdate(sql, id);
        return a;
    }

    public int updateComment(Comment comment) {
        String sql = "update comment set CommentTitle = ?,"
                + " MovieId = ?, CommentContent = ?, CommentUser = ?"
                + " where CommentId = ?;";
        int a = DBUtil.executeUpdate(sql, comment.getCommentTitle(),
                comment.getMovieId(), comment.getCommentContent(),
                comment.getAuthor(), comment.getId());
        return a;
    }

    public List selectCommentAll() {
        String sql = "select * from comment;";
        List commlist = DBUtil.executeQuery(sql, new CommentMapper(), null);
        if (commlist == null || commlist.size() == 0) {
            return null;
        }
        {
            return commlist;
        }
    }

    public Comment selectCommentById(int id) {
        String sql = "select * from comment where CommentId = ?";
        List<Comment> commlist = DBUtil.executeQuery(sql, new CommentMapper(), id);
        Comment comm = commlist.get(0);
        return comm;
    }

    @Override
    public int deleteCommentByMovieId(int movieId) {
        String sql = "delete from comment where MovieId = ?";
        int a = DBUtil.executeUpdate(sql, movieId);
        return a;
    }
}