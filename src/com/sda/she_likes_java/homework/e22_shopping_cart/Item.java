package com.sda.she_likes_java.homework.e22_shopping_cart;

public class Item extends ShoppingCart{
    private String name;
    private double price;
    private int amount;

    public Item(String product, double price, int amount) {
        this.name = product;
        this.price = price;
        this.amount = amount;
    }

    public String getProduct() {
        return name;
    }

    public void setProduct(String product) {
        this.name = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Items{" +
                "product='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
