package com.calculation.appknit.model;

public class ModelTab1 {

    int banner,icon;
    String title,phone,address;

    public ModelTab1() {
    }

    public ModelTab1(int banner, int icon, String title, String phone, String address) {
        this.banner = banner;
        this.icon = icon;
        this.title = title;
        this.phone = phone;
        this.address = address;
    }

    public int getBanner() {
        return banner;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
