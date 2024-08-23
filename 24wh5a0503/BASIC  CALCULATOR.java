package LE503;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number: ");
	    double num2 =scanner.nextDouble();
	    System.out.println("enter the operator(+,-,*,/) :");
		char operator = scanner.next().charAt(0);
	    scanner.close();
	    double output;
	    switch(operator)
	    {
	   case '+':
		   output=num1+num2;
		   System.out.println(num1+"+"+num2+"="+output);
		   break;
	   case '-':
		  output=num1-num2;
		  System.out.println(num1+"-"+num2+"="+output);
		   break;
	   case '*':
		   output=num1*num2;
		   System.out.println(num1+"*"+num2+"="+output);
		   break;
	   case '/':
		   output=num1/num2;
		   System.out.println(num1+"/"+num2+"="+output);
		   break;
		   default:
			   System.out.println("invalid operator");
			   break; 
	   }
	}
}

