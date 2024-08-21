package assingment;
import java.util.Scanner;
public class EvenOddSum {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scanner.nextInt();
		int nums[] = new int[size];
		System.out.println("enter elements into array");
		int e_sum=0;
		int o_sum=0;
		for (int i =0;i<size;i++) {
			nums[i]=scanner.nextInt();
		}
		for(int i =0 ;i<size;i++) {
			if(nums[i]%2==0) {
				e_sum=e_sum+nums[i];
			}
			else {
				o_sum = o_sum+nums[i];
			}
		}
		System.out.println("even sum in arry is:"+e_sum);
		System.out.println("odd sum in array is:"+o_sum);
}
}
