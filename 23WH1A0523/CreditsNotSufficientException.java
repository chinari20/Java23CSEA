//Create and Raise the exception CreditsNotSuffiecientException if  credits are less than 50 with different 
//caller methods. and handle them..

package javaDemo;

class CreditsNotSufficientException extends RuntimeException {
	public CreditsNotSufficientException(String message) {
		super(message);
	}
}
public class myCredits{
	public static void main(String args[]) {
		try {
			System.out.println("checking credits of purchase");
			checkCredits(30);
		}
		catch(CreditsNotSufficientException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("checking credits for goods");
			checkCredits(70);
		}
		catch(CreditsNotSufficientException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void checkCredits(int credits) {
		if(credits<=50) {
			throw new CreditsNotSufficientException("credits are insufficient");
		}
		else {
			System.out.println("credits are sufficient");
		}
		
	}
}
