package com.lxd.movie.bean;

import java.sql.Date;

public class Admin {
    private int Id;
    private String Title;
    private String UserName;
    private String Pwd;
    private Date AddTime;
    private Date LastTime;
    private int LogCount;

    @Override
    public String toString() {
        return "Admin{" +
                "Id=" + Id +
                ", Title='" + Title + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", AddTime=" + AddTime +
                ", LastTime=" + LastTime +
                ", LogCount=" + LogCount +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public Date getLastTime() {
        return LastTime;
    }

    public void setLastTime(Date lastTime) {
        LastTime = lastTime;
    }

    public int getLogCount() {
        return LogCount;
    }

    public void setLogCount(int logCount) {
        LogCount = logCount;
    }

    public Admin() {
    }

    public Admin(int id, String title, String userName, String pwd, Date addTime, Date lastTime, int logCount) {
        Id = id;
        Title = title;
        UserName = userName;
        Pwd = pwd;
        AddTime = addTime;
        LastTime = lastTime;
        LogCount = logCount;
    }
}
