package com.main.entity;

public class Grids {

    private String gridsid;


    private String girdsname;


    private String girdsjiage;


    private String girdsimg;


    private Integer girdskucun;

    public String getGridsid() {
        return gridsid;
    }

    public void setGridsid(String gridsid) {
        this.gridsid = gridsid == null ? null : gridsid.trim();
    }

    public String getGirdsname() {
        return girdsname;
    }

    public void setGirdsname(String girdsname) {
        this.girdsname = girdsname == null ? null : girdsname.trim();
    }

    public String getGirdsjiage() {
        return girdsjiage;
    }

    public void setGirdsjiage(String girdsjiage) {
        this.girdsjiage = girdsjiage == null ? null : girdsjiage.trim();
    }

    public String getGirdsimg() {
        return girdsimg;
    }

    public void setGirdsimg(String girdsimg) {
        this.girdsimg = girdsimg == null ? null : girdsimg.trim();
    }

    public Integer getGirdskucun() {
        return girdskucun;
    }

    public void setGirdskucun(Integer girdskucun) {
        this.girdskucun = girdskucun;
    }
    
}