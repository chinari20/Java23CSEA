//Java SE code that reads a set of integers, and then prints the sum of the even and odd integers separately  (use for loop)
package assignment;
import java.util.Scanner;
public class evenOddSum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = scanner.nextInt();
		int Numbers[] = new int[size];
		for(int i=0 ;i<size ;i++) {
			Numbers[i]=scanner.nextInt();
		}
		int evenSum=0;
		int oddSum=0;
		for(int j=0;j<size;j++) {
			if(Numbers[j]%2==0) {
				evenSum = evenSum + Numbers[j];
			}
			else {
				oddSum = oddSum + Numbers[j];
			}
		}
		System.out.println("even sum:"+evenSum);
		System.out.println("odd sum:"+oddSum);
	}

}
