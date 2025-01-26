package problems.Vechicle;

class Bike extends Vehicle implements Vehicle.Insurable {
    public int day;
    private int policyNumber;
    private int insuranceNumber;
    Bike(String vehicleNumber,String type,int rentalRate,int policyNumber,int insuranceNumber,int day) {
        super(vehicleNumber, type, rentalRate);
        this.policyNumber = policyNumber;
        this.insuranceNumber = insuranceNumber;
        this.day=day;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }
    @Override
    public int calculateRentalcost(int day ){
        if(day>0&&day<=5){
            return day*50;
        }
        else{
            return day*100;
        }
    }
    @Override
    public void calculateInsurance(){
        System.out.println("The insurance of the vechile having "+getVechicleNumber()+" is "+36055);
    }
    @Override
    public void getInsuranceDetails(){
        System.out.println("The insurace of the vechicle having "+getVechicleNumber()+"is "+this.insuranceNumber+"and policy Number is "+this.policyNumber);
    }


}
