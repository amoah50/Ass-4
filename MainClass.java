import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // the Default customer name
       try (Scanner scanner = new Scanner(System.in)){

        // Sample inputs
        String name = "Francis";
        String address = "Huntspoint";
        double electricityUsage = 500;
        double gasUsage = 300;
        String usesSolar = "yes";
        double solarContribution = 100;

        // Displaying sample inputs
        System.out.println("Sample Inputs:");
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Electricity Usage (kWh): " + electricityUsage);
        System.out.println("Gas Usage (units): " + gasUsage);
        System.out.println("Uses Solar Energy: " + usesSolar);
        System.out.println("Solar Energy Contribution (kWh): " + solarContribution);
        System.out.println();

        EnergyBill bill;
        if (usesSolar.equalsIgnoreCase("yes")) {
            bill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarContribution);
        } else {
            bill = new EnergyBill(name, address, electricityUsage, gasUsage);
        }

        // Calculate and display the total bill
        double totalBill = bill.calculateTotalBill();
        System.out.println("Total Bill for " + name + ": $" + totalBill);

        scanner.close();
    }
    }
}
