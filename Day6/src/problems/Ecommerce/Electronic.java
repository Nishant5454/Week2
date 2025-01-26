package problems.Ecommerce;

public class Electronic extends Product implements Product.Taxable {
    private String Electronic_name;
    private int Electronic_price;
    Electronic(String productId,String name,int price,String Electronic_name,int Electronic_price){
        super(productId,name,price);
        this.Electronic_name=Electronic_name;
        this.Electronic_price=Electronic_price;
    }

    public String getElectronic_name() {
        return Electronic_name;
    }

    public int getElectronic_price() {
        return Electronic_price;
    }

    public void setElectronic_price(int electronic_price) {
        Electronic_price = electronic_price;
    }

    public void setElectronic_name(String electronic_name) {
        Electronic_name = electronic_name;
    }

    @Override
    public double calculateTax(int Electronic_price){
        return (0.1*Electronic_price);
    }
    @Override
    public void  getTaxDetails(){
        System.out.println("This tax Includes"+"over"+this.Electronic_name+"and the CGST and SGST");
    }

    @Override
    public double calculateDiscount() {
        if(this.Electronic_price>=500){
            double value=this.Electronic_price-100;
            return value;

            //System.out.println("The Discount Given on the "+this.Electronic_name+" is "+value);
        }
        else{
            return 0;
            //System.out.println("Sorry ,No discount applicable at this Cost");
        }
    }
    public void finalPrice(){
        int initialPrice=this.Electronic_price;
        double calcualteTax=calculateTax(initialPrice);
        double calculateDiscount=calculateDiscount();
        double final_price=initialPrice+calcualteTax-calculateDiscount;
        System.out.println("The final Price for the "+this.Electronic_name+" is "+final_price);
    }

}
