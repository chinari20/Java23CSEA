import java.util.*;

public class MultiplyMatrices {

    static int[][] createMatrix(int row, int col) {
        int[][] mat = new int[row][col];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of the matrix (" + row + "x" + col + "):");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat[r][c] = sc.nextInt();
            }
        }
        return mat;
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiplyMatrices(int[][] matA, int[][] matB) {
        int rowsA = matA.length;
        int colsA = matA[0].length;
        int colsB = matB[0].length;

        int[][] matC = new int[rowsA][colsB];

        for (int r = 0; r < rowsA; r++) {
            for (int c = 0; c < colsB; c++) {
                for (int k = 0; k < colsA; k++) {
                    matC[r][c] += matA[r][k] * matB[k][c];
                }
            }
        }
        return matC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        int[][] matA = createMatrix(rowsA, colsA);
        System.out.println("First Matrix:");
        printMatrix(matA);

        System.out.println("Enter the number of columns for the second matrix:");
        int colsB = sc.nextInt();

        // Validate matrix compatibility
        if (colsA <= 0 || colsB <= 0) {
            System.out.println("Error: Matrix dimensions must be positive!");
            sc.close();
            return;
        }

        int[][] matB = createMatrix(colsA, colsB);
        System.out.println("Second Matrix:");
        printMatrix(matB);

        System.out.println("Product of the matrices:");
        int[][] matC = multiplyMatrices(matA, matB);
        printMatrix(matC);

        sc.close();
    }
}
