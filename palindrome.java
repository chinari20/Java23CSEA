import java.util.Scanner;
public class checkPalindromeORnot {
 public static void main(String args[])
 {
	 Scanner scanner=new Scanner(System.in);
			System.out.println("enter the string:");
			String input = scanner.nextLine();
			boolean isPalindrome = isPalindrome(input);
			if(isPalindrome)
			{
				System.out.println(input + "is palindrome");
			}else {
				System.out.println(input + "is not palindrome");
				}
			}
 private static boolean isPalindrome (String str) {
	 int left=0;
	 int right=str.length()-1;
	 while(left<right)
	 {
		 if(str.charAt(left)!= str.charAt(right)) {
			 return false;
		 }
		 left++;
		 right--;
	 }
	 return true;
	}
}

