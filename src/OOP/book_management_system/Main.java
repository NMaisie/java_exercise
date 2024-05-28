package OOP.book_management_system;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", true);
       Book book2 = new Book("1984", "George Orwell", "0987654321", true);
      /* library.addBook(book1);
       library.addBook(book2);*/
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        Library library = new Library(Arrays.asList(book1,book2), Arrays.asList(member1,member2));

        System.out.println(library.listAvailableBook());
        library.lendBook(book1.getISBN(),member2.getMemberId());
        System.out.println(library.listAvailableBook());

    }
}
