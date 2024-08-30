package source;
import java.util.*;
public class Ass5partA {

  public static void main(String[] args) {
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> alreadyAdded = new HashSet<Integer>();
		System.out.print("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		int[] duplicates = new int[size];
		System.out.printf("Enter %d numbers : " , size);
		int duplicateIndex = 0;
		for(int index = 0 ; index < size ; index++) {
			nums[index] = sc.nextInt();
			if (seen.contains(nums[index]) && alreadyAdded.contains(nums[index]) == false) {
				duplicates[duplicateIndex++] = nums[index];
				alreadyAdded.add(nums[index]);
			}
			seen.add(nums[index]);
		}
		for(int index = 0 ; index < duplicateIndex ; index++)
			System.out.print(duplicates[index] + " ");
		System.out.println();

	}

}