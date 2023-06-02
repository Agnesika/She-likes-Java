package com.sda.she_likes_java.exceptions;

public class TryWithFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Try without exception");
        } finally {
            System.out.println("Finally");
        }

        try {
            System.out.println("Try without exception");
        } catch (Exception exc) {
            System.out.println("This shouldn't be printed");
        } finally {
            System.out.println("Finally");
        }

        try {
            System.out.println("Now lets be serious");
            throw new DecryptionIssueException("Some problem");
//            System.out.println("haha");
        } catch (Exception exc) {
            System.out.println("Some exception occured: " + exc);
        } finally {
            System.out.println("Finally again");
        }

    }


}
