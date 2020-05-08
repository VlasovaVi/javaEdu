package ru.victoria.classes;

public class Person {
    String firstName;//field
    String lastName;
    int age;
    String address;

    public Person() {
        System.out.println("constructor fired!");
    }

    //Person(String,String,int,String)
    public Person(String _firstName, String _lastName, int _age, String _address) {
        firstName = _firstName;
        lastName = _lastName;
        age = _age;
        address = _address;
    }

    //<access_modifier> <return_value> <name>([<param1> <param1_name>]) {}
    //public             int           getAge(                        ) { return age;}

    public void print() {
        System.out.println("Person named as " + firstName + " " + lastName + " has age " + age );
        System.out.println("Person lives in " + address);
    }
}
