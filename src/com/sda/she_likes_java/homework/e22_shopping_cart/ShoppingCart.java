package com.sda.she_likes_java.homework.e22_shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList();
        System.out.println("Here is the list of items you added to your shopping cart:");

        Item bumpkin = new Item("", 1.3, 2);
        Item reddish = new Item("reddish", 1.2, 15);
        Item parrot = new Item("parrot", 142, 1);
        itemList.add(bumpkin);
        itemList.add(reddish);
        itemList.add(parrot);
        System.out.println(itemList);
        int summaryOfItems = bumpkin.getAmount() + reddish.getAmount() + parrot.getAmount();
        System.out.println("Right now you have " + summaryOfItems + " items in your basket");




    }
}
