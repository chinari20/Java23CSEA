package JAVA556;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter value of num1 :");
	    int num1 = sc.nextInt();
	    
	    System.out.println("Enter value of num2 :");
	    int num2 = sc.nextInt();
	    
	    System.out.println("Enter your choice :");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
	    int result;
		int operator = sc.nextInt();
		
	    switch(operator) {
	    	case 1:
	    		result = num1+num2;
	    		System.out.println(result);
	    		break;
	    	case 2:
	    		result = num1-num2;
	    		System.out.println(result);
	    		break;
	    	case 3:
	    		result = num1*num2;
	    		System.out.println(result);
	    		break;
	    	case 4:
	    		result = num1/num2;
	    		System.out.println(result);
	    		break;
	    	default:
	    		System.out.println("invalid");

	    }
	    
	    	}
	
}