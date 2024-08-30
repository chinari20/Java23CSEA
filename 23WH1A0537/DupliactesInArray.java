package java537;
import java.util.*;

public class Dupliacates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:\n");
		Integer size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter the integer values of array:\n");
		for (int index = 0 ; index < size ; index++) {
			array[index] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("duplicates are: ");
		for (int index = 1; index < array.length ; index++) {
			if (array[index] == array[index-1]) {
				System.out.println(array[index]);
			}
		}
		
	}
}
