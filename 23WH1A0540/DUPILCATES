package assingment;
import java.util.Scanner;
public class Duplictes {
	public static void main(String[]args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = Scanner.nextInt();
		System.out.println("enter elements into array:");
		int nums[] = new int[size];
		for (int i =0;i<size;i++){
			nums[i] = Scanner.nextInt();
		}
		System.out.println("duplicate values are:");
		for(int i = 0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[j]+"\t");
				}
			}
		}
		
}
