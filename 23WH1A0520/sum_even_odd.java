import java.util.Scanner;

public class sum_even_odd {
	public static void main(String args[]) {
		int number,odd,even,i,even_sum=0,odd_sum=0,num_of_input;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the no.of inputs: ");
		num_of_input = scanner.nextInt();
		
		for(i=0;i<num_of_input;i++) {
			System.out.print("Enter the number: ");
			number = scanner.nextInt();
			if(number%2==0) {
				even_sum+=number;
			}
			else {
				odd_sum+=number;
			}
		}
		System.out.println("Sum of even numbers : "+even_sum);
		System.out.print("Sum of odd numbers: "+odd_sum);
	}
