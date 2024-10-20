import java.util.*;
public class q5b_MultiplicationOfMatrix {
	public static int[][] multiply(int[][] mat1 , int[][] mat2){
		int[][] product = new int[mat1.length][mat2[0].length];
		for(int row = 0 ; row < mat1.length ; row++) {
			for(int col = 0 ; col < mat2[0].length ; col++) {
				product[row][col] = 0;
				for(int member = 0 ; member  < mat1[0].length ; member++)
					product[row][col] += mat1[row][member] * mat2[member][col];
			}
		}
		return product;
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows and colums in the 1st matrix: ");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		int mat1[][] = new int[rows1][cols1];
		System.out.printf("Enter %d numbers: " , rows1 * cols1);
		for(int row = 0 ;row < rows1 ; row ++)
			for(int col = 0 ; col < cols1 ; col++) 
				mat1[row][col] = sc.nextInt();
		System.out.print("Enter the no of rows and colums in the 2nd matrix: ");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		int mat2[][] = new int[rows2][cols2];
		System.out.printf("Enter %d numbers: " , rows2 * cols2);
		for(int row = 0 ;row < rows2 ; row ++)
			for(int col = 0 ; col < cols2 ; col++) 
				mat2[row][col] = sc.nextInt();
		if(cols1 != rows2) {
			System.out.println("Can not multiply");
			return ;
		}
		System.out.println("after multiplication the matrix is : ");
		int product[][] = multiply(mat1 , mat2);
		for(int[] row : product) {
			for(int num : row) 
				System.out.print(num + " ");
			System.out.println();
		}
        sc.close();
	}

}