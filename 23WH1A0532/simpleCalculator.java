package sudheepthiapplication;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		int number1;
		int number2;
		String ch ;
		int sum=0,difference = 0,multiplication = 1,division = 0,remainder = 0;
		Scanner obj =  new Scanner(System.in);
		System.out.println("enter number1:");
		number1 = obj.nextInt();
		System.out.println("enter number2:");
		number2 = obj.nextInt();
		System.out.println("enter the symbol operation to be performed:");
		ch = obj.next();
		switch(ch)
		{
		case "+": sum = number1 + number2;
				System.out.printf("Sum:%d",sum);
				break;
		case "-": difference = (number1 - number2);
				System.out.printf("Subtraction:%d",difference);
				break;
		case "*": multiplication = number1*number2;
				System.out.printf("multiplication:%d", multiplication);
				break;
		case "/": division = number1/number2;
				System.out.printf("division:%d",division);
				break;
		case "%": remainder = number1 % number2;
				System.out.printf("remainder:%d",remainder);
				break;
		}
		
		
	}

}
