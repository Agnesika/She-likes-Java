package com.sda.she_likes_java.homework;

public class Array100 {
    /*
        Create an int array with 100 elements and name it numbers
        Initialise each element with a value 3 times greater than the current index
        e.g.
        numbers[0] = 3 * 0
        numbers[10] = 3 * 10.
     */
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
