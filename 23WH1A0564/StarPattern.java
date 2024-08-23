             
package programs;
import java.util.*;
public class StarPattern {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter length of longest sequence:");
		int n=scan.nextInt();
		for(int i=1;i<n;i++) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print(" ");
		
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=n;i>=1;i--) {
			for(int k=(n-i);k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	

}}