package cse_23wh1a0558;

import java.util.Scanner;

public class ATMpinvalidator {
    
    static class PinMismatchException extends Exception {
        public PinMismatchException(String message) {
            super(message);
        }
    }

    private static final String CORRECT_PIN = "1234"; 
    private static final int MAX_ATTEMPTS = 3; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine(); 
        int attempts = 0; 

        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine(); 
                     if (enteredPin.equals(CORRECT_PIN)) {
                System.out.println("Access granted! Welcome, " + accountHolderName + "!");
                scanner.close();                 return;
            } else {
                attempts++; 
                System.out.println("Incorrect PIN. You have " + (MAX_ATTEMPTS - attempts) + " attempts left.");
            }
        }

        
        try {
            throw new PinMismatchException("Sorry.. Your Account Has Been Locked.");
        } catch (PinMismatchException e) {
            System.out.println(e.getMessage()); 
        } finally {
            scanner.close();         }
    }
}
