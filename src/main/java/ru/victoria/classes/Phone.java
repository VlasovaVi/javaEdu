package ru.victoria.classes;

public class Phone {
    String model;
    String operatingSystem;
    int capacity;
    int weight;
    String color;
    int announced;

    public Phone(){

    }
    public Phone(String _model, String _operatingSystem, int _capacity, int _weight, String _color) {
        model = _model;
        operatingSystem = _operatingSystem;
        capacity = _capacity;
        weight = _weight;
        color = _color;
    }
    public Phone(int _announced){

        announced = _announced;
    }

    public void getModel(){
        System.out.println("Phone model " + model);
    }

}
