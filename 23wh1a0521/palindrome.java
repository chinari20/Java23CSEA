package java_practise;
import java.util.*;
public class isPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String palindromeString = scanner.next();
		String tempString = "";
		for(int i=palindromeString.length()-1;i>=0;i--) {
			Character ch = palindromeString.charAt(i);
			tempString += ch;
		}
		if(palindromeString.equals(tempString)) {
			System.out.println("Given string is a palindrome.");
		}
		else {
			System.out.print("Given string is not a palindrome.");
		}
	}
}
