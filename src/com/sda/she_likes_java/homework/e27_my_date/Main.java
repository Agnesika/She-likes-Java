package com.sda.she_likes_java.homework.e27_my_date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MyDate> myDates = new ArrayList<>();
        myDates.add(new MyDate(20, 12, 1989));
        myDates.add(new MyDate(11, 12, 1982));
        myDates.add(new MyDate(6, 1, 1982));
        myDates.add(new MyDate(6, 6, 2001));
        Collections.sort(myDates);
        System.out.println("Sorted by natural way " + myDates);
//        Collections.sort(myDates,
//                new FullDateSort().(myDates));
//        System.out.println("Dates sorted by year and compared by month: " + myDates);

    }
}
