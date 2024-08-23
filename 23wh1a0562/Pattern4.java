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

Output:
Enter number of rows: 
5
Enter number of columns: 
5
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 

