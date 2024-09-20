package javapractice;
import java.util.Scanner;

public class evenoddsum {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer" + (i + 1) + ": ");
            int number = scanner.nextInt();

         
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

     
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

       
        scanner.close();
    }
}
