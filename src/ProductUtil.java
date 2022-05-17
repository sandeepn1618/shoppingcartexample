import java.util.ArrayList;
import java.util.List;

public class ProductUtil {
public static List<Product> list = new ArrayList<>();
static {
    list.add(new Product("P101","WASHINGMACHINE","LAUNDRY",35499,20));
    list.add(new Product("P102","IPHONE","MOBILE",19999,20));
    list.add(new Product("P103","DRYER","ELECTONICS",2000,20));
    list.add(new Product("P104","S22 ULTRA","MOBILE",2000,20));
}
   public static String getProductName(String id){
       String prodName= "";
       for (Product p:list
            ) {
           if (p.getProdID().equals(id)){
               prodName = p.getProdName();
               break;
           }
           
       }
       return prodName;
   }
   public static int getProdPrice(String id){
    int price  = 0;
       for (Product p:list
            ) {
           if (p.getProdID().equals(id)){
               price = p.getPrice();
               break;
           }

       }
       return price;
   }

    public static Product findProduct(String prodID) {
    Product temp = null;
        for (Product p:
             list) {
            if(p.getProdID().equals(prodID)){
                temp = p;
                break;
            }
            
        }
        return temp;
    }
}
