package com.LabAssignment;
import java.util.Scanner;
//Custom exception for PIN mismatch
class PinMismatchException extends RuntimeException {
    public PinMismatchException(String message) {
        super(message);
    }
}
public class ATM_Validator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Account holder details
	        String accountHolderName = "Diya Mandal";  // Sample account holder name
	        String correctPin = "Diya@060605";              // Sample correct PIN
	        int maxAttempts = 3;                      // Maximum number of attempts
	        int attempts = 0;                         // Counter for attempts

	        System.out.println("Welcome to the ATM, " + accountHolderName + "!");
	        
	        while (attempts < maxAttempts) {
	            System.out.print("Enter your PIN: ");
	            String inputPin = scanner.nextLine();

	            if (inputPin.equals(correctPin)) {
	                System.out.println("PIN accepted. Access granted.");
	                break;  // Exit the loop if the PIN is correct
	            } else {
	                attempts++;
	                System.out.println("Incorrect PIN. You have " + (maxAttempts - attempts) + " attempt(s) left.");
	            }

	            // If the maximum number of attempts has been reached
	            if (attempts == maxAttempts) {
	                throw new PinMismatchException("Sorry.. Your Account Has Been Locked.");
	            }
	        }

	        scanner.close();
	    }
	}