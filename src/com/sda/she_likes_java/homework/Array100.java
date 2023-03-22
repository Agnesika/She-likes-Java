package com.sda.she_likes_java.homework;

public class Array100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        System.out.println("Trying to init array");
        numbers[0] = 3*0;
        numbers[1] = 3*1;
        numbers[2] = 3*2;
        numbers[3] = 3*3;
        numbers[4] = 3*4;

        System.out.println("number[4] is: " + numbers[4]);

        System.out.println("size of the numbers array is: " + numbers.length);
    }
}
