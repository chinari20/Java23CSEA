import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter old Reading.");
        int oldReading = sc.nextInt();
      
        System.out.println("Enter current Reading.")
        int currentReading = sc.nextInt();
      
        int units = currentReading - oldReading,bill;
        
        if (units <= 50) {
            bill = units * 1;
        } else if (units <= 100) {
            bill = (50 * 1) + (units - 50) * 2;
        } else if (units <= 200) {
            bill = (50 * 1) + (50 * 2) + (units - 100) * 3;
        } else if (units <= 400) {
            bill = (50 * 1) + (50 * 2) + (100 * 3) + (units - 200) * 4;
        } else {
            bill = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (units - 400) * 5;
        }
        
        System.out.println("Total bill: " + bill);
        scan.close();
    }
}
