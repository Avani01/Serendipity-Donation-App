package com.example.serendipitydonationapp.money.pod;

public class Pod_org {
    private String name, imgURL, siteURL;

    public Pod_org(String name, String imgURL, String siteURL){
        this.name = name;
        this.imgURL = imgURL;
        this.siteURL = siteURL;
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

    public String getSiteURL() {
        return siteURL;
    }

    public void setSiteURL(String siteURL) {
        this.siteURL = siteURL;
    }

    @Override
    public String toString() {
        return "Pod_org{" +
                "name='" + name + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", siteURL='" + siteURL + '\'' +
                '}';
    }
}
