package ru.victoria.classes;

public class ClassesDemo {
    public static void main(String[] args) {
        String fedorFirstName = "Fedor";
        int fedorAge= 48;

        String ivanFirstName = "Ivan";
        int ivanAge = 54;


        Person fedor = new Person();
        fedor.firstName = "Fedor";
        fedor.lastName = "Fedorov";
        fedor.age = 48;
        fedor.address = "St.Petersburg, ..?.";

        Person ivan = new Person("Ivan", "Ivanov", 54, "Moscow, Kremlin");



        //printPersonData(fedorFirstName, "Fedorov", fedorAge, "St.Petersburg, ..?.");
        //printPersonData(ivanFirstName, "Ivanov", ivanAge, "Moscow, Kremlin");
        //printPersonData(fedor);
//        printPersonData(ivan);
        fedor.print();
        ivan.print();


        Person person = new Person();
        String str = null;

        System.out.println("person.address = " + person.address);
        System.out.println("str = " + str);

        //.....
    }


    public static void printPersonData(String firstName, String lastName, int age, String address) {
        System.out.println("Person named as " + firstName + " " + lastName + " has age " + age );
        System.out.println("Person lives in " + address);
    }

    public static void printPersonData(Person person) {
        System.out.println("Person named as " + person.firstName + " " + person.lastName + " has age " + person.age );
        System.out.println("Person lives in " + person.address);
    }
}
