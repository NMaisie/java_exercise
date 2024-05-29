package OOP.advanced_library_managememt_system;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby", "ID331", true, "Laura");
        Magazine magazine = new Magazine("1984", "Id112", true, "George Orwell");
        DVD dvd = new DVD("Inception", "DVD11", true, "Dannel");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);
        library.addItem(dvd);
        library.addMember(member1);
        library.addMember(member2);

        System.out.println(library.listAvailableItems());


        }
        }
