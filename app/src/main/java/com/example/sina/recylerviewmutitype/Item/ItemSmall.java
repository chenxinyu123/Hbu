package com.example.sina.recylerviewmutitype.Item;

import android.graphics.Bitmap;

import com.example.sina.recylerviewmutitype.Factory.ItemHolderFactory;


public class ItemSmall implements Item {
    private String string;
    private String mTitle;

    public ItemSmall(String string, String mTitle) {
        this.string = string;
        this.mTitle = mTitle;
    }

    public String getString() {
        return string;
    }

    public String getmTitle() {
        return mTitle;
    }

    @Override
    public int getType() {
        return ItemHolderFactory.ITEM_SMALL;
    }
}
