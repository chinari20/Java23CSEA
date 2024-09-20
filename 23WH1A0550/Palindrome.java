package java550;
import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int length=s.length();
		for(int i=0;i<length/2;i++) {
			if(s.charAt(i)!=s.charAt(length -i-1)) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s=sc.nextLine();
		if(isPalindrome(s)) {
			System.out.println("\\"+s+"\\ is palindrome!");
			}
		else {
			System.out.println("\\"+s+"\\ is not a palindrome!");
		}
		

	}

}
