package com.example.sina.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTabHost;

import com.example.sina.fragment.HomeFragment;
import com.example.sina.fragment.MessageFragment;
import com.example.sina.fragment.ProfileFragment;
import com.example.sina.R;

public class HomePageActivity extends BaseActivity {



    private Class[] fragment;
    private FrameLayout container;
    private FragmentTabHost tabHost;
    private RadioButton rbhome;
    private RadioButton rbmsg;
    private RadioButton rbmy;
    private RadioGroup rgTab;
    private int menu_id=R.menu.menu_home;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getToolBarx().setDisplayHomeAsUpEnabled(false).setTitle(R.string.lbl_home);
        fragment=new Class[]{HomeFragment.class, MessageFragment.class, ProfileFragment.class};
        initialize();


    }


    @Override
    public int getLayoutId() {
        return R.layout.layout_homepage;
    }

    private void initialize() {
        container = findViewById(R.id.container);
        tabHost = findViewById(R.id.tabHost);
        rbhome = findViewById(R.id.rb_home);
        rbmsg =findViewById(R.id.rb_msg);
        rbmy =  findViewById(R.id.rb_my);
        rgTab = findViewById(R.id.rgTab);
        tabHost.setup(getApplicationContext(),getSupportFragmentManager(),R.id.container);
        for (int i = 0; i < fragment.length; i++) {
            TabHost.TabSpec tabSpec=tabHost.newTabSpec(String.valueOf(i)).setIndicator(String.valueOf(i));

            tabHost.addTab(tabSpec,fragment[i],null);
        }
        tabHost.setCurrentTab(0);
        rgTab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_home:
                        getToolBarx().setTitle(R.string.lbl_home);
                        tabHost.setCurrentTab(0);
                        menu_id=R.menu.menu_home;

                        break;
                    case R.id.rb_msg:
                        getToolBarx().setTitle(R.string.lbl_message);
                        tabHost.setCurrentTab(1);
                        menu_id=-1;
                        break;
                    case R.id.rb_my:
                        getToolBarx().setTitle(R.string.lbl_profile);
                        tabHost.setCurrentTab(2);
                        menu_id=-1;
                        break;
                }
                supportInvalidateOptionsMenu();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu_id==-1)
            menu.clear();
        else getMenuInflater().inflate(menu_id,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return true;
    }
}
