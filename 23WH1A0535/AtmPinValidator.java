package MY_PRACTICE;
import java.util.*;

class PinMisMatchException extends RuntimeException{
	public PinMisMatchException() {
		System.out.println("Your Account has been locked");
	}
}

public class AtmPinValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter account holder name: ");
		String name = scanner.nextLine();
		System.out.println("enter pin no.: ");
		int pinNo = scanner.nextInt();
		System.out.println("enter the correct pinNo: ");
		int tryPin = scanner.nextInt();
		for(int i = 1;i < 3;i++) {
			if(tryPin == pinNo) {
				break;
		}else {
			System.out.println("enter the correct pinNo: ");
			tryPin = scanner.nextInt();
		}
	}myPinNo(tryPin,pinNo);
}

	static void myPinNo(int tryPin, int pinNo) throws PinMisMatchException {
		checkPinNo(tryPin,pinNo);
	}

	static void checkPinNo(int tryPin, int pinNo) {
		if(tryPin != pinNo) {
			throw new PinMisMatchException();
		}else {
			System.out.println("correct pinNo");
		}
	}



	

}
