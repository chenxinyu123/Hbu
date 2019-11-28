package com.example.sina.recylerviewmutitype.Holder;


import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.sina.R;
import com.example.sina.recylerviewmutitype.Item.Item;
import com.example.sina.recylerviewmutitype.Item.ItemTitleBar;

public class TitleBarItemHolder extends ItemHolder {
    private TextView title_bar, more;

    public TitleBarItemHolder(@NonNull View itemView) {
        super(itemView);
        title_bar = itemView.findViewById(R.id.title_bar);
        more = itemView.findViewById(R.id.more);
        itemView.setOnClickListener(onClickListener);
    }

    @Override
    public void setData(Item itemdata, Context context) {
        ItemTitleBar item = (ItemTitleBar) itemdata;
        title_bar.setText(item.getmTitle());
        more.setText(item.getmMore());
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
}
