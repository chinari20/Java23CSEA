package javaAssignments;

import java.util.*;



public class CommonElements5c {

	

	static void displayArr(String[] arr) {

		for(int idx = 0; idx < arr.length; idx++) {

			System.out.println(arr[idx]);

		}

	}

	

	static void commonEle(String[] arr1,String[] arr2) {

		for(int idx1 = 0; idx1 < arr1.length; idx1++) {

			for(int idx2 = 0; idx2 < arr2.length; idx2++) {

				 if(arr1[idx1].equals(arr2[idx2])) {

					 System.out.println(arr1[idx1]);

				 }

			}

		}

	}



	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter no of strings to be inserted in arr1 : ");

		int len1 = sc.nextInt();

		sc.nextLine();

		String[] arr1 = new String[len1];

		

		System.out.println("Enter the elements into arr1 :");

		for(int idx = 0; idx < len1; idx++) {

			arr1[idx] = sc.nextLine();

		}

		

		System.out.println("Elements in arr1 : ");

		displayArr(arr1);

		

		System.out.println("Enter no of strings to be inserted in arr2 : ");

		int len2 = sc.nextInt();

		

		String[] arr2 = new String[len2];

		

		sc.nextLine();

		System.out.println("Enter the elements into arr2 :");

		for(int idx = 0; idx < len1; idx++) {

			arr2[idx] = sc.nextLine();

		}

		

		System.out.println("Elements in arr2 : ");

		displayArr(arr2);

		

		System.out.println("\nCommon elements : ");

		

		commonEle(arr1,arr2);

		

		sc.close();



	}



}

