package com.lxd.movie.dao;

import com.lxd.movie.bean.Comment;

import java.util.List;

public interface CommentDao {
    int addComment(Comment comment);
    int deleteComment(int CommentId);
    int deleteCommentByMovieId(int movieId);
    int updateComment(Comment comment);
    List<Comment> selectCommentAll();
    Comment selectCommentById(int CommentId);
}
