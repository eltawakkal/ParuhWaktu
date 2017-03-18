package com.example.eltawakkal.paruhwaktu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.eltawakkal.paruhwaktu.AdapterListView;
import com.example.eltawakkal.paruhwaktu.R;

/**
 * Created by eltawakkal on 3/17/17.
 */

public class tabHome extends Fragment {

    AdapterListView adapter;

    String[] title = new  String[10];
    String[] desc = new String[10];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_home, container, false);

        addData();
        adapter = new AdapterListView(getActivity(), title, desc);
        ListView mListHome = (ListView) view.findViewById(R.id.mListHome);
        mListHome.setAdapter(adapter);

        return view;
    }

    public void addData(){
        title[0] = "Ini title 1";
        title[1] = "Ini title 2";
        title[2] = "Ini title 3";
        title[3] = "Ini title 4";
        title[4] = "Ini title 5";
        title[5] = "Ini title 6";
        title[6] = "Ini title 7";
        title[7] = "Ini title 8";
        title[8] = "Ini title 9";
        title[9] = "Ini title 10";

        desc[0] = "Ini description 1";
        desc[1] = "Ini description 2";
        desc[2] = "Ini description 3";
        desc[3] = "Ini description 4";
        desc[4] = "Ini description 5";
        desc[5] = "Ini description 6";
        desc[6] = "Ini description 7";
        desc[7] = "Ini description 8";
        desc[8] = "Ini description 9";
        desc[9] = "Ini description 10";
    }
}
