import java.util.Scanner;
public class q7_isplaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string: ");
		String str = sc.next();
		char ch;
		
		System.out.print("the original string is: " + str + "\n");
		
		String reverse = "";
		for(int i=0 ; i< str.length(); i++) {
			ch = str.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println("the reversed string is: " + reverse);

        if(str.equals(reverse)){
            System.out.println("the given string " + str + " is palindrome");
        }
        else{
            System.out.println("the given string " + str + " is not palindrome");
        }
		sc.close();
	}

}
