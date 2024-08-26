import java.util.Scanner;

public class NumbersPattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, l;
		System.out.print("Enter Rows: ");
		int rows = sc.nextInt();
		for (i = 1 ; i <= rows; i++ ){
			for (j = 1 ; j <= rows - i; j++ ){
				System.out.print(" ");	
			}
			for (k = i ; k >= 1; k-- ){
				System.out.print(k);
			}
			for (l = 2 ; l <= i; l++){
				System.out.print(l);
			}
			System.out.println();
		}
		for (i = rows - 1 ; i > 0; i-- ){
			for (j = 1 ; j <= rows - i; j++ ){
				System.out.print(" ");
			}
			for (k = i ; k >= 1; k-- ){
				System.out.print(k);
			}
			for (l = 2 ; l <= i; l++){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
