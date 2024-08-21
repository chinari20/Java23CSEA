//Find duplicate values in an array of integer values
package javapractise;
import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = scanner.nextInt();
		int Numbers[] = new int[size];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<size;i++) {
			Numbers[i] = scanner.nextInt();
		}
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(Numbers[i]==Numbers[j]) {
					System.out.println(Numbers[i]);
				}
			}
		}
	}
}
