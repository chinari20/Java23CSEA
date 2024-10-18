//Design a an application called ATM PIN Validator
//which will read the acc holder name and pin no
//if pin no is incorrect while trying in 3 times
//PinMisMatchException object  will throw an exception called Sorry..Your Account Has been Locked

package javaDemo;
import java.util.Scanner;

class PinMisMatchException extends RuntimeException{
	PinMisMatchException(){
		System.out.println("enter correct pin");
	}
}
public class AtmMisMatch {
	public static void main(String args[]) {
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			try {
				int pin = sc.nextInt();
				pinNo(pin);
			}
			catch(PinMisMatchException e) {
				e.printStackTrace();
			}
		}
		System.out.println("sorry..your account is blocked");
	}

	private static void pinNo(int pin) {
		int pinNum=523;
		if(pin!=pinNum) {
			throw new PinMisMatchException();
		}
		else {
			System.out.println("succesfull");
			System.exit(0);
		}
		
	}
}
