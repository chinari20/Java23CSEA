import java.util.*;
public class ArrayMultiplication {
	public static void main(String[] args){
		int size;
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr1[][] = new int[size][size];
		int arr2[][] = new int[size][size];
		int arr3[][] = new int[size][size];
		//int arr3[][] = {{0,0,0},{0,0,0},{0,0,0}};
		// Reading the elements into the array
		System.out.println("enter elements into array 1\n");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter elements into array 2\n");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}	
		// Printing the elements of the array
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {	
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\nMultiplication of arrays: ");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
        arr3[i][j] = 0;
				for(int k = 0; k< size; k++) {
					arr3[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println("\n");
		}
		sc.close();
	}
		
}
