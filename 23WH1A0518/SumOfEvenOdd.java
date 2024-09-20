package practicejava;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		long num, sumeven=0, sumodd=0, NoOfIntegers;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the NoOfIntergers:");
		NoOfIntegers = sc.nextLong();
		for(int i = 0; i < NoOfIntegers;i++) {
			num = sc.nextLong();
			if(num%2 == 0)
				sumeven += num;
			else
				sumodd += num;
		}
		System.out.println(sumeven);
		System.out.println(sumodd);

	}

}
