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



        // another version of the code By Florina
            int ageOfTheKid = 1;

            while (ageOfTheKid<18){
                System.out.println("Can I go to disco, I am " + ageOfTheKid + " year old");
                System.out.println("-No");

//          ageOfTheKid= ageOfTheKid + 1;
                ageOfTheKid++;
            }
            System.out.println("I am " + ageOfTheKid + " years old, Mama: yes, go!");
        }
    }
}