package bhavani;

import java.util.Scanner;

public class Assisgment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of numbers being entered: ");
		int length = sc.nextInt();
		int oddSum = 0 ; 
		int evenSum = 0;
		for(int iteration = 1 ; iteration <= length ; iteration++) {
			int num = sc.nextInt();
			if(num % 2  == 0) evenSum += num;
			else oddSum += num;
		}
		System.out.printf("Even sum =  %d\nOdd Sum = %d" , evenSum , oddSum);
	}
}