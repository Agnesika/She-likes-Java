package com.sda.she_likes_java.homework.e27_my_date;

import java.time.Month;
import java.util.Comparator;

public class ComparingMyDateByMonth implements Comparator<Month> {


//    public int compare(Object o1, Object o2) {
//        int firstMonth = o1.getMonth();
//        int secondMonth = o2.getMonth();
//        return firstMonth - secondMonth;
//    }

    @Override
    public int compare(Month o1, Month o2) {
        return 0;
    }
}
