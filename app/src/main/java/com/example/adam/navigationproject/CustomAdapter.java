package com.example.adam.navigationproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.security.Policy;
import java.util.ArrayList;

/**
 * Created by Adam on 2/20/2016.
 */
public class CustomAdapter extends BaseAdapter {
    ArrayList<Profile> profiles;
    Context context;

    public CustomAdapter(Context context, ArrayList<Profile> profiles)
    {
        this.context = context;
        this.profiles = profiles;
    }

    @Override
    public int getCount() {
        return profiles.size();
    }

    @Override
    public Profile getItem(int position) {
        return profiles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
        {
            ProfileCell cell = new ProfileCell(context);
            Profile profile = getItem(position);
            cell.setNameText(profile.name);
            cell.setDateJoinedText(profile.dateJoined);
            cell.setDistanceText(profile.distance);
            convertView = cell;
        }

        return convertView;
    }
}
