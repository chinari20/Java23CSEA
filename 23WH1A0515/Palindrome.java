import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word:\n");
		String word = sc.nextLine();
		String newWord = "";
		for(int i = word.length()-1;i>=0;i--) {
			newWord += word.charAt(i);
		}
		if(word.equals(newWord)) {
			System.out.println("yes it is a palindrome!"+ word);
		}
		else {
			System.out.println("No its not a palindrome!"+word);
		}
		sc.close();
	}

}
