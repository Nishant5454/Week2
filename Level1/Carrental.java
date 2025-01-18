public class Carrental {
    private static String customerName; 
    private static String carModel; 
    private static int rentalDays;  
    private static int costperDay; 
    Carrental(){
        customerName="Suraj Raj";
        carModel="KiaSeltos";
        rentalDays=30; 
        costperDay=20;
    } 
    public static int totalCost(){
        return rentalDays*costperDay;
    }
    public static void showDetails(){
        
        System.out.println("The name of the Customer is "+customerName);
        System.out.println("The name of the Car  is "+carModel);
        System.out.println("The no of the rental days of car is  "+rentalDays);
        System.out.println("The rental cost value of the car is "+totalCost());


    }
    public static void main(String[] args) {
        Carrental cr=new Carrental();  
        
        cr.showDetails();

        

        
    }
    
}
