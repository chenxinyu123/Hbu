package com.example.sina.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.sina.R;
import com.example.sina.view.ToolBarx;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public abstract class BaseActivity extends AppCompatActivity {


    @BindView(R.id.rlContent)
    RelativeLayout rlContent;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private ToolBarx mtoolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        ButterKnife.bind(this);
        View view = getLayoutInflater().inflate(getLayoutId(), rlContent, false);
        rlContent.addView(view);

        mtoolbar=new ToolBarx(toolbar,this);
    }

    public abstract int getLayoutId();

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.anim_in_right_left, R.anim.anim_out_right_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_in_left_right, R.anim.anim_out_left_right);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        overridePendingTransition(R.anim.anim_in_right_left, R.anim.anim_out_right_left);
    }
    public ToolBarx getToolBarx(){
        if (this.mtoolbar==null){
            mtoolbar=new ToolBarx(toolbar,this);
        }
        return mtoolbar;
    }
    @OnClick(R.id.rlContent)
    public void onViewClicked() {

    }
}
