package entity;

public class GcHotelGroupWithBLOBs extends GcHotelGroup {
    private String remark;

    private byte[] logo;

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
}