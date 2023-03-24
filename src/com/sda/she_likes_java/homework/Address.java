package com.sda.she_likes_java.homework;

public class Address {
    /*
    Exercise 14
Create class with name Address
Put next variables inside it:
- country,
- city,
- street
- postal code
Use proper data types.
Try to create two different addresses objects and init them with some values.
     */

    @Override
    public String toString() {
        return "Address{" +
                "galactics='" + galactics + '\'' +
                ", planet='" + planet + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                ", object='" + object + '\'' +
                ", planetTwo='" + planetTwo + '\'' +
                ", otherDepartment='" + otherDepartment + '\'' +
                ", steps=" + steps +
                ", name='" + name + '\'' +
                '}';
    }

    String galactics = "Milky way";
    String planet = "Earth";
    String continent = "America";
    String region = "Carribean";
    String country = "Dominica";
    String city = "Kraken";
    String street = "3/4 Pirate lane";
    String postCode = "Parrot 4281";
    String object = "parcel";


    String planetTwo = "Moon";
    String otherDepartment = "heaven";
    int steps = 777;
    String name = "Bens";


    public static void main(String[] args) {
        Address me = new Address();
        Address you = new Address();


        System.out.println("Hello, dear postman. I need to send this " + me.object + " to my dear uncle " + me.name);
        System.out.println("I will forward you to my colleague upstairs. Please use that stairway to " + me.otherDepartment);
        System.out.println("You will need to go " + me.steps + " steps up the stairs");
        System.out.println("okay, thank you. I can count");
        System.out.println("Hello, mister. How can I help you?");
        System.out.println("Please send this " + me.object + " to my uncle " + me.name);
        System.out.println("I will send the " + me.object + " to the " + you.planetTwo + " and back");
        System.out.println("No, my uncle is not over the " + me.planetTwo);
        System.out.println("Oh, sorry, I took the wrong address. Can you tell please the right one?");
        System.out.println("Sure! It is " + me.street + " in " + me.city + " of " + me.country + " in " + me.region + " region of continent " + me.continent + " on the planet " + me.planet + " in " + me.galactics + " galaxy");
        System.out.println("Oh yes, and the post code is: " + me.postCode);
        System.out.println("Thank you very much. We will deliver your tasty parcel to " + me.planet);

        System.out.println("Using toString for myFirstAddress: " + me);
        System.out.println(me);
    }

    }

