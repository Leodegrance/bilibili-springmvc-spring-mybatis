package com.main.entity;

/**
 * 
 * @date 2018-07-18
 */
public class Message {
	
    private String messageid;//����ID
    
    private String messagevideoid;//������ƵID
    
    private String messageuserid;//�����û�ID

    private String messageusername; // �����û�����

    private String message;//��������

    private String messagetime;//����ʱ��

    private String messagehand;//�û�ͷ��

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagevideoid() {
        return messagevideoid;
    }

    public void setMessagevideoid(String messagevideoid) {
        this.messagevideoid = messagevideoid == null ? null : messagevideoid.trim();
    }

    public String getMessageuserid() {
        return messageuserid;
    }

    public void setMessageuserid(String messageuserid) {
        this.messageuserid = messageuserid == null ? null : messageuserid.trim();
    }

    public String getMessageusername() {
        return messageusername;
    }

    public void setMessageusername(String messageusername) {
        this.messageusername = messageusername == null ? null : messageusername.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime == null ? null : messagetime.trim();
    }

    public String getMessagehand() {
        return messagehand;
    }

    public void setMessagehand(String messagehand) {
        this.messagehand = messagehand == null ? null : messagehand.trim();
    }
}