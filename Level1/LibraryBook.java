

public class LibraryBook {// LibraryBook class
    private static String title;// attributes
    private static String author; 
    private static int price; 
    private static String avilable; 

    public LibraryBook() { 
        title="The Rudest Book Ever"; 
        author="Shewtabh Gangwar";
        price=200;
        avilable="Yes";
    }
    public LibraryBook(String title,String author,int price,String avilable){// parameterised constructor
        this.title=title; 
        this.author=author; 
        this.price=price; 
        this.avilable=avilable;
    }
    public static boolean isAvilable(String avilable) {// boolean function to check the avilablity of the Book
        if(avilable.equals("Yes")) {
            return true;
        } else {
            return false;
        }
    }
    public static void showDetail(){// detail method that is used to show the detail of the Book
        System.out.println("The title of the Book is "+title); 
        System.out.println("The author of the Book is "+author);
        System.out.println("The price of the Book is "+price); 
        System.out.println("The avilable of the Book is "+isAvilable(avilable));

    }
    public static void main(String[] args) { 
        LibraryBook lb=new LibraryBook("The Rudest Book ever","Shewtabh Gangwar",200,"No"); // create object of the LibrayBook
        lb.showDetail();




        
    }

    
    
}
