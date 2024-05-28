package OOP.book_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Member> members;
    public Library(){
        this.books= new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public Library(List<Book> books, List<Member> members){
        this.books=books;
        this.members=members;
    }
    public void addBook(Book book){
        this.books.add(book); // Adds a new book to the library.
    }
    public void addMember(Member member){
        this.members.add(member);
    }
    public void lendBook(String isbn, String memberId){ // Lends a book to a member if the book is available.
       //TODO: get book by isbn
        Book requestedBook = this.findBookByISBN(isbn);

        //TODO: get member by memberId
        Member requestedMember = this.findMemberById(memberId);

        //TODO: if book is avaiable then let member borrow book
        if(requestedBook.isAvailable()){
            requestedMember.borrowBook(requestedBook);
        }
    }
    public Book findBookByISBN(String isbn){
        for(Book b : books){
            if(isbn.equals(b.getISBN())){
                return b;
            }
        }
        return null;
    }
    public Member findMemberById(String memberId){
        for(Member m : members){
            if(memberId.equals(m.getMemberId())){
                return m;
            }
        }
        return null;
    }
    public void receiveBook(String isbn, String memberId){
        //TODO: get returned book by isbn
        Book returedBook = findBookByISBN(isbn);

        //TODO: get returner by memberId
        Member returner = findMemberById(memberId);

        //TODO: if returned book is not avaialbe ,get book back from returner
        if(!returedBook.isAvailable()&& returner.getBorrowedBooks().contains(returedBook)){
            returner.returnBook(returedBook);
        }
    }
    public List<Book> listAvailableBook(){
       // return books.stream().filter(Book :: isAvailable).collect(Collectors.toList());
       List<Book> availableBook = new ArrayList<>();
        for(Book b: books){
            if(b.isAvailable()){
                availableBook.add(b);
            }
        }
        return availableBook;
    }

    public void addItem(Book theGreatGatsby) {
    }
}

