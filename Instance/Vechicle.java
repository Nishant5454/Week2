public class Vechicle {
    private static String ownerName; 
    private static String vechicleType;
    private static int registrationfee=200;
    public Vechicle(String ownerName,String vechicleType){
        this.ownerName=ownerName;
        this.vechicleType=vechicleType; 
        this.registrationfee=registrationfee;
    }
    public void displayDetails(){
        System.out.println("The owner name is "+ownerName);
        System.out.println("The vechicle type is "+vechicleType);
        System.out.println("The registration fee is "+registrationfee);
    }
    public static void updateRegistrationFee(int registrationfee){
        Vechicle.registrationfee=registrationfee;
    }
    public static void main(String[] args) {
        Vechicle vechicle1=new Vechicle("Rahul", "Car");
        vechicle1.displayDetails();
        Vechicle vechicle2=new Vechicle("Rohit", "Bike");
        vechicle2.displayDetails();
        Vechicle.updateRegistrationFee(200);
        vechicle1.displayDetails();
        vechicle2.displayDetails();
    }

    
}
