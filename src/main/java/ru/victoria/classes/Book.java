package ru.victoria.classes;

public class Book {
    String title;
    String genre;
    String author;
    int pages; // кол-во страниц

    Book(){

    }

    public Book(String _title, String _genre, String _author, int _pages ){
        title = _title;
        genre = _genre;
        author = _author;
        pages = _pages;
    }

    public void getAuthor(){

        System.out.println(author);
    }

    public void getTitle(){

        System.out.println(title);
    }
}
