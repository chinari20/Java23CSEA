package java_assignment;
import java.util.Scanner;
import java.lang.Exception;
class PinmismatchException extends Exception{
	PinmismatchException(String Message){
		super(Message);
	}
}
public class Atmmismatch_exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter holdername");
		String holdername=sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter correct pin number");
		String correctpin=sc.nextLine();
		if(!name.equals(holdername)) {
			System.out.println("account holder name doesn't match");
		}
		int attempts=0;
		while(attempts<3) {
			System.out.println("enter pin number");
			String enterpin=sc.nextLine();
			if(enterpin.equals(correctpin)) {
				System.out.println("pin match");
				break;
			}
			else {
				System.out.println("wrong pin, try again");
				attempts++;
				try {
					throw new PinmismatchException("sorry,your account has been locked");
				}
				catch(PinmismatchException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}	
			
}
