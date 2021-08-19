package com.example.serendipitydonationapp.money;

public class Money_org {
    private String name, imgURL;

    public Money_org(String name, String imgURL){
        this.name = name;
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "Cloth_org{" +
                "name='" + name + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }
}
