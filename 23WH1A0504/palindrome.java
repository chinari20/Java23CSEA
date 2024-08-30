package javap;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		String ch ="";
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i)+ch ;
		}
		if(s.equals(ch)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}

