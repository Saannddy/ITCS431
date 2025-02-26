
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Invoice {
    private int invoiceNo;
    private Date date;
    private Customer customer;
    private SalesPerson salesperson;
    private Vehicle purchasedVehicle;
    private TradeInVehicle tradeInVehicle;
    private List<DealerInstalledOption> dealerInstalledOptions;
    private double finalPrice;
    private double taxRate = 0.07; 

    public Invoice(int invoiceNo, Date date, Customer customer, SalesPerson salesperson, Vehicle purchasedVehicle, TradeInVehicle tradeInVehicle) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.customer = customer;
        this.salesperson = salesperson;
        this.purchasedVehicle = purchasedVehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.dealerInstalledOptions = new ArrayList<>();
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SalesPerson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(SalesPerson salesperson) {
        this.salesperson = salesperson;
    }

    public Vehicle getPurchasedVehicle() {
        return purchasedVehicle;
    }

    public void setPurchasedVehicle(Vehicle purchasedVehicle) {
        this.purchasedVehicle = purchasedVehicle;
    }

    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }

    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }

    public List<DealerInstalledOption> getDealerInstalledOptions() {
        return dealerInstalledOptions;
    }

    public void setDealerInstalledOptions(List<DealerInstalledOption> dealerInstalledOptions) {
        this.dealerInstalledOptions = dealerInstalledOptions;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double calculateFinalPrice() {
        double subtotal = purchasedVehicle.getCost();

        if (tradeInVehicle != null) {
            subtotal -= tradeInVehicle.getCost(); 
        }

        for (DealerInstalledOption option : dealerInstalledOptions) {
            subtotal += option.getPrice();
        }

        double taxAmount = subtotal * taxRate;
        finalPrice = subtotal + taxAmount;
        return finalPrice;
    }

    public double getTaxRate() {
        return taxRate * 100; 
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate / 100; 
    }
}