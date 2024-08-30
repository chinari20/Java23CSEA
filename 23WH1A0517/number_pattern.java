import java.util.Scanner;

public class number_pattern {
	public static void main(String[] args) {
		int rows,i,j;
		Scanner ip=new Scanner (System.in);
		System.out.println("enter rows:");
		rows=ip.nextInt();
		for(i=1;i<=rows;i++) {
			for(j=rows;j>=1;j--) {
				if(j<=i)
					{System.out.print(j);}
				else {
					System.out.print("");
				}
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		ip.close();
		
	}
}
