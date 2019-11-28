package com.example.sina.fragment;

import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.sina.R;

import java.util.Objects;

public class BaseFragment extends Fragment {


    @Override
    public void startActivity(Intent intent) {
        Objects.requireNonNull(getActivity()).startActivity(intent);
        getActivity().overridePendingTransition(R.anim.anim_in_right_left, R.anim.anim_out_right_left);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        Objects.requireNonNull(getActivity()).startActivityForResult(intent,requestCode);
        getActivity().overridePendingTransition(R.anim.anim_in_right_left, R.anim.anim_out_right_left);
    }
}
