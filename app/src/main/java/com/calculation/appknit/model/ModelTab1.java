package com.calculation.appknit.model;

public class ModelComment {
    int img;
    String title,description,time;

    public ModelComment() {
    }

    public ModelComment(int img, String title, String description, String time) {
        this.img = img;
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
