package java_528;
import java.util.Scanner;

public class q9_prime_fibnocci {
	public static boolean is_prime(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count = count + 1;
			}
		}
		if(count == 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.print("Enter the number of digits to be printed: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int t0 = 0;
		int t1 = 1;
		int next = t0+t1;
		for(int i =2; i<n;i++) {
			next = t0+t1;
			if(is_prime(next) == true && next <=n) {
				System.out.println(next);
			}
			t0 = t1;
			t1 = next;
		}
		sc.close();
	}
}
