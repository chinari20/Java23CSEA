package javapractice;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		int row;
		System.out.println("enter no.of rows");
		Scanner n = new Scanner(System.in);
		row = n.nextInt();
		for(int  r= 0 ; r<=row ; r++) {
			for(int i =r-1 ; i>=1 ;i--) {
				System.out.print(i + 1);
			}
			for(int j = 0;j <= r-1 ; j++){
				System.out.print(j + 1);
			}
			System.out.println();
		}
	}
}

	 
	
