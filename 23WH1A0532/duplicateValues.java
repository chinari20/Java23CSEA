package sudeepthi;
import java.util.Scanner;

public class duplicateValues {

	public static void main(String[] args) {
		int size;
		System.out.println("enter the size of the array:");
		Scanner var = new  Scanner(System.in);
		size = var.nextInt();
		int array[] =  new  int[size];
		for(int i = 0;i<size;i++)
		{
			 array[i] = var.nextInt();
			
		}
		for(int i = 0;i<(size-1);i++)
		{
			for(int j= i+1;j<size;j++)
			{
				if(array[i]==array[j])
				{
					System.out.printf("Duplicate value:%d",array[i]);
					break;
				}
				
				
				
				
			}
		}
		
		

	}

}
