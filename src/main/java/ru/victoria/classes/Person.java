package ru.victoria.classes;

public class Person {
    private String firstName;//field
    private String lastName;
    private int age;
    private String address;

    public Person() {
        System.out.println("constructor fired!");
    }

    //Person(String,String,int,String)

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }


    //<access_modifier> <return_value> <name>([<param1> <param1_name>]) {}
    //public             int           getAge(                        ) { return age;}

    public void print() {
        System.out.println("Person named as " + firstName + " " + lastName + " has age " + age );
        System.out.println("Person lives in " + address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
