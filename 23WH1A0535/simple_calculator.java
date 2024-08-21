package Java_Practice;
import java.util.*;
public class simple_calculator {
    
void add(int number1, int number2) {
	System.out.println("The sum is " + (number1 + number2));
}

void sub(int number1, int number2) {
	System.out.println("The difference is " + (number1 - number2));
}

void mul(int number1, int number2) {
	System.out.println("The product is " + (number1 * number2));
}

void div(int number1, int number2) {
	System.out.println("The quotient is " + (number1 / number2));
}

void mod(int number1, int number2) {
	System.out.println("The remainder is " + (number1 % number2));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("Enter the Operation you want to perform : /n 1. Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulo(remainder");
		Scanner sc1 = new Scanner(System.in);
		simple_calculator obj = new simple_calculator();
		int Operator;
		do {
			System.out.println("Enter operation : ");
			Operator = sc1.nextInt();
		    System.out.print("Enter 1st number : ");
		    int number1 = sc1.nextInt();
		    System.out.print("Enter 2nd number : ");
		    int number2 = sc1.nextInt();
		    
			switch (Operator) {
			case 1:
				obj.add(number1, number2);
				break;
			case 2:
				obj.sub(number1, number2);
				break;
			case 3:
				obj.mul(number1, number2);
				break;
			case 4:
				obj.div(number1, number2);
				break;
			case 5:
				obj.mod(number1, number2);
				break;
			}
		}while (Operator <= 5);
		
		sc1.close();
	}
	
}
