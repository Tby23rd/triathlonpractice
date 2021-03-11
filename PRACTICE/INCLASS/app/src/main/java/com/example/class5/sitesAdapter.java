package com.example.class5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class sitesAdapter extends BaseAdapter {
//think about the data the adapter needs
    List<String> sitesList;
    List<Integer> sitesPics;//cant be int as thats primitive and it only takes objects

    public sitesAdapter(List<String> sitesList, List<Integer> sitesPics) {
        this.sitesList = sitesList;
        this.sitesPics = sitesPics;
        //do not do sitesList = this.sitesList;
    }

    @Override
    public int getCount() {
        //return 0;//this corresponds to the size of the data
        return sitesList.size();//same size for both lists
        //see what happens when you return 0
    }

    @Override
    public Object getItem(int position) {
        //return null;

        return sitesList.get(position);//returns the ith String from the list of Strings
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return null;
        if(convertView==null){
            //inflate the external layout and assign it to
            //the view object, hear view corresponds to the linear layout
            convertView layoutInflater = layoutInflater.from(parent.getContext());
        }
        TextView txtViewSite = convertView.findViewById(R.id.txtViewsiteItem);
        txtViewSite.setText(sitesList.get(position));
        //set drawable
        Drawable img =  parent.getResources().getDrawable(sitesPics.get(position));
        //image is always 0 so seet the image size or bounds
        
        return convertView;
    }
}
