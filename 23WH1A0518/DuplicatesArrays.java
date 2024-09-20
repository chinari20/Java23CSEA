package practicejava;

import java.util.Scanner;

public class DuplicatesArrays {

	public static void main(String[] args) {
		int size;
		System.out.println("enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\nDuplicate of the array:");
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i] == arr[j]) {
		System.out.println(arr[i]);
				}
				
			}
		}
		sc.close();

	}

}
