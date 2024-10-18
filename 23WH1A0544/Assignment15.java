
package project;

import java.util.Scanner;

class PinMisMatchException extends Exception{

	public PinMisMatchException() {

		System.out.println("Sorry.. your account has been locked\n");

	}

}



public class Assignment15 {

	private String accountHolderName;

	private String correctPin;

	private int attempts;

	

	//constructor

	public Assignment15(String accountHolderName,String correctPin){

		  this.accountHolderName = accountHolderName;

		  this.correctPin = correctPin ;

		  this.attempts = 0;

	}

	

	//checks the validity of the pin

	public void validatePin(String inputPin) throws PinMisMatchException{

		

		

		if (inputPin.equals(correctPin)) {

			System.out.println("pin valid Successfully ");//if valid prints successful

		}

		else {

			attempts++;

			System.out.println("Incorrect PIN \n");

			if (attempts >= 3) {                          //if attempts greater then 3 throws exception

				throw new PinMisMatchException();

			}

		}

				

	}

	

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account holder name: ");

		String accountHolderName = sc.nextLine();                 //reads accout holder name

		

		System.out.println("Enter the pin you wanted to set: ");

		String correctPin = sc.nextLine();                         //reads correct pin

		Assignment15 atmValidator = new Assignment15(accountHolderName,correctPin);

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

