package com.sda.she_likes_java.homework.e27_my_date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MyDate> myDates = new ArrayList<>();
        myDates.add(new MyDate(1989, 12, 20));
        myDates.add(new MyDate(1982, 12, 11));
        myDates.add(new MyDate(1982, 1, 6));
        myDates.add(new MyDate(2001, 6, 6));
        Collections.sort(myDates);
        System.out.println("Sorted by natural way " + myDates);
//        Collections.sort(myDates,
//                new FullDateSort().(myDates));
//        System.out.println("Dates sorted by year and compared by month: " + myDates);

    }
}
