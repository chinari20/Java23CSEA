package LE503;
import java.util.Scanner;
public class multiplicationOfMatrix {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of rows and columns A ");
	int rowsA=scanner.nextInt();
	int colsA=scanner.nextInt();
	System.out.println("enter the number of columnsof matrix B");
	int colsB=scanner.nextInt();
	int[][]A=new int[rowsA][colsA];
	int [][]B=new int [rowsA][colsB];
	int [][]C=new int[rowsA][colsB];
	System.out.println("enter the elements of matrix A:");
	for(int i=0;i<rowsA;i++)
	{
		for (int j=0;j<colsA;j++) {
			A[i][j]=scanner.nextInt();
		}
	}
	System.out.println("enter the elements of matrix B:");
	for(int i=0;i<colsA;i++)
	{
		for(int j=0;j<colsB;j++) {
			B[i][j]=scanner.nextInt();
		}
	}
	multiplyMatrices(A,B,C,rowsA,colsA,colsB);
	System.out.println("matrix A:");
	printMatrix(A,rowsA,colsA);
	System.out.println("matrix B:");
	printMatrix(B,colsA,colsB);
	System.out.println("multiplication oa matrixA and matrixB:");
	printMatrix(C,rowsA,colsB);
}
public static void multiplyMatrices(int[][] A,int[][] B,int [][] c,int rowsA,int colsA,int colsB ) {
	for (int i=0;i<rowsA;i++) {
		for(int j=0;j<colsB;j++) {
			c[i][j]=0;
			for(int k=0;k<colsA;k++)
			{
				c[i][j]+=A[i][k]*B[k][j];
			}
		}
	}
}
public static void printMatrix(int[][]matrix,int rows,int cols) {
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++) {
			System.out.println(matrix[i][j]+" ");
		}
		System.out.println();
	}
}
}
