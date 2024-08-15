import java.util.Scanner;

public class electricity_bill {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int units = obj.nextInt();
        
        int bill = 0;

        if (units >= 0 && units <= 50) {
            bill = units * 1;
        } else if (units <= 100) {
            bill = 50 * 1 + (units - 50) * 2;
        } else if (units <= 200) {
            bill = 50 * 1 + 50 * 2 + (units - 100) * 3;
        } else if (units <= 400) {
            bill = 50 * 1 + 50 * 2 + 100 * 3 + (units - 200) * 4;
        } else {
            bill = 50 * 1 + 50 * 2 + 100 * 3 + 200 * 4 + (units - 400) * 5;
        }

        System.out.println("The number of units is: " + units);
        System.out.println("The bill amount is: Rs. " + bill);

        obj.close();
    }
}
