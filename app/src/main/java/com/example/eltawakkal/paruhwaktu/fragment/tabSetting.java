package com.example.eltawakkal.paruhwaktu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eltawakkal.paruhwaktu.R;

/**
 * Created by eltawakkal on 3/17/17.
 */

public class tabSetting extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_setting, container, false);
        return view;
    }
}
