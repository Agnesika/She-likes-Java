package com.sda.she_likes_java.homework.e28_shopping_list;

import java.util.Comparator;

//import static com.sun.tools.classfile.Module_attribute.ProvidesEntry.length;

public class NameLength implements Comparator<ShoppingList> {


    //    @Override
//    public int compare(String products1, String products2) {
//        String firstProduct = o1.getProducts(String.valueOf(length));
//        String secondProduct = o2.getProducts(String.valueOf(length));
//        return Integer.compare(products1.length(), products2.length());


//        }

        @Override
        public int compare (ShoppingList o1, ShoppingList o2){
            boolean length = false;
            String products1 = o1.getProducts(String.valueOf(length));
            String products2 = o2.getProducts(String.valueOf(length));
            return Integer.compare(products1.length(), products2.length());
        }
    }

