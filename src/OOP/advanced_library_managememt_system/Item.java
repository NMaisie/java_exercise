package OOP.advanced_library_managememt_system;

public abstract class Item {
    private String title;
    private String itemId;
    private boolean isAvailable;

    public Item(String title, String itemId, boolean isAvailable){
        this.title=title;
        this.itemId=itemId;
        this.isAvailable=isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /** Abtract methods */
    public abstract String getItemType();
    public abstract void displayDetails();

    /** Concrete methods */
    public void borrowItem(){
        this.isAvailable = false;
    }
    public void returnItem(){
        this.isAvailable =  true;
    }

}
