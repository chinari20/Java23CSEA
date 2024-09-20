import java.util.*;
class FibbonacciSequence {
	static int a =0,b =1,c = 0;
	static void printFib(int n) {
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			System.out.println(" "+c);   
	        printFib(n-1); 
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Enter length of fibbonacci sequence:");
		n = sc.nextInt();
		System.out.println(b);
		printFib(n-2);
	}
	}

	