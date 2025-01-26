package problems.Vechicle;

abstract class Vehicle {
    private String vechicleNumber;
    private String type;
    private int rentalRate;

    Vehicle(String vechicleNumber,String type,int rentalRate){
        this.vechicleNumber=vechicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
       // this.insuranceNumber=insuranceNumber;
       // this.policyNumber=policyNumber;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getVechicleNumber() {
        return vechicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setVechicleNumber(){
        this.vechicleNumber=vechicleNumber;


                //.vechicleNumber
    }
    public String getType(){
        return type;
    }

    abstract int calculateRentalcost(int days);

    public void calculateInsurance() {

    }

    interface Insurable{
        void calculateInsurance();
        void getInsuranceDetails();
    }

}
