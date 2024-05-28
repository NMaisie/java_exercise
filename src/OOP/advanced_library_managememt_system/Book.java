package OOP.advanced_library_managememt_system;

public class Book extends Item implements ItemType{
    private String author;
    public Book(String title, String itemId, boolean isAvailable, String author){
        super(title,itemId,isAvailable);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: "+ getTitle()+"\nItem type: "+ getItemType()+"\nAuthor: "+ author);
    }
}
