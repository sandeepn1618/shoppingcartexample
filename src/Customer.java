import java.util.Objects;

public class Customer {
    private  String custID;
    private  String custName;
    private  String city;

    public Customer() {
        super();
    }

    public Customer(String custID, String custName, String city) {
        this.custID = custID;
        this.custName = custName;
        this.city = city;
    }

    public String  getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custID == customer.custID && custName.equals(customer.custName) && city.equals(customer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custID, custName, city);
    }
}
