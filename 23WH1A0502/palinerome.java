package javaAssignments;

import java.util.*;



public class Palindrome7 {

	

	public static boolean isPalindrome(String word) {

		

		String rev = "";

		for(int idx = 0; idx < word.length(); idx++) {

			rev = word.charAt(idx) + rev;

		}

		if(rev.equals(word)) return true;

		

		else return false;

	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		

		if(isPalindrome(word)) {

			System.out.println("The given word is a palindrome");

		}

		else {

			System.out.println("The given word is not a palindrome");

		}

		

		sc.close();

		

	}



}
