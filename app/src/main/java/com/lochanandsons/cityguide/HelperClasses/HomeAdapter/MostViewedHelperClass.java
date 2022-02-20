package com.lochanandsons.cityguide.HelperClasses.HomeAdapter;

public class MostViewedHelperClass {

    int imageView;
    String textView;

    public MostViewedHelperClass(int image, String title) {
        this.imageView = image;
        this.textView = title;

    }
    public int getImageView() {
        return imageView;
    }

    public String getTextView() {
        return textView;
    }
}
