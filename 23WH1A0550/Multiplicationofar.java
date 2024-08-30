package java550;
import java.util.Scanner;

public class Multiplicationofarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows of matrix 1:");
		int row_matrix1=sc.nextInt();
		System.out.println("enter no of col of matrix 1:");
		int col_matrix1 =sc.nextInt();
		int [][] matrix1= new int [row_matrix1][col_matrix1];
		System.out.println("enter the elements in matrix1:");
		for(int i=0;i<row_matrix1;i++) {
			for(int j=0;j<col_matrix1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter no of rows of matrix 2:");
		int row_matrix2=sc.nextInt();
		System.out.println("enter no of col of matrix 2:");
		int col_matrix2 =sc.nextInt();
		int [][] matrix2= new int [row_matrix2][col_matrix2];
		System.out.println("enter the elements in matrix 2:");
		for(int i=0;i<row_matrix2;i++) {
			for(int j=0;j<col_matrix2;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		if(col_matrix1==row_matrix2) {
			int[][]matrix3=new int[row_matrix1][col_matrix2];
			for(int i=0;i<row_matrix1;i++) {
				for(int j=0;j<col_matrix2;j++) {
					matrix3[i][j]=0;
					for(int k=0;k<col_matrix1;k++) {
						matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
						
					}
				}
			}
			System.out.println(" the resultant matrix is :");
			for(int i=0;i<row_matrix1;i++) {
				for(int j=0;j<col_matrix2;j++) {
					System.out.print(matrix3[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}
		else
			System.out.println("The no of col of matrix 1 is not equal to no of rows of matrix2 !!");
	
		

	}

}
