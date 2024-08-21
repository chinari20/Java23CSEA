/*to print
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 pattern  */

import java.util.Scanner;

public class q4c_pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int no_of_rows = sc.nextInt();

        for(int i=1; i<=no_of_rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
