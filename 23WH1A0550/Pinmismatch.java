package helloWorld;
import java.util.Scanner;

public class Pinmismatch {
    public static final int attempts = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, user_pin,correct_pin;

        System.out.println("Enter the account holder name:");
        name = sc.nextLine();
        System.out.println("enter correct pin");
        correct_pin=sc.nextLine();

        for (int i = 0; i < attempts; i++) {
            System.out.println("Enter the pin:");
            user_pin = sc.nextLine();
            try {
                pinValidation(user_pin,correct_pin);
                System.out.println("Access granted. Enjoy!");
                break; 
            } catch (PinMisMatchException e) {
                e.getMessage(); 
                if (i == 2)  System.out.println("Too many attempts!");
                   
                
            }
        }
        sc.close(); 
    }

    static void pinValidation(String user_pin,String correct_pin) throws PinMisMatchException {
        pinChecking(user_pin,correct_pin);  
    }

    static void pinChecking(String user_pin,String correct_pin) throws PinMisMatchException {
        if (!user_pin.equals(correct_pin)) {
            throw new PinMisMatchException(); 
        }
    }
}

class PinMisMatchException extends Exception {
    public PinMisMatchException() {
        System.out.println("Pin is incorrect ... please check.");
    }
}

