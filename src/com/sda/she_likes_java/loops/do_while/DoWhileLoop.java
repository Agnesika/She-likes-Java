package com.sda.she_likes_java.loops.do_while;

public class DoWhileLoop {

    public static void main(String[] args) {
        // with the value "true" it will go endless. but with "false" it prints only once
        boolean isAdult = false;
        do {
            System.out.println("Can You see this line??");
        } while (isAdult);
    }
}