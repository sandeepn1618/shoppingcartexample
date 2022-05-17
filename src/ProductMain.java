import java.util.Scanner;

public class ProductMain {
    public static Scanner scan = new Scanner(System.in);
    public static Customer customer = null;

    public static String prodId = "";
    public static int quant = 0;
    public static void main(String[] args) {
        //showProducts();
        int choice = 0;
        do {
            showProducts();
            System.out.println("1.Add product to your cart");
            System.out.println("2. View cart items");
            System.out.println("3.Delete Cart");
            System.out.println("4.Exit");
            System.out.println("Enter you choice");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    if(customer == null) {
                        viewCustomerInfo();
                    }
                    showProducts();
                    readProductDetails();
                    createCartObjectandAddtoCart();
                    //addProductToYouCart();
                    break;
                case 2:
                    viewItemsinYourCart();
                    break;
                case 3:
                    deletItem();
                    break;
                default:
                    System.out.println("Thank You");;
            }
        }while (choice<4);

    }

    private static void createCartObjectandAddtoCart() {
        Cart cart = new Cart(ProductUtil.getProductName(customer.getCustID()),prodId,ProductUtil.getProdPrice(prodId),quant);
        CartUtil.addProductToCart(cart);
    }

    private static void readProductDetails() {
        System.out.println("Enter Product ID");
        prodId = scan.next();
        System.out.println("Enter Quantity");
        quant = scan.nextInt();
    }

    private static void viewCustomerInfo() {
         customer = new Customer();
         String id = "";
         String name = "";
         String city = "";
        System.out.println("Enter ID");
        id = scan.next();
        System.out.println("Enter Name");
        name = scan.next();
        System.out.println("Enter City");
        city = scan.next();
    }

    private static void deletItem() {
        Cart temp = null;
        for (Cart c: CartUtil.cartList
             ) {
            if(c.getCustID().equals(customer.getCustID())){
                temp = c;
                break;
            }
            
        }
        CartUtil.cartList.remove(temp);
        System.out.println("Item Deleted");
    }

    private static void viewItemsinYourCart() {
        //System.out.println("view cart items");
        for (Cart c:
                CartUtil.cartList) {
                int price =  ProductUtil.getProdPrice(c.getProdID());
                String podName = ProductUtil.getProductName(c.getProdID());
                System.out.println(podName+"--"+c.getPrice()+"--"+c.getQty()+(c.getQty()*price ));
        }
    }

    private static void addProductToYouCart() {
        System.out.println("Product added");
    }

    public static void showProducts(){
        System.out.printf("%-8s%-15s%-12s%-8s%-12s","PROD-ID","PRODUCT NAME","CAT-TYPE","PRICE","QUAN");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");

        for (Product p:ProductUtil.list
             ) {
            System.out.printf("%-8s%-15s%-12s%-8s%-12s",p.getProdID(),p.getProdName()
                    ,p.getCategoryName(),p.getPrice(),p.getQuant());
            System.out.println();
                      /* System.out.println("Product I: "+p.getProdID()+ "Product Name :" +p.getProdName() +
                    " Cat Name : " +p.getCategoryName()+
                    "Price $" +p.getPrice()+
                    "QTY : "+p.getQuant());*/
        }
    }
}
