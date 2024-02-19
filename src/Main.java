//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;
        double milesPerGallon = 0.0;
        double costPerGallon = 0.0;
        double gasInTank = 0.0;
        do {
            System.out.println("Enter the number of gallons: ");
            gasInTank = scanner.nextDouble();
            System.out.println("Enter the fuel efficiency in Miles per Gallon: ");
            milesPerGallon = scanner.nextDouble();
            System.out.println("Enter the price of gas per gallon");
            costPerGallon = scanner.nextDouble();
            if (gasInTank > 0.0) {
                ready = true;
                if (milesPerGallon > 0.0) {
                    ready = true;
                    if (costPerGallon > 0.0) {
                        ready = true;
                    }else ready = false;
                }else ready = false;
            }else ready = false;
        }while (!ready);
        double costPer100 = (100/milesPerGallon) * costPerGallon;
        System.out.println("The cost per 100 miles is "+costPer100);
        double distanceRemaining = gasInTank * milesPerGallon;
        System.out.println("The distance left the vehicle can travel is " +distanceRemaining+ " Miles.");
    }
}