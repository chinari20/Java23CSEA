package amulya;
import java.util.Scanner;
public class Calculator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        float num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        float num2 = scanner.nextFloat();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        String operator = scanner.next();

	        float result;

	        switch (operator) {
	            case "+":
	                result = num1 + num2;
	                break;
	            case "-":
	                result = num1 - num2;
	                break;
	            case "*":
	                result = num1 * num2;
	                break;
	            case "/":
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error! Division by zero.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator!");
	                return;
	        }

	        System.out.println("The result is: " + result);
	    }
	}


