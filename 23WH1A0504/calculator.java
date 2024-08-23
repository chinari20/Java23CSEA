package javapractice;
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		int ch;
		int num1;
		int num2;
		Scanner n = new Scanner(System.in);
		do {
		System.out.println("1.add\t2.subb\t3.multiply\t4.division\t");
		System.out.println("enter your choice");
		ch = n.nextInt();
		System.out.println("enter 1st number");
		num1 = n.nextInt();
		System.out.println("enter 2nd number");
		num2 = n.nextInt();
		
		switch(ch){
			case 1: System.out.println("sum =" + (num1 +num2));
				break;
			case 2: System.out.println("diff ="+(num1 - num2));
				break;
			case 3: System.out.println("prod ="+(num1 *num2));
				break;
			case 4: System.out.println("div ="+(num1 / num2));
				break;
			default: System.out.println("Not a valid choice");
			}
		}while(ch !=4);
	
	}
}


