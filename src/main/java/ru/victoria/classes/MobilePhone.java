package ru.victoria.classes;

public class MobilePhone {
    public static void main(String[] args) {

        Phone iPhone = new Phone("iPhoneX", "iOS", 64, 194, "White" );
        Phone Samsung = new Phone("GalaxyFold", "Android", 12, 263, "Black");

        iPhone.announced = 2017;
        Samsung.announced = 2019;

        iPhone.getModel();
        Samsung.getModel();
    }

}

