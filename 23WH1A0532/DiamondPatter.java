package sudheepthiapplication;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		int num,i,j;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter num:");
		num = obj.nextInt();
		for(i = 1;i <=num; i++)
		{
			for(j = 1 ; j <=(num-i);j++)
			{
				System.out.printf(" ");
			}
			for(int k = 1;k<= i;k++)
			{
				System.out.printf("* ");
				
			}
		System.out.println();
		
		}
		for(int p = 1 ; p<num;p++)
		{
			for(int q  = 1; q<=p ;q++)
			{
				System.out.printf(" ");
			}
			for(int r = num-p ;r>=1;r--)
			{
				System.out.printf("* ");
			}
		System.out.println();
		}
		
		
	}

}
