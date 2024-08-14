import java.util.*;
public class HollowRhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int totalwidth = side * 2 - 1;
        int firststar = side;
        for(int row = 1 ; row <= side ; row++){
            int counter = 0;
            for(int col = 1 ; col <= totalwidth ; col++){
                if(col >= firststar && counter < side && (row == 1 || row == side || col == firststar || col == firststar + side - 1)) {
                    System.out.print("*");
                    counter++;
                }
                else System.out.print(" ");
            }
            firststar--;
            System.out.println();
        }
    }
}
