package problems.Library;

public class Magazine extends LibraryItem{
    // constructor for magazine class
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // defining abstract methods
    @Override
    public void getLoanDuration(int duration) {
        setDuration(duration);
    }

    // printing item details
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration : "+getDuration());
    }
}
