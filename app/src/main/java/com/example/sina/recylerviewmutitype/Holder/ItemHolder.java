package com.example.sina.recylerviewmutitype.Holder;


import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sina.recylerviewmutitype.Item.Item;

public abstract class ItemHolder extends RecyclerView.ViewHolder {
    public ItemHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void setData(Item itemdata, Context context);
}
