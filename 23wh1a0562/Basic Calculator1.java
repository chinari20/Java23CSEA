import java.util.Scanner;
public class Simple_Calculator {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int ch;
		System.out.println("1.Addition 2.Subtraction 3.Multiplication  4.Division  5.Modulo");
		do {
			
			System.out.println("Enter your choice: ");
			ch = scanner.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Addition of num1 and num2 is: "+(num1+num2));
					break;
				case 2:
					System.out.println("Subtraction of num1 and num2 is: "+(num1-num2));
					break;
				case 3:
					System.out.println("Multiplication of num1 and num2 is: "+(num1*num2));
					break;
				case 4:
					System.out.println("Division of num1 and num2 is: "+(num1/num2));
					break;
				case 5:
					System.out.println("Modulo of num1 and num2 is: "+(num1%num2));
					break;
				default:
					System.out.println("You have entered an Invalid Symbol");
					
			}
		}while(ch<=5);
		
		
	}

	
}
