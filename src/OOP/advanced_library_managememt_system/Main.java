package OOP.advanced_library_managememt_system;

import OOP.book_management_system.Book;
import OOP.book_management_system.Library;
import OOP.book_management_system.Member;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", true);
        Magazine magazine = new Magazine("1984", "George Orwell", true, "33313");
        DVD dvd = new DVD("Inception", "DVD11", true,"Dannel");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);
        library.addItem(dvd);
        library.addMember(member1);
        library.addMember(member2);

        System.out.println();
    }
    }