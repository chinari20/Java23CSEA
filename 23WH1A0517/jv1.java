import java.util.Scanner;
public class jv1 {
	public static void main(String[] args) {
		int n,num,odd=0,even=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n=input.nextInt();
		for(int i=0;i<n;i++) {
			num=input.nextInt();
			if(num%2==0)
				even+=num;
			else
				odd+=num;
			
		}
		
		System.out.println("Sum of even numbers="+even +"Sum of odd  numbers="+ odd);
		
		
	}
}
