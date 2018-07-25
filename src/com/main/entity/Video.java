package com.main.entity;

/**
 *  视频ID
	视频名字
	视频图片
	视频地址
	视频时长
	收藏
	视频留言
	视频上传时间
	视频状态
	视频类别
 * @date 2018-07-18
 */
public class Video {
    private String videoid;

    private String videoname;

    private String videoimage;

    private String videoaddress;

    private String videolooktime;

    private String videocollection;

    private String videoleaving;

    private String videotime;

    private String videostate;

    private String videocategory;

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid == null ? null : videoid.trim();
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideoimage() {
        return videoimage;
    }

    public void setVideoimage(String videoimage) {
        this.videoimage = videoimage == null ? null : videoimage.trim();
    }

    public String getVideoaddress() {
        return videoaddress;
    }

    public void setVideoaddress(String videoaddress) {
        this.videoaddress = videoaddress == null ? null : videoaddress.trim();
    }

    public String getVideolooktime() {
        return videolooktime;
    }

    public void setVideolooktime(String videolooktime) {
        this.videolooktime = videolooktime == null ? null : videolooktime.trim();
    }

    public String getVideocollection() {
        return videocollection;
    }

    public void setVideocollection(String videocollection) {
        this.videocollection = videocollection == null ? null : videocollection.trim();
    }

    public String getVideoleaving() {
        return videoleaving;
    }

    public void setVideoleaving(String videoleaving) {
        this.videoleaving = videoleaving == null ? null : videoleaving.trim();
    }

    public String getVideotime() {
        return videotime;
    }

    public void setVideotime(String videotime) {
        this.videotime = videotime == null ? null : videotime.trim();
    }

    public String getVideostate() {
        return videostate;
    }

    public void setVideostate(String videostate) {
        this.videostate = videostate == null ? null : videostate.trim();
    }

    public String getVideocategory() {
        return videocategory;
    }

    public void setVideocategory(String videocategory) {
        this.videocategory = videocategory == null ? null : videocategory.trim();
    }
}