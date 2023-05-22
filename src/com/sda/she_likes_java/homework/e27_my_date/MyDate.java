package com.sda.she_likes_java.homework.e27_my_date;

import java.util.Objects;

/*
Exercise 27
Create a MyDate class containing three fields:
- year - of type int
- month - of type int
- day - of type int
Implement the Comparable interface for your class.
Create a Main class, add four MyDate objects to the list
and perform sorting.
 */
public class MyDate implements Comparable<MyDate> {
    private int date;
    private int month;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return date == myDate.date && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, month, year);
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;



    }

    @Override
    public int compareTo(MyDate o) {
        return date - o.date;
//        return month - o.month;
//        return year - o.year;

    }
}
