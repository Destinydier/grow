package com.my.entity;

public class GcHotelWithBLOBs extends GcHotel {
    private String remark;

    private byte[] logo;

    private String htmlInfo;

    private String mapHtml;

    private String hotelPolicy;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getHtmlInfo() {
        return htmlInfo;
    }

    public void setHtmlInfo(String htmlInfo) {
        this.htmlInfo = htmlInfo;
    }

    public String getMapHtml() {
        return mapHtml;
    }

    public void setMapHtml(String mapHtml) {
        this.mapHtml = mapHtml;
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }
}