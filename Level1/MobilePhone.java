class MobilePhone{
	String brand;
	String model;
	int price; // attributes of the MobilePhone class
	MobilePhone(String brand,String model,int price){// constructor of Mobile Phone class
		this.brand=brand;
		this.model=model;
		this.price=price;
	} 
	public void displayresult() {// method to display the result
		System.out.println("THe brand name of the phone is "+brand); 
		System.out.println("The model of the phone is "+model);
		System.out.println("The price of the phone is "+price);
	}
	public static void main(String[]args) {// main class
		MobilePhone mp=new MobilePhone("Realme","REALMENARZO",2000); 
		mp.displayresult();
	}
}