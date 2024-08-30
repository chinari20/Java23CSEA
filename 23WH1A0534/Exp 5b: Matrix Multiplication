package programs;
import java.util.*;
public class MultiplicationOfMatrices 
{
	static void printMatrix(int mat[][]) {
		int i, j;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void readMatrix(int mat[][]) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}
	static int[][]multiplyMatrix(int mat1[][], int mat2[][]) {
		int i,j,k;
		int res[][] = new int[3][3];
		
		for(i = 0;i < 3; i++) {
			for(j = 0; j < 3; j++) {
				res[i][j] = 0;
				for(k = 0; k < 3; k++) {
					res[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return res;
	}
	
	public static void main(String args[]) 
	{
		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];
		System.out.println("Enter elements in matrix 1:");
		readMatrix(mat1);
		System.out.println("Enter elements in matrix 2:");
		readMatrix(mat2);
		System.out.println("Matrix 1:");
		printMatrix(mat1);
		System.out.println("Matrix 2:");
		printMatrix(mat2);
		int res[][] = multiplyMatrix(mat1 , mat2);
		System.out.println("Matrix 1 x Matrix 2:");
		printMatrix(res);
	}
	

}
