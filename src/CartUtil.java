import java.util.ArrayList;
import java.util.List;

public class CartUtil {
    public static List<Cart> cartList = new ArrayList<>();

    public static void addProductToCart(Cart cart) {
        int index = -1;
        Cart temp = null;
        for (Cart c:
             cartList) {
            index++;
            if (c.getCustID().equals(cart.getCustID()) && c.getProdID().equals(cart.getProdID())){
            temp = c;
            break;
            }
        }if (temp == null){
            cartList.add(cart);
            System.out.println("Cart added");
        }else{
            temp.setQty(temp.getQty() + cart.getQty());
            cartList.set(index,temp);
            System.out.println("Cart Updated");
        }
    Product p = ProductUtil.findProduct(cart.getProdID());
        p.setQuant(p.getQuant()- cart.getQty());
    }
}
