import java.util.*;
public class HollowButterfly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wingsize = sc.nextInt();
        //top half
        for(int row = 1 ; row <= wingsize ; row++){
            for(int col = 1 ; col <= 2 * wingsize ; col++){
                if (col == 1 || col == row || 2 * wingsize - col -1 == row || col == 2 * wingsize - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        //bottom half
        for(int row = wingsize - 1 ; row >= 1 ; row--){
            for(int col = 1 ; col <= 2 * wingsize ; col++){
                if (col == 1 || col == row || 2 * wingsize - col -1 == row || col == 2 * wingsize - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}