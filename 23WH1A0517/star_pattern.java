package lab4;
import java.util.Scanner;
public class star_pattern {
	public static void main(String[] args) {
		int rows,i,j;
		System.out.println("enter rows: ");
		Scanner ip=new Scanner (System.in);
		rows=ip.nextInt();
		for(i=1;i<=rows;i++) {
			for(j=1;j<=(rows-i);j++) {
				System.out.print(" ");		
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(i=rows-1;i>0;i--) {
			for(j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		ip.close();
		
	}
		
}
