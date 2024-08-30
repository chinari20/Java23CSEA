import java.util.*;

public class MultiplyMatrices {

    static int[][] createMatrix(int row, int col) {
        int[][] mat = new int[row][col];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of the matrix:");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat[r][c] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    static void printMatrix(int[][] mat, int row, int col) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiplyMatrices(int[][] matA, int[][] matB, int m, int n, int p) {
        int[][] matC = new int[m][p];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < p; c++) {
                matC[r][c] = 0;
                for (int k = 0; k < n; k++) {
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
        printMatrix(matA, rowsA, colsA);

        System.out.println("Enter the number of columns for the second matrix (number of rows should be the same as columns of the first matrix):");
        int colsB = sc.nextInt();

        int[][] matB = createMatrix(colsA, colsB);
        printMatrix(matB, colsA, colsB);

        int[][] matC = multiplyMatrices(matA, matB, rowsA, colsA, colsB);
        System.out.println("Product of the matrices:");
        printMatrix(matC, rowsA, colsB);

        sc.close();
    }
}
