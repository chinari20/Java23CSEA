import java.util.Scanner;
public class javalab {
	public static void main (String[] args) {
		char operator;
		int num1,num2,result;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter an operator: ");
		operator=ip.next().charAt(0);

		System.out.println("enter two numbers: ");
		num1=ip.nextInt();
		num2=ip.nextInt();
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println("Sum="+ result);
			break;	
		case '-':
			result=num1-num2;
			System.out.println("Difference="+ result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("Quotient="+ result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("Product="+ result);
			break;
		default:
			System.out.println("invalid");

			
		}//switch
		ip.close();
	}
}
