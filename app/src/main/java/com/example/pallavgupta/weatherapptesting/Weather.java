package com.example.pallavgupta.weatherapptesting;

/**
 * Created by Pallav Gupta on 18-03-2018.
 */

public class Weather {

    String date;
    String minTemp;
    String maxTemp;
    String link;

    public String getDate() {

        String[] spli= date.split("T");
        return spli[0];
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
