package com.example.sina.recylerviewmutitype.Holder;


import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.sina.R;
import com.example.sina.recylerviewmutitype.Item.Item;
import com.example.sina.recylerviewmutitype.Item.ItemSmall;

public class SamllItemHolder extends ItemHolder {
    private ImageView imageView;
    private TextView mTitle;
    public SamllItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.item_image1);
        mTitle=itemView.findViewById(R.id.item_title1);
        itemView.setOnClickListener(onClickListener);
    }

    @Override
    public void setData(Item itemdata, Context context) {
        ItemSmall item = (ItemSmall) itemdata;
        Glide.with(context).load(item.getString()).into(imageView);
        mTitle.setText(item.getmTitle());
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
}
