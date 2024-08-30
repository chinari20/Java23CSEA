package java537;
import java.util.*;

public class CommonEle_StrArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//sizes of both arrays
		System.out.println("enter the size of both arrays\n");
		Integer size1 = sc.nextInt();
		Integer size2 = sc.nextInt();
		String[] array1 = new String[size1];
		String[] array2 = new String[size2];
		
		//reading elements into array1
		System.out.println("enter the string elements of array1\n");
		for (int index = 0 ; index < size1 ; index++) {
			array1[index] = sc.next();
		}
		
		//reading elements into array2
		System.out.println("enter the string elements of array2\n");
		for (int index = 0 ; index < size2 ; index++) {
			array2[index] = sc.next();
		}
		
		//common elements of arrays
		System.out.println("common elements are:\n");
		for (int index1 = 0 ; index1 < size1 ; index1++) {
			for (int index2 = 0 ; index2 < size2 ; index2++) {
				if (array1[index1].equals(array2[index2])){
					System.out.println(array1[index1]);
				}
			}
		}
		

	}

}
