import java.util.Iterator;
import java.util.Scanner;

public class Arrays1 {
		public static void main(String[] args)
		
		{
			Scanner scanner = new Scanner(System.in);
			int array[] = new int[5];
			int i;
			System.out.println("Enter the array elements: ");
			for(i=0;i<array.length;i++)
			{
				array[i] = scanner.nextInt();
				
			}
			System.out.println("The elements of array are: ");
			for(i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			
			
		
	}

}
