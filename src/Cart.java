import java.util.Objects;

public class Cart {

    private String custID;
    private String prodID;
    private int price;
    private int qty;

    public Cart() {
        super();
    }

    public Cart(String custID, String prodID, int price, int qty) {
        this.custID = custID;
        this.prodID = prodID;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return price == cart.price && qty == cart.qty && Objects.equals(custID, cart.custID) && Objects.equals(prodID, cart.prodID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custID, prodID, price, qty);
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
