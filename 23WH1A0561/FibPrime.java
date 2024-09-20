package project;
import java.util.*;
public class FibPrime {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter num");
			int count,n=sc.nextInt();
			int a[] = new int[n] ;
			int next ;
			int n1 = 0 ,n2 =1;
			a[0]=0;
			a[1]=1;
			for(int i=2; i<n ;i++) {
				next = n1 + n2;
				a[i] = next;
				n1 = n2 ;
				n2 = next ;
			}
			for(int i=0;i<n;i++) {
				count = 0;
				for(int j=1;j<=a[i];j++) {
					if(a[i]%j == 0) 
						count += 1;
				}
				if(count == 2 && a[i]<=n) {
					System.out.println(a[i]);
			}
		}
	}
}

