import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter first number :");
		int a = scanner.nextInt();
		System.out.print("enter second number :");
		int b = scanner.nextInt();
		System.out.print("enter case :");
		int c = scanner.nextInt();
		switch (c){
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a/b);
			break;
		case 4:
			System.out.println(a%b);
			break;
		default:
			System.out.println("out of range:");
			
		
		
		}
	
	}
}
