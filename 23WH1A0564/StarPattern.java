             
package programs;
import java.util.*;
public class StarPattern {
	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter length of longest sequence: ");
		int x = o.nextInt();
		int n,m,k;
		for(m = 1; m <= x ;m++) {
			for(n = 1; n <= x - m; n++) {
				System.out.print(" ");
			}
		
			for(k = 1; k <= m*2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(m = x-1; m >= 1 ; m--) {
			for(n = x - m; n >= 1; n--) {
				System.out.print(" ");
			}
		
			for(k = m*2 - 1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}