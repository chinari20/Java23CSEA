package java504;
import java.util.*;

class  CreditsNotSuffiecientException extends RuntimeException{
	public CreditsNotSuffiecientException() {
		System.out.println("credits not sufficient..");
	}
}

public class Credits{
	public static void main(String[] args) {
		try {
			credit(60);
		}catch(CreditsNotSuffiecientException e) {
			e.printStackTrace();
		}finally {
			System.out.println("exeuted..");
		}
	}
	static void credit(int cred) throws CreditsNotSuffiecientException {
		 creditscheck(cred);
	}
		static void creditscheck(int cred) {
		   if(cred < 50) {
			   throw new CreditsNotSuffiecientException();
		   }
		   else {
			   System.out.println("credits are sufficient...");
		   }
		  }	
	}
