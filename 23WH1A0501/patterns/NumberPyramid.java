import java.util.*;
public class NumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int row = 1 ; row <= rows ; row++){
            for(int spaces = 0 ; spaces < rows - row ; spaces++) System.out.print(" ");
            for(int iteration = 0 ; iteration < row; iteration++){
                System.out.print(row);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
