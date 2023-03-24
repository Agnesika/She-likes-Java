package com.sda.she_likes_java.homework.other_peoples_homeworks;


public class AddressM {
    // Mariusx piemērs
    String country;
    String city;
    String street;
    String postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AddressM myFirstAddress = new AddressM();
        myFirstAddress.country = "Poland";
        myFirstAddress.city = "Warsaw";

        AddressM mySecondAddress = new AddressM();
        mySecondAddress.country = "Poland";
        mySecondAddress.city = "Rzeszow";

        System.out.println("City from first address: " + myFirstAddress.city);
        System.out.println("City from second address: " + mySecondAddress.city);

        System.out.println("Using toString for myFirstAddress: " + myFirstAddress);
        System.out.println(mySecondAddress);
    }
}