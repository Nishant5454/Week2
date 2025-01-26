package problems.Vechicle;

 class Truck extends Vehicle implements Vehicle.Insurable {
    public int day;
    private int policyNumber;
    private int insuranceNumber;
    Truck(String vehicleNumber,String type,int rentalRate,int policyNumber,int insuranceNumber,int day) {
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
            return day*500;
        }
        else{
            return day*1000;
        }
    }
    @Override
    public void calculateInsurance(){
        System.out.println("The insurance of the vechile having "+getVechicleNumber()+" is "+20056);
    }
    @Override
    public void getInsuranceDetails(){
        System.out.println("The insurace of the vechicle having "+getVechicleNumber()+"is "+this.insuranceNumber+"and policy Number is "+this.policyNumber);
    }


}
