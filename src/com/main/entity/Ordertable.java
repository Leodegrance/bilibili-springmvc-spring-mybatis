package com.main.entity;

/**
 * 
 * @author gyc
 *
 */
public class Ordertable {
    private String orderid;//订单ID

    private String orderusername;//订单人名字

    private String orderigridsname;//订单商品名字

    private String ordergridsimg;//订单商品图片

    private String orderzongrmb;//订单总价格

    private String orderstate;//订单状态
    private String ordertime;//订单时间

    private String orderaddr;//订单收货地址

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderusername() {
        return orderusername;
    }

    public void setOrderusername(String orderusername) {
        this.orderusername = orderusername == null ? null : orderusername.trim();
    }

    public String getOrderigridsname() {
        return orderigridsname;
    }

    public void setOrderigridsname(String orderigridsname) {
        this.orderigridsname = orderigridsname == null ? null : orderigridsname.trim();
    }

    public String getOrdergridsimg() {
        return ordergridsimg;
    }

    public void setOrdergridsimg(String ordergridsimg) {
        this.ordergridsimg = ordergridsimg == null ? null : ordergridsimg.trim();
    }

    public String getOrderzongrmb() {
        return orderzongrmb;
    }

    public void setOrderzongrmb(String orderzongrmb) {
        this.orderzongrmb = orderzongrmb == null ? null : orderzongrmb.trim();
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getOrderaddr() {
        return orderaddr;
    }

    public void setOrderaddr(String orderaddr) {
        this.orderaddr = orderaddr == null ? null : orderaddr.trim();
    }
}