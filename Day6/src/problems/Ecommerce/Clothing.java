package problems.Ecommerce;

public class Clothing extends Product implements Product.Taxable {
    private String brand_name;
    private int brand_price;
    Clothing(String productId,String name,int price,String brand_name,int brand_price){
        super(productId,name,price);
        this.brand_name=brand_name;
        this.brand_price=brand_price;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public int getbrand_price() {
        return brand_price;
    }

    public void setElectronic_price(int brand_price) {
        brand_price = brand_price;
    }

    public void setElectronic_name(String brand_name) {
        brand_name = brand_name;
    }

    @Override
    public double calculateTax(int brand_price){
        return (0.1*brand_price);
    }
    @Override
    public void  getTaxDetails(){
        System.out.println("This tax Includes"+"over"+this.brand_name+"and the CGST and SGST");
    }

    @Override
    public double calculateDiscount() {
        if(this.brand_price>=500){

               double value=this.brand_price-100;

            return value;
           // System.out.println("The Discount Given on the "+this.brand_name+" is "+value);
        }
        else{
            //System.out.println("Sorry ,No discount applicable at this Cost");
            return 0;
        }
    }
    public void final_price(){
        double inital_Price=this.brand_price;
        double calculateTax=(inital_Price);
        double discountApplied=calculateDiscount();
        double final_Price=inital_Price+calculateTax-discountApplied;
        System.out.println("The final Price for the "+this.brand_name+" is "+final_Price);

    }

}
