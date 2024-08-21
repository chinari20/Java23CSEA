import java.util.*;
public class Class1 {

	public static void main(String[] args) {
		int number_1 ,number_2;
		char operator,choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter a operator:");
			operator = sc.next().charAt(0);
			System.out.println("enter number 1:");
			number_1 = sc.nextInt();
			System.out.println("enter a number 2:");
			number_2 = sc.nextInt();
			switch(operator) {
			case '+':
				System.out.println(number_1 + number_2);
				break;
			case '-':
				System.out.println(number_1 - number_2);
				break;
			case '*':
				System.out.println(number_1 * number_2);
				break;
			case '/':
				System.out.println(number_1 / number_2);
				break;
			case '%':
				System.out.println(number_1 % number_2);
				break;
			default:
				System.out.println("enter a vaild operator");
			}
			System.out.println("do you want to continue enter y else n");
			choice = sc.next().charAt(0);
		
		}while(choice == 'y');
		System.out.println("The following calculations have ended");
		sc.close();
	}

}
