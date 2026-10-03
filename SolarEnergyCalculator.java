package hackathon;

import java.util.Scanner;

public class SolarEnergyCalculator {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter morning energy generated (in kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generated (in kWh): ");
        double evening = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morning, evening);

        System.out.printf("Total energy generated: %.2f kWh%n", totalEnergy);

        scanner.close();
    }
}