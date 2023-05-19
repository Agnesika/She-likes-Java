package com.sda.she_likes_java.name_clash;


public class NamesClashes2 {
    public static void main(String[] args) {
        // Using java.util.Date
        DateName myDate = new DateName();

        // java.sql.Date - canonical class name
        java.sql.Date sqlDate = new java.sql.Date(100);

        DateName myDate2 = new DateName();
    }
}