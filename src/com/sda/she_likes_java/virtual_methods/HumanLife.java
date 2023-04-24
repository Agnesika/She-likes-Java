package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public static void tryToCastHumanToMan(Human maybeWomanOrMan) {

        // casting / down-casting
        // casting works for references
        (
                (Man) maybeWomanOrMan
        ).learnToCleanHouse();

        ((Man) maybeWomanOrMan).learnToCleanHouse();
        ((Woman)maybeWomanOrMan).learnJava();
    }
}
