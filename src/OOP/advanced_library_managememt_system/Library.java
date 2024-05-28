package OOP.advanced_library_managememt_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;
    public List<Member> members;

    public Library(List<Item> items, List<Member> members) {
        this.items = items;
        this.members = members;
    }
    public void addItem(Item item){
    // Adds a new item to the library.
       this.items.add(item);

    }
    public void addMember(Member member){
    //  Adds a new member to the library.
        this.members.add(member);
    }
    public void lendItem(String itemId,String memberId){
        Item requestedItem = this.findItemById(itemId);
        Member requestedMember = this.findMemberById(memberId);
        if(requestedItem.isAvailable()){
            requestedMember.borrowItem(requestedItem);
        }
    }
    public void receiveItem(String itemId, String memberId){
        Item returnedItem = this.findItemById(itemId);
        Member returner = this.findMemberById(memberId);
        if(!returnedItem.isAvailable() && returner.getBorrowedItems().contains(returnedItem)){
            returner.returnItem(returnedItem);
        }
    }
    public Item findItemById(String itemId){
        for(Item i : items){
            if(itemId.equals(i.getItemId())){
                return i;
            }
        }
        return null;
    }
    public Member findMemberById(String memberId){
        for(Member m: members){
            if (memberId.equals(m.getMemberId())){
                return m;
            }
        }
        return null;
    }
    public List<Item> listAvailableItems(String memberId){
        List<Item> availableItems = new ArrayList<>();
        for (Item item : items) {
            if (item.isAvailable()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }
    public List<Item> listBorrowedItems(String memberId) {
        List<Item> borrowedItems = new ArrayList<>();
        for (Item item : items) {
            if (!item.isAvailable()) {
                borrowedItems.add(item);
            }
        }
        return borrowedItems;
    }
}
