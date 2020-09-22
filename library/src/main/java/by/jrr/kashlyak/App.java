package by.jrr.kashlyak;

import by.jrr.kashlyak.bean.Book;
import by.jrr.kashlyak.service.Library;

public class App {
    public static void main(String[] args) {

        Book bookOne =new Book("Война и мир","Толстой");
        Book bookTwo =new Book("Преступление и наказание", "Достоевский");
        Book bookThree =new Book("Яблоевый сад", "Чехов");
        Book bookFour =new Book("Идиот", "Достоевский");

        Library library = new Library();
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);

        library.findByName("Война и мир");
        library.returnByAuthor("Достоевский");
    }
}
