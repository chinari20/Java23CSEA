//javaSE application to check whether the given String is Palindrome or not (use String only).

package java523;
import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = new String();
		System.out.println("enter thr string: ");
		str = scanner.next();
		String temp = "";
		for(int num=str.length()-1;num>=0;num--) {
			char ch = str.charAt(num);
			temp += ch;
		}
		if(temp.equals(str)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		} 
	}
}
