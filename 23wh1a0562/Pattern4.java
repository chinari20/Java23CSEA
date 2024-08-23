import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
			int rows,columns;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number of rows: ");
			rows = scanner.nextInt();
			System.out.println("Enter number of columns: ");
			columns = scanner.nextInt();
			int i,j;
			for (i = rows; i >= 1; i--) {
				for (j = i; j >= 1; j--) {
					System.out.print(j+" ");
					}
					System.out.println();
				}
					
			}
	}
