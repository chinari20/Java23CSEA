import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        System.out.println("Enter the values of matrix 1: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix1[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Enter the values of matrix 2: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix2[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
        int res_matrix[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    res_matrix[i][j] = matrix1[i][k] + matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices are: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d  ",res_matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
