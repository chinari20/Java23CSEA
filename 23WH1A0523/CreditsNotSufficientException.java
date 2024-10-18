//Create and Raise the exception CreditsNotSuffiecientException if  credits are less than 50 with different 
//caller methods. and handle them..

package javaDemo;

class CreditsNotSufficientException extends RuntimeException{
	CreditsNotSufficientException(){
		System.out.println("credits are insufficient plz check..");
	}
}
public class Checkcredits {
	public static void main(String args[]) {
		try {
			myCredits(51);
		}
		catch(CreditsNotSufficientException e) {
			e.printStackTrace();
		}
	}
	static void myCredits(int credits) {
		if(credits<=50) {
			throw new CreditsNotSufficientException();
		}
		else {
			System.out.println("credits are sufficient");
		}
	}
}

