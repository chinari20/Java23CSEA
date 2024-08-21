/*to print
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * pattern */

import java.util.Scanner;

public class q4b_pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int no_of_rows = sc.nextInt();

        //upperpart
        for(int i=1; i<=no_of_rows; i++){
            for(int j=1; j<=no_of_rows - i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lowerpart
        for(int i=no_of_rows-1; i>=1; i--){
            for(int j=1; j<=no_of_rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
