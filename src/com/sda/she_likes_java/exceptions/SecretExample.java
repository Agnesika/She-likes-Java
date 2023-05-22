package com.sda.she_likes_java.exceptions;

public class SecretExample {
    public static void main(String[] args) {
        SecretLocker secretStorage = new SecretLocker(
                null
        );

        System.out.println("I know your secret now");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy's biggest secret was: " + enemySecret);

        try {
            System.out.println("Inside try block");
            Secret enemysSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemy's  secret: " + enemysSecret);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After problematic source code");
    }
}
