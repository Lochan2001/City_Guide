package com.lochanandsons.cityguide.HelperClasses.HomeAdapter;


import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass  {
            int imageView;
            String textView;
            Drawable relativeLayout;

    public CategoriesHelperClass(int image, String title, int gardient) {
        this.imageView = image;
        this.textView = title;


    }

    public CategoriesHelperClass(GradientDrawable gradient1, int school_image, String education) {
    }


    public int getImage() {
        return imageView;
    }

    public String getTitile() {
        return textView;
    }

    public Drawable getGradient() {

        return relativeLayout;
    }
}
