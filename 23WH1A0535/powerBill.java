package javapractice;
import  java.util.*;
public class powerBill {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter old meter reading: ");
		int oldReading = scanner.nextInt();
		System.out.print("Enter current meter reading: ");
		int currentReading = scanner.nextInt();
	
		scanner.close();
		if (currentReading < oldReading) {
			System.out.println("Current reading cannot be less than old reading.");
			return;
		}
        int units = currentReading - oldReading;
		int billAmount = 0;
		if (units <= 50) {
			billAmount = units * 1;
		}
		else if (units <= 100) {
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
		System.out.println("Units Consumed: " + units);
		System.out.println("Total Bill Amount: Rs." + billAmount);
		    }
}


