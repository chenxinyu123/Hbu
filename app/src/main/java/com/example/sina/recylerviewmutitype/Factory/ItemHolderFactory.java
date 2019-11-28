package com.example.sina.recylerviewmutitype.Factory;

import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.example.sina.R;
import com.example.sina.recylerviewmutitype.Holder.ItemHolder;
import com.example.sina.recylerviewmutitype.Holder.LargeItemHolder;
import com.example.sina.recylerviewmutitype.Holder.SamllItemHolder;
import com.example.sina.recylerviewmutitype.Holder.TitleBarItemHolder;


public class ItemHolderFactory {


    public static final int ITEM_LARGE = 3;
    public static final int ITEM_SMALL = 2;
    public static final int ITEM_TITLE_BAR = 6;

    public static ItemHolder getItemHolder(ViewGroup viewGroup, int Type){
        switch (Type){
            default:
            case ITEM_LARGE:
                return new LargeItemHolder(LayoutInflater
                        .from(viewGroup.getContext()).inflate(R.layout.item_large, viewGroup, false));
            case ITEM_SMALL:
                return new SamllItemHolder(LayoutInflater
                        .from(viewGroup.getContext()).inflate(R.layout.item_small, viewGroup, false));
            case ITEM_TITLE_BAR:
                return new TitleBarItemHolder(LayoutInflater
                        .from(viewGroup.getContext()).inflate(R.layout.item_title_bar, viewGroup, false));

        }




    }
}
