import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		        int n;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the rows:");
		        n = sc.nextInt();
		        for (int i = 0; i <= n; i++) {
		            for (int k = i-1; k >= 1; k--) {
		                System.out.print(k + 1);
		            }
		            for (int l = 0; l <= i-1 ; l++) {
		                System.out.print(l + 1);
		            }
		            System.out.println();
		        }
		    }
		}
	
