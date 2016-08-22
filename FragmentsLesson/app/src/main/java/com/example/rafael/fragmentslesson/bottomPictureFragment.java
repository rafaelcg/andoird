package com.example.rafael.fragmentslesson;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rafael on 13/06/2016.
 */
public class bottomPictureFragment extends android.support.v4.app.Fragment {

    TextView tvTopText, tvBottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        tvTopText = (TextView) view.findViewById(R.id.tvTopText);
        tvBottomText = (TextView) view.findViewById(R.id.tvBottomText);



        return view;
    }

    public void setMemeText(String top, String bottom){
        tvTopText.setText(top);
        tvBottomText.setText(bottom);
    }
}
