package helloworld;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char choice;
		int number1,number2,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any operator");
		choice=sc.next().charAt(0);
		System.out.println("Enter first number");
		number1=sc.nextInt();
		System.out.println("Enter second number");
		number2=sc.nextInt();
		switch(choice) {
		  case '+':
			  result=number1+number2;
			  System.out.println("The Addition of two number is "+result);
			  break;

		case '-':
			result=number1-number2;
			System.out.println("The subtraction of two numbers is "+result);
			break;
		case '*':
			result=number1*number2;
			System.out.println("The multiplication of two number is "+result);
			break;
		case '/':
			result=number1/number2;
			System.out.println("The division of two number is "+result);
			
			
	
	}
	}

}
