package com.sda.she_likes_java.loops.while_loop;

public class WhileIGrow {

    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid <= 18) {
            System.out.println("Mommy can I go to disco??");
            System.out.println("No");

//            ageOfTheKid = ageOfTheKid + 1;
            ageOfTheKid++; // this is the same function like in the line above, just shorter
        }

        System.out.println("Go to party!!!");

    }
}
