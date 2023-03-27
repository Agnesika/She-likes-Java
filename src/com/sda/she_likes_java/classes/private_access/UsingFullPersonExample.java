package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {
    public static void main(String[] args) {


        FullPerson maybeMe = new FullPerson("Agnese", "Fomrate", 45, null);
//        maybeMe.age = -1;
        System.out.println("My age: " + maybeMe.getAge());
        maybeMe.setAge(-1);
        System.out.println("me after failed trial to decrease age: " +maybeMe);
    }

}
