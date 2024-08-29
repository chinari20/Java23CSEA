package helloWorld;
import java.util.Scanner;
public class Numberpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(j=2;j<=i;j++) {
				System.out.print(j+" ");				
			}
			System.out.println();
			
		}
		// TODO Auto-generated method stub

	}

}
