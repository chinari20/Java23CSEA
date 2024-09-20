package practicejava;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		long num1,num2;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an operator: ");
		op = sc.next().charAt(0);
		System.out.println("Enter any two number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		switch(op) {
			case'+':
				System.out.println(num1 + num2);
				break;
			case'-':
				System.out.println(num1 - num2);
				break;
			case'*':
				System.out.println(num1 * num2);
				break;
			case'/':
				System.out.println(num1 / num2);
				break;
			case'%':
				System.out.println(num1 % num2);
				break;
			default:
				System.out.println("invalid number");
				break;
		}

		sc.close();
	}
			
}
