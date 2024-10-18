package cse_23wh1a0541;

import java.util.Scanner;

//Step 1: Define the custom exception
class PinMisMatchException extends Exception {
 public PinMisMatchException(String message) {
     super(message);
 }
}

//Step 2: Implement the ATM PIN Validator class
public class ATM {
 private static final String CORRECT_PIN = "1234"; // Example correct PIN
 private String accountHolderName;

 public ATM(String name) {
     this.accountHolderName = name;
 }

 public void validatePin() throws PinMisMatchException {
     Scanner scanner = new Scanner(System.in);
     int attempts = 0;
     while (attempts < 3) {
         System.out.print("Enter your PIN: ");
         String enteredPin = scanner.nextLine();
         if (enteredPin.equals(CORRECT_PIN)) {
             System.out.println("PIN validated successfully. Welcome, " + accountHolderName + "!");
             return; // Exit method if PIN is correct
         } else {
             attempts++;
             System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
         }
     }
     // If the user fails after 3 attempts, throw the exception
     throw new PinMisMatchException("Sorry.. Your Account Has been Locked");
 }

 // Main method to run the application
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter your account holder name: ");
     String name = scanner.nextLine();

     ATM atmValidator = new ATM(name);

     try {
         atmValidator.validatePin();
     } catch (PinMisMatchException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
