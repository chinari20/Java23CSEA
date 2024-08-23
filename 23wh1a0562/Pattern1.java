import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		int rows,columns;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		columns = scanner.nextInt();
		int i,j;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j+" ");
				}
			System.out.println();
		}
			
	}

}
