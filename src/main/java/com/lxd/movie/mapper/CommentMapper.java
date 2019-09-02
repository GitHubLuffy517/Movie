package com.lxd.movie.mapper;

import com.lxd.movie.bean.Comment;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper{

	@Override
	public Object rowMapper(ResultSet rs) throws SQLException {
		Comment comment = new Comment();
		comment.setId(rs.getInt("CommentId"));
		comment.setMovieId(rs.getInt("MovieId"));
		comment.setAuthor(rs.getString("CommentUser"));
		comment.setCommentContent(rs.getString("CommentContent"));
		comment.setSubmitTime(rs.getString("CommentTime"));
		comment.setCommentReply(rs.getString("CommentReply"));
		comment.setCommentTitle(rs.getString("CommentTitle"));
		return comment;
	}
}