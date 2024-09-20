package practicejava;

import java.util.Scanner;

public class Is_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String num = "";
		for(int i=0;i<word.length();i++){
			num = word.charAt(i)+ num;
			System.out.println(num);
		}
			if(num.equals(word)){
				System.out.println("It is a palindrome");
		}
		else{
			System.out.println("It is not a palindrome");
		}
		
	}

}
