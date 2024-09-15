/*  JavaSE application to generate Electricity bill   (use if-else-if ladder)
inputs are old reading and current reading and generate the bill by following  slabs/ranges: Scan the inputs using Scanner class
0-50: Rs.1
50-100: Rs2
100-200: Rs.3
200-400: Rs.4
>400: Rs.5
example if the number of units are 120 then the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210
*/
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old reading : ");
        int oldReading = scanner.nextInt();
        System.out.print("Enter current reading : ");
        int currentReading = scanner.nextInt();
        int unitsConsumed = currentReading - oldReading;

        int billAmount = 0;

        if (unitsConsumed > 400) {
            billAmount += (unitsConsumed - 400) * 5;
            unitsConsumed = 400;
        }
        if (unitsConsumed > 200) {
            billAmount += (unitsConsumed - 200) * 4;
            unitsConsumed = 200;
        }
        if (unitsConsumed > 100) {
            billAmount += (unitsConsumed - 100) * 3;
            unitsConsumed = 100;
        }
        if (unitsConsumed > 50) {
            billAmount += (unitsConsumed - 50) * 2;
            unitsConsumed = 50;
        }
        if (unitsConsumed > 0) {
            billAmount += unitsConsumed * 1;
        }

        System.out.println("Total bill amount: Rs." + billAmount);
    }
}
