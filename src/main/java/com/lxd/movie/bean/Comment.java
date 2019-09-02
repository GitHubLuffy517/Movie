package com.lxd.movie.bean;

public class Comment {

    private int id;
    private String movieName;
    private int movieId;
    private String commentContent;
    private String commentTitle;
    private String commentReply;
    private String author;
    private String submitTime;
    private String movieType;

    public Comment() {
        super();
    }

    public Comment(int id, String movieName, int movieId, String commentContent, String commentTitle, String author,
                   String readNum, String submitTime, String movieType) {
        super();
        this.id = id;
        this.movieName = movieName;
        this.movieId = movieId;
        this.commentContent = commentContent;
        this.commentTitle = commentTitle;
        this.author = author;
        this.submitTime = submitTime;
        this.movieType = movieType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMovieId(int id) {
        this.movieId = id;
    }

    public int getMovieId() {
        return this.movieId;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getCommentReply() {
        return commentReply;
    }

    public void setCommentReply(String commentReply) {
        this.commentReply = commentReply;
    }

    @Override
    public String toString() {
        return "Comment [id=" + id + ", movieName=" + movieName + ", movieId=" + movieId + ", commentContent="
                + commentContent + ", commentTitle=" + commentTitle + ", author=" + author + ", submitTime="
                + submitTime + ", movieType=" + movieType + "]";
    }
}