package sudeepthi;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		String word;
		String reverse ="";
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine();
		for(int i = word.length()-1 ;i>=0;i--)
		{
			reverse = reverse + word.charAt(i);
		}
		if(word.equals(reverse))
		{
			System.out.println("YES IT IS A PALINDROME : " + word);
		}
		else
		{
			System.out.println("NO IT IS NOT A PALINDROME");
		}
		
		
		
		
		

	}

}
