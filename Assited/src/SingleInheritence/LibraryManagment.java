/*Description: Model a Book system where Book is the superclass, and Author is a subclass.
        Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/
class Book{
    private String title;
    protected int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayInfo(){
        System.out.println("Books details are :");
        System.out.println("Title is "+this.title);
        System.out.println("Publication year is "+this.publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String name,String bio,String title,int publicationYear){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Name of the Authore is "+this.name);
        System.out.println("Bio of Authore is "+this.bio);
    }
}

public class LibraryManagment {
    public static void main(String[] args) {
        Book book = new Author("Eric Jorgenson", "US writer", "The Almanack of Naval Ravikant", 2019);
        book.displayInfo();
    }
}
