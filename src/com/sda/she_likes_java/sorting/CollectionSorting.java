package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(98);
        numbers.add(-237);
        numbers.add(8);

       Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

    }
}
