package com.main.entity;

/**
 * @date 2018-07-18
 */
public class User {
    private String userid;//�û�ID

    private String usermingzi;//�û���ʵ����

    private String username;//�û���

    private String usersex;//�Ա�

    private String password;//����

    private String userhand;//ͷ��

    private String useraddress;

    private String userphone;

    private String userqq;
    
	private String useremail;

    private String usercollection;

    private String useryinghangka;//���п�

    private String userstate;//״̬

    private String userlogintime;//����¼ʱ��

    private String userip;//��¼IP��ַ

    private String userpaypassword;//֧������

    private String userrmb;//�û����

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsermingzi() {
        return usermingzi;
    }

    public void setUsermingzi(String usermingzi) {
        this.usermingzi = usermingzi == null ? null : usermingzi.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserhand() {
        return userhand;
    }

    public void setUserhand(String userhand) {
        this.userhand = userhand == null ? null : userhand.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUserqq() {
        return userqq;
    }

    public void setUserqq(String userqq) {
        this.userqq = userqq == null ? null : userqq.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUsercollection() {
        return usercollection;
    }

    public void setUsercollection(String usercollection) {
        this.usercollection = usercollection == null ? null : usercollection.trim();
    }

    public String getUseryinghangka() {
        return useryinghangka;
    }

    public void setUseryinghangka(String useryinghangka) {
        this.useryinghangka = useryinghangka == null ? null : useryinghangka.trim();
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate == null ? null : userstate.trim();
    }

    public String getUserlogintime() {
        return userlogintime;
    }

    public void setUserlogintime(String userlogintime) {
        this.userlogintime = userlogintime == null ? null : userlogintime.trim();
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public String getUserpaypassword() {
        return userpaypassword;
    }

    public void setUserpaypassword(String userpaypassword) {
        this.userpaypassword = userpaypassword == null ? null : userpaypassword.trim();
    }

    public String getUserrmb() {
        return userrmb;
    }

    public void setUserrmb(String userrmb) {
        this.userrmb = userrmb == null ? null : userrmb.trim();
    }
}