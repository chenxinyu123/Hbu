package com.example.sina.recylerviewmutitype.Adapter;


import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sina.recylerviewmutitype.Factory.ItemHolderFactory;
import com.example.sina.recylerviewmutitype.Holder.ItemHolder;
import com.example.sina.recylerviewmutitype.Item.Item;

import java.util.List;

public class MultiListAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Item> items;
    private Context context;

    public MultiListAdapter(Context context,List<Item> items) {
        this.context=context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return ItemHolderFactory.getItemHolder(viewGroup, i);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
        itemHolder.setData(items.get(i),context);
        itemHolder.itemView.setTag(i);

    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setSpanCount(GridLayoutManager gridLayoutManager) {
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                return getItemViewType(i);
            }
        });
    }


}
