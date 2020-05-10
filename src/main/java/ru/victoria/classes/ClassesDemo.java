package ru.victoria.classes;

public class ClassesDemo {
    public static void main(String[] args) {

        String fedorFirstName = "Fedor";
        int fedorAge= 48;

        String ivanFirstName = "Ivan";
        int ivanAge = 54;


        Person ivan = new Person("Ivan", "Ivanov", 54, "Moscow, Kremlin");

        System.out.println("ivan.getFirstName() = " + ivan.getFirstName());

        //printPersonData(fedorFirstName, "Fedorov", fedorAge, "St.Petersburg, ..?.");
        //printPersonData(ivanFirstName, "Ivanov", ivanAge, "Moscow, Kremlin");
        //printPersonData(fedor);
//        printPersonData(ivan);
        ivan.print();
        ivan.setAge(55);
        ivan.print();



        Person person = new Person();
        person.setAge(10);
        String str = null;

        System.out.println("str = " + str);

        //.....
    }


    public static void printPersonData(String firstName, String lastName, int age, String address) {
        System.out.println("Person named as " + firstName + " " + lastName + " has age " + age );
        System.out.println("Person lives in " + address);
    }

    public static void printPersonData(Person person) {
        System.out.println("Person named as " + person.getFirstName() + " " + person.getLastName() + " has age " + person.getAge() );
        System.out.println("Person lives in " + person.getAddress());
    }
}
