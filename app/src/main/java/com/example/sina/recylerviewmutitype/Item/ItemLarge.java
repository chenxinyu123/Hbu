package com.example.sina.recylerviewmutitype.Item;

import android.graphics.Bitmap;

import com.example.sina.recylerviewmutitype.Factory.ItemHolderFactory;


public class ItemLarge implements Item {
    private String url;
    private String mTitle,mSubTitle;

    public ItemLarge(String url, String mTitle, String mSubTitle) {
        this.url = url;
        this.mTitle = mTitle;
        this.mSubTitle = mSubTitle;
    }

    public String getUrl() {
        return url;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    @Override
    public int getType() {
        return ItemHolderFactory.ITEM_LARGE;
    }
}
