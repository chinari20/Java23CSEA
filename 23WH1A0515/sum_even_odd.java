import java.util.*;
public class sum_even_odd {
	public static void main(String[] args) {
		int number,even_sum=0,odd_sum=0,num_of_inputs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		num_of_inputs = sc.nextInt();
		for(int i = 1;i <= num_of_inputs;i++) {
			System.out.println("Enter a number");
			number = sc.nextInt();
			if (number%2 == 0) {
				even_sum+=number;
			}
			else {
				odd_sum+=number;
			}
		}
		System.out.println("sum of even numbers:"+even_sum+"\n"+"sum of odd numbers:"+odd_sum);
	}
}
