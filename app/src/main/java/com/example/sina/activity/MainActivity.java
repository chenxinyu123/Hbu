package com.example.sina.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.RequiresApi;

import com.example.sina.R;
import com.example.sina.view.ToolBarx;

public class MainActivity extends BaseActivity {

    private ToolBarx mtoolbarx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mtoolbarx=getToolBarx();
        mtoolbarx.setTitle(R.string.sina).SetSubTitle(R.string.SubTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home,menu);
        return true;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
