
public class SalesPerson extends Person { 
	private static int runID = 0;
    private int salespersonID;
    private String experiences;
    private String phoneNumber;


	// Constructor
    public SalesPerson(String name, String phoneNumber, String experiences) {
        super(name, phoneNumber); // Call Person constructor
        this.salespersonID = ++runID;
        this.phoneNumber = phoneNumber;
        this.experiences = experiences;
    }

    public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    public int getSalespersonID() {
		return salespersonID;
	}

	public void setSalespersonID(int salespersonID) {
		this.salespersonID = salespersonID;
	}

	public String getExperiences() {
		return experiences;
	}

	public void setExperiences(String experiences) {
		this.experiences = experiences;
	}

	@Override
    public String toString() {
        return "Salesperson ID: " + salespersonID + ", " + super.toString() + ", Experiences: " + experiences + ", Phone no: " + this.phoneNumber;
    }
}