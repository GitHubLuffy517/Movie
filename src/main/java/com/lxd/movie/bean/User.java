package com.lxd.movie.bean;

public class User {
    private int MemberId;
    private String UserName;
    private String UserPwd;
    private String Tel;
    private String QQ;
    private String Email;
    private String Sex;
    private String RegTime;
    private int LoginCount;

    @Override
    public String toString() {
        return "User{" +
                "MemberId=" + MemberId +
                ", UserName='" + UserName + '\'' +
                ", UserPwd='" + UserPwd + '\'' +
                ", Tel='" + Tel + '\'' +
                ", QQ='" + QQ + '\'' +
                ", Email='" + Email + '\'' +
                ", Sex='" + Sex + '\'' +
                ", RegTime='" + RegTime + '\'' +
                ", LoginCount=" + LoginCount +
                '}';
    }

    public User() {
    }

    public User(int memberId, String userName, String userPwd, String tel, String QQ, String email, String sex, String regTime, int loginCount) {
        MemberId = memberId;
        UserName = userName;
        UserPwd = userPwd;
        Tel = tel;
        this.QQ = QQ;
        Email = email;
        Sex = sex;
        RegTime = regTime;
        LoginCount = loginCount;
    }

    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPwd() {
        return UserPwd;
    }

    public void setUserPwd(String userPwd) {
        UserPwd = userPwd;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getRegTime() {
        return RegTime;
    }

    public void setRegTime(String regTime) {
        RegTime = regTime;
    }

    public int getLoginCount() {
        return LoginCount;
    }

    public void setLoginCount(int loginCount) {
        LoginCount = loginCount;
    }
}
