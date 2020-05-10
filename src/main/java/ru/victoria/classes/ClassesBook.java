package ru.victoria.classes;

public class ClassesBook {
    public static void main(String[] args) {
        Book book = new Book("An American Tragedy", "tragedy", "Theodore Dreiser", 953);
        Book book2 = new Book("Pride and Prejudice", "novel", "Jane Austen", 262);

        book.getAuthor();
        book2.getAuthor();

        book.getTitle();
        book2.getTitle();
    }
}
