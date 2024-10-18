package MY_PRACTICE;
import java.util.*;

class CreditsNotSufficientException extends RuntimeException{
	public CreditsNotSufficientException() {
		System.out.println("Credits insufficient pls check");
	}
}

public class ExceptionCredits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of credits");
		int credits = scanner.nextInt();
		try {
			myCredits(credits);
		}catch (CreditsNotSufficientException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
	

	static void myCredits(int credits) throws CreditsNotSufficientException{
		checkCredits(credits);
	}

	static void checkCredits(int credits) {
		if(credits < 50) {
			throw new CreditsNotSufficientException();
		}else {
			System.out.println("enough credits");
		}
	}

}

