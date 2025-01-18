public class BookLibrarySystem {
public  int ISBN; 
protected String title;
private  String author; 
public BookLibrarySystem(int ISBN,String title,String author){
    this.ISBN=ISBN; 
    this.title=title; 
    this.author=author;
}
public void displayDetails(){
    System.out.println("The ISBN Of the Book is"+ISBN);
    System.out.println("The title of the Book is "+title);
    System.out.println("The author of the Book is "+author);
} 
static class Ebook extends BookLibrarySystem{ 
    private static int publishYear;
    public  Ebook(int ISBN,String title,String author,int publishYear){
        super(ISBN, title, author); 
        this.publishYear=publishYear;

    }
    public  void displayDetails(){
        super.displayDetails();
        System.out.println("The publish year of the Book is "+publishYear);
    }
}
public static void main(String[] args) {
    BookLibrarySystem LMS=new BookLibrarySystem(2020, "The almanack of naval Ravikant", "ERIC JORGENSON");
    LMS.displayDetails(); 
    Ebook eb=new Ebook(2202, "The 5AM Club", "Robin Sharma",2008); 
    eb.displayDetails();
}

}
