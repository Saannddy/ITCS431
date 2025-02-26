
public class TradeInVehicle extends Vehicle {

    private int yearOfUse;

    public TradeInVehicle(String serialNumber, String name, String model, int year, String manufacturer, double cost, int yearOfUse) {
        super(serialNumber, name, model, year, manufacturer, cost);
        this.yearOfUse = yearOfUse;
    }

    public int getYearOfUse() {
        return yearOfUse;
    }

    public void setYearOfUse(int yearOfUse) {
        this.yearOfUse = yearOfUse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year of Use: " + yearOfUse;
    }

}