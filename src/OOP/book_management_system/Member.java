package OOP.book_management_system;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;
    public Member(String name, String memberId ){
      this.name = name;
      this.memberId = memberId;
      this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book); // Adds a book to borrowedBooks and sets the book’s availability to false.
        book.borrowBook();
    }
    public void returnBook(Book book){
        this.borrowedBooks.remove(book);
        book.returnBook();
    }
}

