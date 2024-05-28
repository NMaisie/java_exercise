package OOP.advanced_library_managememt_system;
import java.util.ArrayList;
import java.util.List;
public class Member {
    private String name;
    private String memberId;
    private List<Item> borrowedItems;

    public Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedItems = new ArrayList<>();
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

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
    public void borrowItem(Item item){
        this.borrowedItems.add(item); // Adds an item to borrowedItems and sets the item’s availability to false.
        item.borrowItem();
    }
    public void returnItem(Item item){
        this.borrowedItems.remove(item);// Removes an item from borrowedItems and sets the item’s availability to true.
        item.returnItem();
    }
}
