import java.util.*;
public class FibPrimeNum {
	public static boolean isPrime(int num) {
		int count = 0;
		for(int div = 1; div <= num; div++) {
			if(num % div == 0) {
				count += 1;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the range of the series : ");

		int range = sc.nextInt();

		int term1 = 0, term2 = 1, nextTerm = 0;

		while(nextTerm <= range) {

			if(isPrime(nextTerm)) {

				System.out.println(nextTerm);

			}

			term1 = term2;

			term2 = nextTerm;

			nextTerm = term1 + term2;

			

		}

    sc.close();
		
	}

}
