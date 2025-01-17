import java.util.Scanner;

class Inventory{
	int itemCode;
	String itemName; 
	int price;  // attributes of the class
	Inventory(int itemCode,String itemName,int price){// constructor of the class
		this.itemCode=itemCode; 
		this.itemName=itemName; 
		this.price=price;
	} 
	public int totalCost(int totalItem,int price) {// calculate the totalcost;
		return totalItem*price;
	}
	public void displaydetails() {// display the result value
		System.out.println("The itemCode of the item is "+itemCode); 
		System.out.println("The itemName of the item  is "+itemName); 
		System.out.println("The Price of the item is "+price); 
		
	}
	public static void main(String[]args) {// main class
		Inventory In=new Inventory(2256,"Bouquet",2000);//calling the constructor value of the class Inventory
		Scanner sc=new Scanner(System.in);// take input from user
		System.out.println("Enter the total Number of Item You Want"); 
		int number=sc.nextInt(); 
		In.displaydetails(); // display detail
		System.out.println("The total Price of the Item is "+In.totalCost(number,2000));
	}
}
