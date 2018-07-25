package com.main.entity;

public class Shoppingcart {
   
    private String cartid;


    private String username;


    private String shoopingid;


    private String shoopingname;

    private String shoopingimg;

    private String shoopingjiage;

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid == null ? null : cartid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getShoopingid() {
        return shoopingid;
    }

    public void setShoopingid(String shoopingid) {
        this.shoopingid = shoopingid == null ? null : shoopingid.trim();
    }

    public String getShoopingname() {
        return shoopingname;
    }

    public void setShoopingname(String shoopingname) {
        this.shoopingname = shoopingname == null ? null : shoopingname.trim();
    }

    public String getShoopingimg() {
        return shoopingimg;
    }

    public void setShoopingimg(String shoopingimg) {
        this.shoopingimg = shoopingimg == null ? null : shoopingimg.trim();
    }

    public String getShoopingjiage() {
        return shoopingjiage;
    }

    public void setShoopingjiage(String shoopingjiage) {
        this.shoopingjiage = shoopingjiage == null ? null : shoopingjiage.trim();
    }
}