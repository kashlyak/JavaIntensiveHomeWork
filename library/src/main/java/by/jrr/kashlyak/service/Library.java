package by.jrr.kashlyak.service;


import by.jrr.kashlyak.bean.Book;

import java.util.ArrayList;
import java.util.List;


public class Library {
    List<Book> booksLibrary;
    public Library() {
        this.booksLibrary = new ArrayList<>();
    }
    public void removeBook(Book book) {
        booksLibrary.remove(book);
    }

    public Book findByName(String name) {
        for (Book book : booksLibrary){
            if(book.getName().equals(name)) {
                return book;
            }
        }
        return null;

    }
    public List<Book> returnByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : booksLibrary){
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }
    


    public void addBook(Book book) {
        booksLibrary.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + booksLibrary +
                '}';
    }
}


