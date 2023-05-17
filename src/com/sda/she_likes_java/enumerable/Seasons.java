package com.sda.she_likes_java.enumerable;

//enum is class with restricted number of instances
public enum Seasons {
    WINTER(-21, "skiing"),
    SUMMER(+25, "swimming"),
    SPRING(+10, "gardening"),
    AUTUMN(+8, "hiking");
    private int averageTemp;
    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    Seasons(int averageTemp, String activity) {
        this.averageTemp = averageTemp;
        this.activity = activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }
}
