import java.util.*;
public class Pattern2 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        
        // for the first half of the pyramid
        for(int i = 1; i <= noOfRows; i++){
            for(int j = 1; j <= noOfRows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // for the second half of the pyramid
        for(int i = noOfRows - 1; i >= 1; i--){
            for(int j = 1; j <= noOfRows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
