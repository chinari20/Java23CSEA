package JAVA_4;
import java.util.Scanner;
public class Number_Pattern {
	public static void main(String[] args) {
		int i,j,k,rows;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number of rows: ");
		rows = input.nextInt();
		for(i = 1; i<=rows;i++) {
			for(j = rows;j>= 1;j--) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print("");
				}
			}
			for(k = 2; k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		input.close();
	}
}
