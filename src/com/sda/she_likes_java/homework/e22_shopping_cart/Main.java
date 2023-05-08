package com.sda.she_likes_java.homework.e22_shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Exercise 22.
2:16
Create a shopping cart class.
Add as a field an items variable of type List<Item> - to store products.
Item is also the class to be created.
It is to contain the following fields:
- product name
- product price.
The shopping cart class should provide the following operations:
- add product to basket
- displaying products in the shopping cart
- calculation of the total basket value.
Create a Main class and check the operations of your classes.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to our extraordinary shop");
        System.out.println("Here is the list of items you added to your shopping cart:");
        List<Item> itemList = new ArrayList();

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

        System.out.println("Total sum of the value in your basket: " + totalPrice + " dirhams");
        System.out.println("Please proceed to the checkout");
        System.out.println("------------------------------");
        System.out.println("More items added to the basket:");
        Item pophorn = new Item("pophorn", 2.7, 4);
        itemList.add(pophorn);
        System.out.println(pophorn);
        summaryOfItems = bumpkin.getAmount() + reddish.getAmount() + parrot.getAmount() + pophorn.getAmount();
        System.out.println("Now you have " + summaryOfItems + " items in your basket.");
        double totalPrice4 = (pophorn.getPrice() * pophorn.getAmount());
        totalPrice = totalPrice1 + totalPrice2 + totalPrice3 + totalPrice4;
        System.out.println("Updated total sum of the value in your basket: " + totalPrice + " dirhams");
        System.out.println("Please press the button below to proceed to the payment.");

    }
}
