import java.util.*;
public class HollowRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: 4 5
        ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int row = 0 ; row < rows ; row ++){
            for(int col = 0 ; col < cols ; col ++){
                if(col == 0 || row == 0 || row == rows - 1 || col == cols - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.err.println();
        }
    }
}
