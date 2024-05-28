package OOP.advanced_library_managememt_system;

public class DVD extends Item implements ItemType {
    private String director;

    public DVD(String title, String itemId, boolean isAvailable, String director) {
        super(title, itemId, isAvailable);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + "\nItem type: " + getItemType() + "\nDVD director  " + director);
    }
}