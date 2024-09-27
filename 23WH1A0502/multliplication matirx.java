package javaAssignments;

import java.util.*;



public class MultiplicationOfMatrices {

	

	

	static int[][] readMatrix(int[][] mat,int rows,int cols) {

		Scanner sc = new Scanner(System.in);

		

		System.out.printf("Enter %d no of elements :", rows * cols);

		

		for(int row = 0; row < rows; row++) {

			for(int col = 0; col < cols; col++) {

				mat[row][col] = sc.nextInt();

			}

		}

		

		

		return mat;

			

	}

	static void displayMatrix(int[][] mat,int rows,int cols) {

		

		for(int row = 0; row < rows; row++) {

			for(int col = 0; col < cols; col++) {

				System.out.print(mat[row][col] +" ");

			}

			System.out.println();

		}

		

	}

	

	static int[][] multiplyMatrices(int[][] matA,int rowsA,int colsA,int[][] matB,int rowsB,int colsB){

		int[][] matC = new int[rowsA][colsB];

		

		for(int row = 0; row < rowsA; row++) {

			for(int col = 0; col < colsB; col++) {

				matC[row][col] = 0;

				for(int temp = 0; temp < rowsA;temp++) {

					matC[row][col] += matA[row][temp] * matB[temp][col];

				}

			}

		}

		return matC;

	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter the no of rows ad cols of matA : ");

		int rowsA = sc.nextInt();

		int colsA = sc.nextInt();

		

		int[][] matA = new int[rowsA][colsA];

		readMatrix(matA,rowsA,colsA);

		displayMatrix(matA,rowsA,colsA);

		

		System.out.println("Enter the no of rows ad cols of matB : ");

		

		int rowsB = sc.nextInt();

		int colsB = sc.nextInt();

		

		int[][] matB = new int[rowsB][colsB];

		readMatrix(matB,rowsB,colsB);

		displayMatrix(matB,rowsB,colsB);

		

		

		if(colsA != rowsB) {

			System.out.println("We cannot multiply 2 matrices");

		}

		else {

			int[][] matC = multiplyMatrices(matA,rowsA,colsA,matB,rowsB,colsB);

			System.out.println("Resultant matrix : ");

			displayMatrix(matC,rowsA,colsB);

		}

		sc.close();

		

		

		



	}



}

