import java.util.Scanner;

public class bill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old reading: ");
        int oldReading = scanner.nextInt();
        System.out.print("Enter current reading: ");
        int currentReading = scanner.nextInt();
        int unitsConsumed = currentReading - oldReading;

        int totalCharge = 0;
        
        if (unitsConsumed <= 50) {
            totalCharge = unitsConsumed * 1;
        } else if (unitsConsumed <= 100) {
            totalCharge = (50 * 1) + ((unitsConsumed - 50) * 2);
        } else if (unitsConsumed <= 200) {
            totalCharge = (50 * 1) + (50 * 2) + ((unitsConsumed - 100) * 3);
        } else if (unitsConsumed <= 400) {
            totalCharge = (50 * 1) + (50 * 2) + (100 * 3) + ((unitsConsumed - 200) * 4);
        } else {
            totalCharge = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((unitsConsumed - 400) * 5);
        }
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Charge: Rs." + totalCharge);
        scanner.close();
    }
}
