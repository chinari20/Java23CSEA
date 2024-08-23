package source;
import java.util.Scanner;
public class SumEvenOdd {

	public static void main(String[] args) {
		int i;
		int EvenSum = 0;
		int OddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of integers ");
		int limit  = sc.nextInt();
		for(i = 1;i<=limit;i++) {
			int n  = sc.nextInt();
			if (n%2==0) {
				EvenSum=EvenSum+n;
			}
			else {
				OddSum=OddSum+n;
			}
		}
		System.out.println("Even sum is "+EvenSum);
		System.out.println("Odd sum is " +OddSum);


	}
}
