public class BookDetails{ 
	String title; 
	String Author; 
	int price; // create the attributes of the class BookDetails
	BookDetails(String title,String Author,int price){// constructor
		this.title=title; 
		this.Author=Author; 
		this.price=price;
	}
	public void display() {// method to return the result
		System.out.println("The title of the Book is "+title);
		System.out.println("The Author of the Book is "+Author); 
		System.out.println("The Price of the Book is "+price);
	} 
	public static void main(String[]args) {//main class
		BookDetails BD=new BookDetails("Ikigai","Hector Garicia",200); 
		BD.display();
	}
	
}