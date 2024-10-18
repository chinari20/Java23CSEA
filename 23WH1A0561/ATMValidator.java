package project;
import java.util.Scanner;
class PinMisMatchException extends Exception{
	public PinMisMatchException() {
		System.out.println("Sorry.. your account has been locked\n");
	}
}
public class ATMValidator {
	private String accountHolderName;
	private String correctPin;
	private int attempts;
	public ATMValidator(String accountHolderName,String correctPin){
		  this.accountHolderName = accountHolderName;
		  this.correctPin = correctPin ;
		  this.attempts = 0;
	}
	public void validatePin(String inputPin) throws PinMisMatchException{
		if (inputPin.equals(correctPin)) {
			System.out.println("pin valid Successfully ");
		}
		else {
			attempts++;
			System.out.println("Incorrect PIN \n");
			if (attempts >= 3) {                          
				throw new PinMisMatchException();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account holder name: ");
		String accountHolderName = sc.nextLine();                
		System.out.println("Enter the pin you wanted to set: ");
		String correctPin = sc.nextLine();                         
		ATMValidator atmValidator = new ATMValidator(accountHolderName,correctPin);
		for (int i = 0;i < 3; i++) {
			System.out.println("Enter the pin: ");
			String inputPin = sc.nextLine();
			try {
				atmValidator.validatePin(inputPin);
			}

			catch (PinMisMatchException e){

				System.out.println(e.getMessage());

			}
		}

	}

}