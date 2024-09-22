/*  1 
    2 1 2 
    3 2 1 2 3 
    4 3 2 1 2 3 4 
    5 4 3 2 1 2 3 4 5 */

import java.util.Scanner;
class numPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int value = sc.nextInt();
        int num = 1;
        while (num <= value){
            for (int n = num;n >0; n--){
                System.out.printf(n + " ");
            }
            for (int n = 2;n <= num; n++){
                System.out.printf(n + " ");
            }
            System.out.println();
            num++;
        }
            
    }
}
