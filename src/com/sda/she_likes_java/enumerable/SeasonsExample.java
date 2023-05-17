package com.sda.she_likes_java.enumerable;


public class SeasonsExample {
    public static void main(String[] args) {
//        Seasons = myFavouriteOne = new Seasons();
        Seasons myFavouriteOne = Seasons.SUMMER;
        System.out.println("Average temperature during summer is: " + myFavouriteOne.getAverageTemp());
        System.out.println("Summer's activity: " + myFavouriteOne.getActivity());
        myFavouriteOne.setActivity("running");
        System.out.println("Summer's activity: " + myFavouriteOne.getActivity());
        Seasons autumn = Seasons.AUTUMN;


    }
}
