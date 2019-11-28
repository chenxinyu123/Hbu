package com.example.sina.recylerviewmutitype.Item;

import com.example.sina.recylerviewmutitype.Factory.ItemHolderFactory;



public class ItemTitleBar implements Item {
    private String mTitle, mMore;

    public ItemTitleBar(String mTitle, String mMore) {
        this.mTitle = mTitle;
        this.mMore = mMore;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmMore() {
        return mMore;
    }

    @Override
    public int getType() {
        return ItemHolderFactory.ITEM_TITLE_BAR;
    }
}
