//simple calculator
import java.util.Scanner;
public class powerBill {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("enter a number : ");
	    System.out.println("enter another number : ");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
	    int ch = sc.nextInt();
        //int res=0;
	    
	    switch(ch){
	        case 1:
	          System.out.println(num1+num2);
	          break;
	        case 2:
	          System.out.println(num1-num2);
	          break;
	        case 3:
	          System.out.println(num1*num2);
	          break;
	        case 4:
	          System.out.println(num1/num2);
	          break;
	    }
	}
}