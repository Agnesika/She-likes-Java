package com.sda.she_likes_java.homework.e26_events;

import java.time.LocalDate;

public enum ImportantEvents {
    GRADUATION(29/02/2006, "Been there-done that, tick the box"),
    SUMMER_SOLSTICE(21/06/2023, "Yes! That's the way, aha-aha, I like it"),
    FUNERAL(21/06/2103, "Scatter my ash in the mountains"),
    JAVA_TEST(18/05/2023, "Everything is an experience"),
    BIRTHDAY (18/05/2023, "Every year the same over and over again :D ");


    LocalDate eventDate;
    String description;

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getDescription() {
        return description;
    }

    ImportantEvents(int eventDate, String description) {
        this.eventDate = LocalDate.ofEpochDay(eventDate);
        this.description = description;
    }
}
