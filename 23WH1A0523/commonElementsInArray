//Java program to find common elements between two arrays (string values)

package assignment;
import java.util.Scanner;


public class CommonValuesInArray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = scanner.nextInt();
		int array1[] = new int[size];
		int array2[] = new int[size];
		System.out.print("enter 1st array elements"+"\t");
		for(int i=0 ;i<size ;i++) {
			
			array1[i]=scanner.nextInt();
		}
		System.out.print("enter 2nd array elements"+"\t");
		for(int j=0 ;j<size ;j++) {
			array2[j]=scanner.nextInt();
		}
		System.out.print("Common elements: ");
		for(int k=0;k<size;k++) {
			for(int m=0;m<size;m++) {
				if (array1[k]==array2[m]) {
					System.out.print(array1[k]+"\t");
				}
			}
		}
	}
}
