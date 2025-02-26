

public class Customer extends Person { 
	private static int runID = 0;
    private int customerID;
    private String address;

    public Customer(String name, String phoneNumber, String address) {
        super(name, phoneNumber); 
        this.customerID = ++runID;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", " + super.toString() + ", Address: " + address;
    }
}