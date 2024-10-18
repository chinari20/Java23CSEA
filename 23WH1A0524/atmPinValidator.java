package java524;
import java.util.*;
public class atmPinValidator {
	static int pin;
	static String name;
	static int c=0;
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		try {
			System.out.println("enter account holder name and pin");
			name = s.nextLine();
			pin = s.nextInt();
			validatePin();
		}
		catch(invalidPinException e) {
			e.printStackTrace();
		}
	} 
	static void validatePin() throws invalidPinException {
		for(int i=0;i<3;i++) {
			System.out.println("enter pin:");
			int p = s.nextInt();
			if(p==pin) {
				System.out.println("you enterd valid pin");
				break;
			}
			else {
				c++;
			}
		}
		if (c==3) {
			throw new invalidPinException();
		}
}
