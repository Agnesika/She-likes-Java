package com.sda.she_likes_java.enumerable;

public enum ProgrammersStates {

    EXHAUSTED("Bang the wall"),
    GOD_MODE("I can do everything"),
    NORMAL("Yeah, it's just the life");

    String description;
    public String getDescription() {
        return description;
    }

    ProgrammersStates(String description) {
        this.description = description;
    }
}
