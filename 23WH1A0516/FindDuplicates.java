import java.util.*;

public class FindDuplicates {
  
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int size;

 		System.out.println("Enter the size of the array : ");

 		Scanner sc = new Scanner(System.in);

 		size = sc.nextInt();

 		int arr[] = new int[size];


 		// Reading the elements into the array

 		for(int i = 0; i < size; i++) {

 			arr[i] = sc.nextInt();

 		}

 		// Printing the elements of the array

 		for(int i = 0; i < size; i++) {

 			System.out.print(arr[i] + "\t");

 		}

 		System.out.println("\nDuplicate elements are ");

 		for(int i = 0; i < size - 1; i++) {

 			for(int j = i + 1; j < size; j++) {

 				if(arr[i] == arr[j]) {

 					System.out.println(arr[i]);

 					break;

 				}

 			}

 		}

 		sc.close();

	}



}
