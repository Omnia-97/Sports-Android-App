package com.example.thesportsapp;

public class Sport {
    String titleText;
    int image;

    public Sport(String titleText, int image) {
        this.titleText = titleText;
        this.image = image;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
