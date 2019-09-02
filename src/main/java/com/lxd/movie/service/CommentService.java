package com.lxd.movie.service;

import com.lxd.movie.bean.Comment;

import java.util.List;

public interface CommentService {
    int addComment(Comment comment);
    int deleteComment(int CommentId);
    int deleteCommentByMovieId(int MovieId);
    int updateComment(Comment comment);
    List<Comment> selectCommentAll();
    Comment selectCommentById(int CommentId);
}
