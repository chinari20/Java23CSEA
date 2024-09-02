import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter last number: ");
	    int n = scanner.nextInt();
	    int a = 0, b= 1,c=0;
	    int i,j,count;
	    System.out.println("The numbers which are prime and also in Fibonacci Series less than "+n+" are: ");
	    while(c <= n)
	   {
	        c = a+b;
	        count = 0;
	        for(j=1;j<=c;j++)
	        {
	            if(c%j == 0)
	            {
	                count ++;
	            }
	        }
	        if(count == 2)
	        {
	        System.out.print(c + " ");
	        }
	        a = b;
	        b = c;
	        c  = a + b;
	        
	    }

	    
	}
}

Output:
Enter last number: 
20
The numbers which are prime and also in Fibonacci Series less than 20 are: 
2 3 5 13 
