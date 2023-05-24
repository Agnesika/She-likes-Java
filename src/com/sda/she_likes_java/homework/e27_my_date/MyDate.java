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
    private int year;
    private int month;
    private int date;

    public MyDate(int date, int month, int year) {
        this.year = year;
        this.month = month;
        this.date = date;


    }


    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && date == myDate.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, date);
    }

    @Override
    public int compareTo(MyDate o) {
        System.out.println("Called by Java");
        if (year < o.getYear() && month < o.getMonth()) {
            return -1;
        } else if (year > o.getYear() && month < o.getMonth()) {
            return 1;
        } else {
            return 0;
        }

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }
}
