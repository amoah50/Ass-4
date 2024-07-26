public class EnergyBill {
    // Attributes
    private String customerName;
    private String address;
    private double electricityUsage; // in kWh
    private double gasUsage; // in units

    // Constants for rates
    private static final double ELECTRICITY_RATE = 0.12; // $ per kWh
    private static final double GAS_RATE = 0.09; // $ per unit

    // Constructor
    public EnergyBill(String customerName, String address, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    // Methods to calculate charges
    public double calculateElectricityCharge() {
        return electricityUsage * ELECTRICITY_RATE;
    }

    public double calculateGasCharge() {
        return gasUsage * GAS_RATE;
    }

    // Method to calculate total bill
    public double calculateTotalBill() {
        return calculateElectricityCharge() + calculateGasCharge();
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public double getGasUsage() {
        return gasUsage;
    }

    public void setGasUsage(double gasUsage) {
        this.gasUsage = gasUsage;
    }
}
