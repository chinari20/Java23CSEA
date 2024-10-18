package 545;
import java.util.Scanner;
import java.lang.Exception;

class PinMisMatchException extends Exception {

 public PinMisMatchException(String message) {

     super(message);

 }

}



//Account class representing a bank account

class Account {

 private String holderName;

 private String pin;

 private int attempts;

 private boolean isLocked;



 public Account(String holderName, String pin) {

     this.holderName = holderName;

     this.pin = pin;

     this.attempts = 0;

     this.isLocked = false;
}

 public boolean validatePin(String inputPin) throws PinMisMatchException {

     if (isLocked) {

         throw new PinMisMatchException("Sorry.. Your Account Has Been Locked");

     }

     if (!inputPin.equals(pin)) {

         attempts++;

         if (attempts >= 3) {

             lockAccount();

             throw new PinMisMatchException("Sorry.. Your Account Has Been Locked");

         }

         return false;

     }

     return true;

 }


 private void lockAccount() {

     isLocked = true;

 }

}

class ATM {

 private Account account;



 public ATM(Account account) {

     this.account = account;

 }


 public void accessAccount(String inputPin) {

     try {

         if (account.validatePin(inputPin)) {

             System.out.println("Access Granted!");

         } else {

             System.out.println("Incorrect PIN. Try again.");

         }

     } catch (PinMisMatchException e) {

         System.out.println(e.getMessage());

     }

 }

}


public class AtmPinMismatch {

 public static void main(String[] args) {

     Account myAccount = new Account("John Doe", "1234");

     ATM atm = new ATM(myAccount);



     java.util.Scanner scanner = new java.util.Scanner(System.in);

     

     for (int i = 0; i < 3; i++) {

         System.out.print("Enter your PIN: ");

         String pinInput = scanner.nextLine();

         atm.accessAccount(pinInput);

     }

     

     scanner.close();

 }

}
