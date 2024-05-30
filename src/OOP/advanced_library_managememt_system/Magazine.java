package OOP.advanced_library_managememt_system;

public class Magazine extends Item implements ItemType{
    private String issueNumber;
    public Magazine(String title, String itemId, boolean isAvailable, String issueNumber){
        super(title, itemId, isAvailable);
        this.issueNumber=issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nMagazine title: "+ getTitle()+"\nItem type: "+ getItemType()+"\nAvaialable: "+ isAvailable()+"\nMagazine issue number: "+ issueNumber;
    }
}
