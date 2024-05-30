package OOP.advanced_library_managememt_system;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby", "ID331", true, "Laura");
        Magazine magazine = new Magazine("George Orwell", "Id112", true, "99879");
        DVD dvd = new DVD("Inception", "DVD11", true, "Dannel");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);
        library.addItem(dvd);
        library.addMember(member1);
        library.addMember(member2);

        System.out.println("List of items available: \n"+library.listAvailableItems());
        System.out.println();

        library.lendItem("ID331","M001");
        System.out.println("List of items after lend out \"The Great Garsby\"\n"+library.listAvailableItems());

        }
        }
