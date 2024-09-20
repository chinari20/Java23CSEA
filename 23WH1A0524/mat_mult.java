import java.util.*;
class matMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length of size of matrices:");
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] res = new int[n][n];
        System.out.println("enter ele into mat1");
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("enter ele into mat2");
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("multiplication:");
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                res[i][j] = 0; 
                for (int k = 0; k < r; k++){
                    res[i][j] += a[i][k] 
                                 * b[k][j]; 
            } 
        } 
    }
        for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
    }
}
