package com.sda.she_likes_java.homework.other_peoples_homeworks.florinas_md;

public class FlorinasWhileIGrow {
    //    Florinas while I grow
    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid < 18) {
            System.out.println("Can I go to disco, I am " + ageOfTheKid + " year old");
            System.out.println("-No");

//          ageOfTheKid= ageOfTheKid + 1;
            ageOfTheKid++;
        }
        System.out.println("I am " + ageOfTheKid + " years old. Mama: yes, go!");
    }
}
