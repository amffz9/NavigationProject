package com.example.adam.navigationproject;

/**
 * Created by Adam on 2/20/2016.
 */
public class Profile {//Information about Users Profile


    public String name;
    public String dateJoined;
    public String distance;
/////////possibly have image url here ....

    public Profile(String name, String dateJoined, String distance) {
        this.name = name;
        this.dateJoined = dateJoined;
        this.distance = distance;
    }

}
