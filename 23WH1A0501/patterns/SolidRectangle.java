import java.util.*;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int row = 0 ; row < rows ; row++){
            for(int col = 0 ; col < cols ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
