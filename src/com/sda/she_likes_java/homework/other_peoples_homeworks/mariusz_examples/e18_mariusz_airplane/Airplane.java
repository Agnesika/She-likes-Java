package com.sda.she_likes_java.homework.other_peoples_homeworks.mariusz_examples.e18_mariusz_airplane;

public class Airplane {
    private boolean isFlying;
    private int xCoordinatesOfDestiny;
    private int yCoordinatesOfDestiny;

    public boolean isFlying() {
        return isFlying;
    }

    public int getxCoordinatesOfDestiny() {
        return xCoordinatesOfDestiny;
    }

    public int getyCoordinatesOfDestiny() {
        return yCoordinatesOfDestiny;
    }

    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println("take off in progress");
        } else {
            System.out.println("I've already started");
        }
    }

    public void land() {
        if (isFlying) {
            isFlying = false;
            System.out.println("landing in progress");
        } else {
            System.out.println("I've already landed");
        }
    }

    public void flyTo(int xCoordinatesOfDestiny, int yCoordinatesOfDestiny) {
        if (!isFlying) {
            System.out.println("I need to take off first");
        } else {
            System.out.println("Ok, let's go to: [%d, %d]".formatted(xCoordinatesOfDestiny, yCoordinatesOfDestiny));
            this.xCoordinatesOfDestiny = xCoordinatesOfDestiny;
            this.yCoordinatesOfDestiny = yCoordinatesOfDestiny;
        }
    }
}

