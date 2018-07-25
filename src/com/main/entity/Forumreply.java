package com.main.entity;

/**
 * @author gyc
 *
 */
public class Forumreply {
    private String replyid;//回复ID

    private String replyneirong;//回帖内容

    private String replytime;//回帖时间

    private String replyhand;//回帖人头像

    private String replytieziid;//回复帖子的ID

    private String replyname;//回复人的名字

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid == null ? null : replyid.trim();
    }

    public String getReplyneirong() {
        return replyneirong;
    }

    public void setReplyneirong(String replyneirong) {
        this.replyneirong = replyneirong == null ? null : replyneirong.trim();
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime == null ? null : replytime.trim();
    }

    public String getReplyhand() {
        return replyhand;
    }

    public void setReplyhand(String replyhand) {
        this.replyhand = replyhand == null ? null : replyhand.trim();
    }

    public String getReplytieziid() {
        return replytieziid;
    }

    public void setReplytieziid(String replytieziid) {
        this.replytieziid = replytieziid == null ? null : replytieziid.trim();
    }

    public String getReplyname() {
        return replyname;
    }

    public void setReplyname(String replyname) {
        this.replyname = replyname == null ? null : replyname.trim();
    }
}