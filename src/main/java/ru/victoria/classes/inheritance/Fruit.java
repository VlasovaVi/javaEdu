package ru.victoria.classes.inheritance;

public class Fruit {
    private String name;
    private boolean sweet;
    private String color;
    private String countryOfOrigin;

    public Fruit(String name, boolean sweet, String color, String countryOfOrigin) {
        this.name = name;
        this.sweet = sweet;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {

        return name;
    }

    public boolean isSweet() {

        return sweet;
    }

    public String getColor() {

        return color;
    }

    public String getCountryOfOrigin() {

        return countryOfOrigin;
    }

}
