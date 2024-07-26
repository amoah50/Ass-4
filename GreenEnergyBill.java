public class GreenEnergyBill extends EnergyBill {
    private double solarContribution; // in kWh

    // Constructor
    public GreenEnergyBill(String customerName, String address, double electricityUsage, double gasUsage, double solarContribution) {
        super(customerName, address, electricityUsage, gasUsage);
        this.solarContribution = solarContribution;
    }

    // Override the method to calculate electricity charge considering solar contribution
    @Override
    public double calculateElectricityCharge() {
        double netElectricityUsage = getElectricityUsage() - solarContribution;
        // Ensure the net usage doesn't go below zero
        netElectricityUsage = Math.max(netElectricityUsage, 0);
        return netElectricityUsage * 0.12;
    }

    // Getters and Setters
    public double getSolarContribution() {
        return solarContribution;
    }

    public void setSolarContribution(double solarContribution) {
        this.solarContribution = solarContribution;
    }
}
