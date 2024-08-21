package practiceJava;
import java.util.* ;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, choice ;
		do {
			System.out.println("Enter 2 numbers :");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 : 
				System.out.println("The addition of "+ num1 +" and " + num2 + " is : "+ (num1+num2));
				break;
			case 2 : 
				System.out.println("The subtraction of "+ num1 +" and " + num2 + " is : "+ (num1-num2));
				break;
			case 3:
				System.out.println("The multiplication of "+ num1 +" and " + num2 + " is : "+ (num1*num2));
				break;
			case 4:
				System.out.println("The division of "+ num1 +" and " + num2 + " is : "+ (num1/num2));
				break;
			case 5:
				System.out.println("Calculator Exiting .....");
				System.exit(0);
			}
		}while(choice != 5);
		System.out.println("Calculator Exiting....");
		scanner.close();
	}

}
