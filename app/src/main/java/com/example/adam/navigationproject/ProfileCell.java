package com.example.adam.navigationproject;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Adam on 2/20/2016.
 */
public class ProfileCell extends RelativeLayout {
    ImageView imageView;
    TextView name;
    TextView dateJoined;
    TextView distance;

    String nameText;
    String dateJoinedText;
    String distanceText;

    public ProfileCell(Context context) {
        super(context);
        inflate(context, R.layout.nav_list_row, this);
        name = (TextView) findViewById(R.id.name);
        dateJoined = (TextView) findViewById(R.id.date_joined);
        distance = (TextView) findViewById(R.id.distance);
        imageView = (ImageView) findViewById(R.id.imgUser);
        imageView.setImageResource(R.mipmap.ic_launcher);
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
        name.setText(nameText);
    }

    public ImageView imageView() {
        return imageView;
    }

    public String getDateJoinedText() {
        return dateJoinedText;
    }

    public void setDateJoinedText(String dateJoinedText) {
        this.dateJoinedText = dateJoinedText;
        dateJoined.setText(dateJoinedText);
    }

    public String getDistanceText() {
        return distanceText;
    }

    public void setDistanceText(String distanceText) {
        this.distanceText = distanceText;
        distance.setText(distanceText);
    }
}
