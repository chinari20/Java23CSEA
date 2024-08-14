import java.util.*;
public class HorizontallyFlippedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int row = 1 ; row <= rows ; row++){
            int starstart = rows - row;
            for(int col = 1 ; col <= rows ; col++){
                if(col <= starstart) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
