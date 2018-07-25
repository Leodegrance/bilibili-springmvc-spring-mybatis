package com.main.entity;

/**
 * 
 * @author gyc
 *
 */
public class Forum {
    private String forumid; //文章ID

    private String forumbt; //文章标题

    private String forummessage; //文章内容

    private String forumusername; //发布人名字

    private String forumtime; //发布时间

    private String forumliebie; //发布类别

    private String forumamount; // 帖子浏览量

    private String firumhand; //头像

    public String getForumid() {
        return forumid;
    }

    public void setForumid(String forumid) {
        this.forumid = forumid == null ? null : forumid.trim();
    }

    public String getForumbt() {
        return forumbt;
    }

    public void setForumbt(String forumbt) {
        this.forumbt = forumbt == null ? null : forumbt.trim();
    }

    public String getForummessage() {
        return forummessage;
    }

    public void setForummessage(String forummessage) {
        this.forummessage = forummessage == null ? null : forummessage.trim();
    }

    public String getForumusername() {
        return forumusername;
    }

    public void setForumusername(String forumusername) {
        this.forumusername = forumusername == null ? null : forumusername.trim();
    }

    public String getForumtime() {
        return forumtime;
    }

    public void setForumtime(String forumtime) {
        this.forumtime = forumtime == null ? null : forumtime.trim();
    }

    public String getForumliebie() {
        return forumliebie;
    }

    public void setForumliebie(String forumliebie) {
        this.forumliebie = forumliebie == null ? null : forumliebie.trim();
    }

    public String getForumamount() {
        return forumamount;
    }

    public void setForumamount(String forumamount) {
        this.forumamount = forumamount == null ? null : forumamount.trim();
    }

    public String getFirumhand() {
        return firumhand;
    }

    public void setFirumhand(String firumhand) {
        this.firumhand = firumhand == null ? null : firumhand.trim();
    }
}