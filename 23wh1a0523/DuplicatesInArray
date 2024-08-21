//Find duplicate values in an array of integer values
package assignment;
import java.util.Scanner;
public class DuplicatesInArray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = scanner.nextInt();
		int arrayNumbers[] = new int[size];
		for(int i=0 ;i<size ;i++) {
			arrayNumbers[i]=scanner.nextInt();
		}

		for(int i=0 ;i<size ;i++) {
			for(int j=i+1 ;j<size ;j++) {
				if(arrayNumbers[i]==arrayNumbers[j]) {
					System.out.print(arrayNumbers[j]+"\t");
				}
			}
		}
		
	}
}
