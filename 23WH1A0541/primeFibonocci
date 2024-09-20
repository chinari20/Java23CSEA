package assignment;
import java.util.*;

public class primeFibonocii {
	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0){
			count+=1;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=range;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(isPrime(n3)&&n3<=range) {
				System.out.println(n3);
			}
		}
		System.out.println("error");
	}

}
