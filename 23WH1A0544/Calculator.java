package javaprogramsi8;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int choice;
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice:\n1. Addition\t2. Subtraction\t3. Multiplication\t4. Division\t5. Modulus\t6. Exit");
			choice = sc.nextInt();
			if(choice >= 6)System.exit(0);
			System.out.print("Enter two numbers: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println(num1 * num2);
				break;
			case 4:
				System.out.println(num1 / num2);
				break;
			case 5:
				System.out.println(num1 % num2);
				break;
			default: System.out.println("Not a valid choice");
				
			}
		}while(choice != 6);

	}

}
