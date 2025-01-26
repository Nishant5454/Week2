package problems.Ecommerce;

import java.util.ArrayList;

public class Ecommerce {
    public static void main(String[]args){
        ArrayList<Product>emp=new ArrayList<>();
        Grocerie gc=new Grocerie("SRF 0103","SurfExcel",200,"Detergent",200);
        gc.finalprice();
       // emp.add(gc);
        Electronic electronic=new Electronic("FN203","FAN",300,"StandFan",300);
        electronic.finalPrice();
       // emp.add(electronic);
        Clothing clothing=new Clothing("ST3040","Shirt",2000,"LV",2000);
        clothing.final_price();
      //  emp.add(clothing);




    }
}
