package javaprogram;
import java.util.Scanner;
public class electricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old reading: ");
        int oldReading = scanner.nextInt();
        System.out.print("Enter current reading: ");
        int currentReading = scanner.nextInt();
        int units = currentReading - oldReading;
        int billAmount = 0;
        if (units <= 50) {
            billAmount = units * 1;
        } else if (units <= 100) {
            billAmount = (50 * 1) + ((units - 50) * 2);
        }
        else if (units <= 200) {
            billAmount = (50 * 1) + (50 * 2) + ((units - 100) * 3);
        } 
        else if (units <= 400) {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
        } 
        else {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
        }
  
        System.out.println("Total bill amount: Rs." + billAmount);
      
        scanner.close();
    }
}
