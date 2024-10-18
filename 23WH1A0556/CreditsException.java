package JavaProblems;
import java.util.Scanner;
import java.lang.Exception;

class CreditsNotSufficient extends Exception{
	CreditsNotSufficient(String Message){
		super(Message);
	}
}

public class CreditsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of credits: ");

		int Credits = sc.nextInt();
				sc.close();
		
		try {
			checkCredits(Credits); 
            useCredits(Credits);    
            
		}catch (CreditsNotSufficient e) {
            System.out.println("Note: " + e.getMessage());
        }
		}

static void checkCredits(int Credits) throws CreditsNotSufficient {
    if (Credits < 50) {
        throw new CreditsNotSufficient("Credits should be greater than or equal to 50");
    }
    System.out.println("Credits are sufficient: " + Credits);
}

static void useCredits(int Credits) throws CreditsNotSufficient {
    System.out.println("Using credits: " + Credits);
}
}
