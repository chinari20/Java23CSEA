/* Program to print all prime numbers between 1 to n, only if it is part of the
Fibonacci series. For example: n value is 10, 1 to 10 
prime numbers are : 2, 3, 5, 7. Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21..
output is: 2,3,5 */
package java523;
import java.util.Scanner;

public class PrimeFibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int n = sc.nextInt();
		//fibonacci 
		int fibonacci[] = new int[n];
		int t0 = 0;
		fibonacci[0] = t0;
		int t1 = 1;
		fibonacci[1] = t1;
		int next = t0+t1;
		for(int i=2;i<n;i++) {
			fibonacci[i]=next;
			t0 = t1;
			t1 = next;
			next = t0+t1;
		}
		//prime numbers
		int primes[] = new int[n];
		
		int k=0;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					count += 1;
			}
			if(count==2) {
				primes[k]=i;
				k+=1;
			}
		}
		
		//prime fibonaccis
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(fibonacci[i]==primes[j] && fibonacci[i]!=0) 
					System.out.print(fibonacci[i]+"\t");
			}
		}
	}
}
