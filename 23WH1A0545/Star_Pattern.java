package JAVA_4;
import java.util.Scanner;
public class Star_Pattern {
	public static void main(String[] args) {
		int i,j,rows;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows = input.nextInt();
		for(i=1;i<=rows;i++) {
			for(j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			for(j=1;j <= i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	for(i = rows-1;i>0;i--) {
		for(j = 1;j<=rows-i;j++) {
			System.out.print(" ");
		}
		for( j = 1; j <= i*2-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}	
	input.close();
	}
}
