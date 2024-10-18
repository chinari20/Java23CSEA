package JavaProblems;
import java.util.Scanner;
import java.lang.Exception;

class PinMismatchException extends Exception{
	public PinMismatchException(String Message) {
		super(Message);
	}
}


public class AtmException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the exact acc Holder name: ");
		String accHolderName = sc.nextLine();

		System.out.println("Enter the exact pin number: ");		
		String correctPin = sc.nextLine(); 

		
	    System.out.println("Enter account holder name: ");
        String enteredName = sc.nextLine();   
	    
       	if(!enteredName.equals(accHolderName)) {
            System.out.println("Account holder name does not match.");
            sc.close();
            return;
        }
        
       int attempts = 0;
       while (attempts <= 3) {
    	   System.out.print("Enter the PIN again: ");
           String enteredPin = sc.nextLine();
           
           if (enteredPin.equals(correctPin)) {
               System.out.println("PIN accepted. Access granted.");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
                attempts++;
                
                try {
                    throw new PinMismatchException("Sorry, Your Account Has Been Locked.");
                } catch (PinMismatchException e) {
                    System.out.println(e.getMessage());
                }

            }
           
        }

    	          }

	}


