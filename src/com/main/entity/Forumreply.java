package com.main.entity;

/**
 * @author gyc
 *
 */
public class Forumreply {
    private String replyid;//�ظ�ID

    private String replyneirong;//��������

    private String replytime;//����ʱ��

    private String replyhand;//������ͷ��

    private String replytieziid;//�ظ����ӵ�ID

    private String replyname;//�ظ��˵�����

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