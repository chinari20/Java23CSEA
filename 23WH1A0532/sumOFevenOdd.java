package sudheepthiapplication;
import java.util.Scanner;

public class sumOFevenOdd {

	public static void main(String[] args) {
		int number,start = 0,evenSum = 0,oddSum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no of numbers:");
		number = obj.nextInt();
		System.out.println("enter numbers:");	
		
		for(start =1 ; start<=number; start++)
		{
			int num = obj.nextInt();
			if(num%2 == 0)
			{
				evenSum += num;
			}
			else
			{
				oddSum += num;
			}		
		}
		System.out.printf("even number sum is %d\n", evenSum);
		System.out.printf("odd number sum is %d", oddSum);
	
	

	}
}
