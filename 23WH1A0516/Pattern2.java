import java.util.*;
public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
      
      // for the first half of the pyramid
      
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n - row - 1; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < 2 * row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    // for the second half of the pyramid
      
        for(int row = 1; row < n; row++){
            for(int col = 0; col < row ; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < (n * 2) - (2 * row + 1); col++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
