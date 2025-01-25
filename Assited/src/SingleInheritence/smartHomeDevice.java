import javax.swing.plaf.PanelUI;

/*
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

 */
class Device{//super class for Device having deviceId and status
    String deviceId;
    String status;
    Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayInfo(){//method for displaying the details
        System.out.println("Device details are");
        System.out.println("The id of the Device is "+this.deviceId);
        System.out.println("The status of the Device is "+this.status);
    }
}
class Thermostat extends Device{//subclass for Thermostat having temperature
    int temperature;
    Thermostat(String deviceId,String status,int temperature){
        super(deviceId,status);
        this.temperature=temperature;
    }
    public int increase_temperatur(int increase){//method for increasing the temperature
        temperature+=increase;
        return temperature;
    }
    public  int decrease_temperatur(int decrease){
        temperature-=decrease;
        return temperature;
    }
    @Override
    public void displayInfo(){//overriding the method of the super class
        super.displayInfo();
        System.out.println("The temperature of the Device is "+this.temperature);
    }

}


public class smartHomeDevice {
    public static void main(String []args){
        Thermostat st=new Thermostat("BP201","OK-Tested",45);
        st.decrease_temperatur(2);
        st.displayInfo();
    }
}
