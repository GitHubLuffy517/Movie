package com.lxd.movie.bean;

import java.sql.Date;

public class InforMation {
    private int MovieId;
    private String MovieName;
    private int TypeId;
    private String DaoYan;
    private String ZhuYan;
    private String ShowTime;
    private String PicAddress;
    private String Content;
    private Date AddTime;
    private int Hits;
    private String Vote;
    private int MovieScore;
    private String AudioAddress;

    public String getAudioAddress() {
        return AudioAddress;
    }

    public void setAudioAddress(String audioAddress) {
        AudioAddress = audioAddress;
    }

    public String getVote() {
        return Vote;
    }

    public void setVote(String vote) {
        Vote = vote;
    }

    public int getMovieScore() {
        return MovieScore;
    }

    public void setMovieScore(int movieScore) {
        MovieScore = movieScore;
    }

    public int getMovieId() {
        return MovieId;
    }

    public void setMovieId(int movieId) {
        MovieId = movieId;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public String getDaoYan() {
        return DaoYan;
    }

    public void setDaoYan(String daoYan) {
        DaoYan = daoYan;
    }

    public String getZhuYan() {
        return ZhuYan;
    }

    public void setZhuYan(String zhuYan) {
        ZhuYan = zhuYan;
    }

    public String getShowTime() {
        return ShowTime;
    }

    public void setShowTime(String showTime) {
        ShowTime = showTime;
    }

    public String getPicAddress() {
        return PicAddress;
    }

    public void setPicAddress(String picAddress) {
        PicAddress = picAddress;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public int getHits() {
        return Hits;
    }

    public void setHits(int hits) {
        Hits = hits;
    }
}
