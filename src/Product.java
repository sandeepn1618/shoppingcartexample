import java.util.Objects;

public class Product {
    private  String prodID;
    private  String prodName;
    private  String categoryName;
    private int price;
    private int quant;

    public Product() {
        super();
    }

    public Product(String prodID, String prodName, String categoryName, int price, int quant) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.categoryName = categoryName;
        this.price = price;
        this.quant = quant;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quant == product.quant && prodID.equals(product.prodID) && prodName.equals(product.prodName) && categoryName.equals(product.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodID, prodName, categoryName, price, quant);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID='" + prodID + '\'' +
                ", prodName='" + prodName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", quant=" + quant +
                '}';
    }
}
