package problems.Library;


public class Main {
    public static void main(String[] args) {
        // creating objects for book class
        LibraryItem b = new Book("101", "Java Basics", "John Doe");
        // performing operations
        b.getLoanDuration(14);
        b.getItemDetails();
        System.out.println("Is Available: " + b.checkAvailability());
        b.reserveItem();
        System.out.println();

        // creating objects for magazine class
        LibraryItem mg = new Magazine("202", "Abc", "xyz");
        // performing operations
        mg.getLoanDuration(16);
        mg.getItemDetails();
        System.out.println("Is Available: " + mg.checkAvailability());
        System.out.println("Is Available: " + mg.checkAvailability());
        mg.reserveItem();
        mg.reserveItem();
        System.out.println();

        // creating objects for DVD class
        LibraryItem dvd = new DVD("303", "Songs", "Arijit singh");
        // performing operations
        dvd.getLoanDuration(18);
        dvd.getItemDetails();
        System.out.println("Is Available: " + dvd.checkAvailability());
        dvd.reserveItem();
    }
}
