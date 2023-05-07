package com.sda.she_likes_java.homework.e22_shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to our extraordinary shop");
        List<Item> itemList = new ArrayList();
        System.out.println("Here is the list of items you added to your shopping cart:");

        Item bumpkin = new Item("bumpkin", 1.3, 2);
        Item reddish = new Item("reddish", 1.2, 15);
        Item parrot = new Item("parrot", 1.45, 2);
        itemList.add(bumpkin);
        itemList.add(reddish);
        itemList.add(parrot);
        System.out.println(itemList);
        int summaryOfItems = bumpkin.getAmount() + reddish.getAmount() + parrot.getAmount();
        System.out.println("Right now you have " + summaryOfItems + " items in your basket");
        double totalPrice1 = (bumpkin.getPrice() * bumpkin.getAmount());
        double totalPrice2 = (reddish.getPrice() * reddish.getAmount());
        double totalPrice3 = (parrot.getPrice() * parrot.getAmount());
        double totalPrice = totalPrice1 + totalPrice2 + totalPrice3;

        System.out.println("Total sum of the value in your basket: " + totalPrice);
        System.out.println("Please proceed to the checkout");
        System.out.println("------------------------------");
        System.out.println("More items added to the basket");
        Item pophorn = new Item("pophorn", 2.7, 4);
        itemList.add(pophorn);
        summaryOfItems = bumpkin.getAmount() + reddish.getAmount() + parrot.getAmount() + pophorn.getAmount();
        System.out.println("Now you have " + summaryOfItems + " items in your basket");
        double totalPrice4 = (pophorn.getPrice() * pophorn.getAmount());
        totalPrice = totalPrice1 + totalPrice2 + totalPrice3 + totalPrice4;
        System.out.println("Updated total sum of the value in your basket: " + totalPrice);

    }
}
