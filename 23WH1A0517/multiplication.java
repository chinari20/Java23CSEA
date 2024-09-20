package jvlb;

public class multiplication {
	
	    public static void main(String[] args) {
	        // Define two matrices
	        int[][] matrixA = {{1, 2, 3},{4, 5, 6}};
	        
	        int[][] matrixB = {{7, 8},{9, 10},{11, 12}};
	        
	        // Get dimensions for result matrix
	        int rowsA = matrixA.length;
	        int colsA = matrixA[0].length;
	        int colsB = matrixB[0].length;

	        // Create a result matrix
	        int[][] result = new int[rowsA][colsB];

	        // Perform multiplication
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    result[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }

	        // Print the result
	        for (int[] row : result) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}


