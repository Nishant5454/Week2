package problems.Ecommerce;

class Grocerie extends Product implements Product.Taxable {
    private String Grocerie_name;
    private int Grocerie_price;
    Grocerie(String productId,String name,int price,String Grocerie_name,int Grocerie_price){
        super(productId,name,price);
        this.Grocerie_name=Grocerie_name;
        this.Grocerie_price=Grocerie_price;
    }

    public String getGrocerie_name() {
        return Grocerie_name;
    }

    public int getGrocerie_price() {
        return Grocerie_price;
    }

    public void setGrocerie_price(int grocerie_price) {
        Grocerie_price = grocerie_price;
    }

    public void setGrocerie_name(String grocerie_name) {
        Grocerie_name = grocerie_name;
    }
    @Override
    public double calculateTax(int Grocerie_price){
        return (0.1*Grocerie_price);
    }
    @Override
    public void  getTaxDetails(){
        System.out.println("This tax Includes"+this.Grocerie_name+"and the CGST and SGST");
    }

    @Override
    public double calculateDiscount() {
        if(this.Grocerie_price>=500){
            return 100;

            //System.out.println("The Discount Given on the "+this.Grocerie_name+" is "+value);
        }
        else{
           // System.out.println("Sorry ,No discount applicable at this Cost");
            return 0;
        }
    }
    public void finalprice(){
        int initialPrice=this.Grocerie_price;
        double totalapplicableTax=calculateTax(initialPrice);
        double discount=calculateDiscount();
      //  int finalprice=initialPrice+totalapplicableTax-calculateDiscount();
        double finalprice=initialPrice+totalapplicableTax-discount;
        //System.out.println("Total final Price is "+initialPrice+totalapplicableTax-calculateDiscount(););
        System.out.println("The final Price for the Product is "+finalprice);



    }
}
/*
Extend it into concrete classes: Electronics, Clothing, and Groceries.
 */