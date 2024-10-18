package java504;
import java.util.*;

class PinMisMatchException extends RuntimeException {
	public PinMisMatchException() {
		System.out.println("Sorry....Your account has been locked");
	}
}

public class ATMpin {
	public static void main(String[] args) {
		try {
			Pin_no();
		}catch(PinMisMatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("executed..");
		}

	}

	static void Pin_no() throws PinMisMatchException {
		account_details();
	}
	static void account_details() {
		Scanner n = new Scanner(System.in);
		System.out.println("enter the account name");
		String name = n.nextLine();
		System.out.println("enter original pin no.");
		int original_pin = n.nextInt();
		int i=1,pin;
		System.out.println("enter the pin no.");
		pin = n.nextInt();
		while(i<=3) {
			if(pin == original_pin){
				System.out.println("correct pin");
				break;		
			}
		
			else {
				System.out.println("wrong no.,enter the correct pin no.");
				pin = n.nextInt();
				i = i+1;
			}
		if(i==3){
			throw new PinMisMatchException();
		}
	}
}
}
