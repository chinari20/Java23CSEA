import java.util.*;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		long evenSum = 0,oddSum = 0,num,noOfIntegers;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of integers : ");

		noOfIntegers = sc.nextLong();

		for(int i = 1; i <= noOfIntegers; i++) {

			System.out.println("Enter the number  : ");

			num = sc.nextLong();

			if(num % 2 == 0) {

				evenSum += num;

			}

			else {

				oddSum += num;

			}

		}

		System.out.println("Sum of even numbers is "+ evenSum);

		System.out.println("Sum of odd numbers is "+ oddSum);

		

		sc.close();

	}



}

