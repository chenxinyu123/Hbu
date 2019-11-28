package com.example.sina.view;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.sina.R;

public class ToolBarx {
    private Toolbar mtoolbar;
    private AppCompatActivity appCompatActivity;
    private ActionBar mActionBar;
    private RelativeLayout rlcustom;
    public ToolBarx(Toolbar mtoolbar, AppCompatActivity appCompatActivity) {


        this.mtoolbar = mtoolbar;
        this.appCompatActivity = appCompatActivity;
        rlcustom=mtoolbar.findViewById(R.id.toolbarcustom);
        this.appCompatActivity.setSupportActionBar(this.mtoolbar);
        mActionBar=this.appCompatActivity.getSupportActionBar();
        if (mActionBar != null) {
            mActionBar.setDisplayHomeAsUpEnabled(true);
        }
        mtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appCompatActivity.finish();
            }
        });

    }
    public ToolBarx setTitle(String text){
        mActionBar.setTitle(text);
        return this;
    }
    public ToolBarx SetSubTitle(String text){
        mActionBar.setSubtitle(text);
        return this;
    }
    public ToolBarx setTitle(int text){
        mActionBar.setTitle(text);
        return this;
    }
    public ToolBarx SetSubTitle(int text){
        mActionBar.setSubtitle(text);
        return this;
    }
    public ToolBarx setNavigationOnClickListener(View.OnClickListener listener){
        mtoolbar.setNavigationOnClickListener(listener);
        return this;
    }
    public ToolBarx setNavigationIcon(int ResId){
        mtoolbar.setNavigationIcon(ResId);
        return this;
    }
    public ToolBarx setDisplayHomeAsUpEnabled(Boolean show){
        mActionBar.setDisplayHomeAsUpEnabled(show);
        return this;
    }
    public ToolBarx setCustomView(View view){
        rlcustom.removeAllViews();
        rlcustom.addView(view);
        return this;
    }
    public ToolBarx hide(){
        mActionBar.hide();
        return this;
    }
}
