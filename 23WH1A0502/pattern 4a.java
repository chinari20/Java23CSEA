package javaAssignments;

import java.util.*;



public class DiamondPattern4a {



	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of rows :");

		

		int rows = sc.nextInt();

		for(int i = 1; i <= rows; i++) {

			for(int spaces = 1; spaces <= rows - i; spaces++) {

				System.out.print(" ");

			}

			

			for(int star = 1; star <= i; star++) {

				System.out.print("* ");

			}

			System.out.println();

			

			

		}

		

		for(int i = rows - 1; i >= 1; i--) {

			for(int spaces = 1; spaces <= rows - i; spaces++) {

				System.out.print(" ");

			}

			

			for(int star = 1; star <= i; star++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		

		sc.close();



	}



}

