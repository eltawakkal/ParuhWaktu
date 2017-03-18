package com.example.eltawakkal.paruhwaktu;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by eltawakkal on 3/18/17.
 */

public class AdapterListView extends ArrayAdapter<String> {

    Activity activity;
    String[] title;
    String[] disc;

    TextView txtTitle, txtDisc;

    public AdapterListView(Activity activity, String[] title, String[] disc){
        super(activity, R.layout.custom_listview, title);
        this.activity = activity;
        this.title = title;
        this.disc = disc;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_listview, null, false);

        txtTitle = (TextView) view.findViewById(R.id.txtTitle);
        txtDisc = (TextView) view.findViewById(R.id.txtDesc);

        txtTitle.setText(title[position]);
        txtDisc.setText(disc[position]);

        return view;
    }
}
