public class HotelBooking {
    private  String guestName; 
    private String roomType; 
    private int nights; 
    HotelBooking(){// Default Costructor
        guestName="Vishnu Sir"; 
        roomType="Deluxe"; 
        nights=3;

    } 

    public HotelBooking(String guestName, String roomType, int nights) {// parameterised Construcor
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking Booking){// Copy Consturctor
        this.guestName=Booking.guestName; 
        this.roomType=Booking.roomType; 
        this.nights=Booking.nights;
    } 
    public void displayDetail(){// display detail function will show the output of the attributes
        System.out.println("The name of the guest is "+guestName);
        System.out.println("The roomtType of the Guest is "+roomType);
        System.out.println("The no of Nights guest will stay"+nights);
    }
    public static void main(String[] args) {// main class function
        HotelBooking hb=new HotelBooking("Vishnu sir","Premium",20);// pararmetrized constructor called;
        HotelBooking hb2=new HotelBooking(); // default constructor called;
        HotelBooking hb3=new HotelBooking(hb); // copy Constructor called;
        hb.displayDetail();
        System.out.println("***************"); 
        hb2.displayDetail(); 
        System.out.println("*********************");
        hb3.displayDetail();

        
    }

    
    
}
