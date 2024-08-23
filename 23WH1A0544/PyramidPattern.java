package javaprogramsi8;

import java.util.Scanner;

public class PyramidPattern {
		public static void main(String args[]) {
			int i,j,k;
			int rows;
			System.out.println("enter your no of rows:");
			Scanner sc = new Scanner(System.in);
			rows = sc.nextInt();
			for(i = 1; i <= rows ;i++) {
				for(j = 1; j <= rows - i; j++) {
					System.out.print(" ");
				}
			
				for(k = 1; k <= i*2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i = rows-1; i >= 1 ; i--) {
				for(j = rows - i; j >= 1; j--) {
					System.out.print(" ");
				}
			
				for(k = i*2 - 1; k >= 1; k--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}