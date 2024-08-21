package java_practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("1.addition,2.substraction,3.multiplication,4.division");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			int sum=num1+num2;
			System.out.println("the sum of numbers:"+sum);
			break;
		case 2:
			int diff=num1-num2;
			System.out.println("the substraction of numbers:"+diff);
			break;
		case 3:
			int pro=num1*num2;
			System.out.println("the multiplicaton of numbers:"+pro);
			break;
		case 4:
			int div=num1/num2;
			System.out.println("the division of numbers:"+div);
			break;
			
			
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
