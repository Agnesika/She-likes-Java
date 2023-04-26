package com.sda.she_likes_java.homework.e16_animal_owner;

public class Owner {
    private String name;
    private String occupation;
    private String animal;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getOccupation() { return occupation; }

    public void setOccupation(String occupation) {this.occupation = occupation; }

    public String getAnimal() { return animal; }

    public void setAnimal(String animal) { this.animal = animal; }

    public Owner(String name, String occupation, String animal) {
        this.name = name;
        this.occupation = occupation;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}

