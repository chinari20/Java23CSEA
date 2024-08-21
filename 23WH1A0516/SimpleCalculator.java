import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		long num1,num2;

		char op;

		int exit;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter an operator : ");

			op = sc.next().charAt(0);

			System.out.println("Enter two numbers : ");

			num1 = sc.nextInt();

			num2 = sc.nextInt();

			switch(op) {

				case '+' :

					System.out.println(num1 + num2);

					break;

				case '-' :

					System.out.println(num1 - num2);

					break;

				case '*' :

					System.out.println(num1 * num2);

					break;

				case '/' :

					if(num2 != 0) {

						System.out.println(num1 / num2);

					}

					else {

						System.out.println("number 2 shouldnot be zero!");

					}

					break;

				case '%' :

					System.out.println(num1 % num2);

					break;

				default :

					System.out.println("Please enter a valid operator...");

			}

			System.out.println("Do you want to continue (0/1) : ");

			exit = sc.nextInt();

			

		}while(exit != 0);

		System.out.println("The code has sucessfully executed...");

		sc.close();
	}
}
