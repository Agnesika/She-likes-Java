package com.sda.she_likes_java.name_clash;


public class NamesClashes2 {
    public static void main(String[] args) {
        // Using java.util.Date
        Date myDate = new Date();

        // java.sql.Date - canonical class name
        java.sql.Date sqlDate = new java.sql.Date(100);

        com.sda.she_likes_java.name_clash.Date myDate2 = new com.sda.she_likes_java.name_clash.Date();
    }
}