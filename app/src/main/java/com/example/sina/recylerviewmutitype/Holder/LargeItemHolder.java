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
import com.example.sina.recylerviewmutitype.Item.ItemLarge;


public class LargeItemHolder extends ItemHolder {
    private ImageView imageView;
    private TextView mTitle,mSubTitle;
    public LargeItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.item_image);
        mTitle=itemView.findViewById(R.id.item_title);
        mSubTitle=itemView.findViewById(R.id.item_sub_title);
        itemView.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
    @Override
    public void setData(Item itemdata, Context context) {
        ItemLarge item = (ItemLarge) itemdata;
        Glide.with(context).load(item.getUrl()).into(imageView);
        mTitle.setText(item.getmTitle());
        mSubTitle.setText(item.getmSubTitle());
    }


}
