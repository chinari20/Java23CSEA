package LE503;
import java.util.Scanner;
public class sumOfEvenNumbers{
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the number of integers:");
        int n = scanner.nextInt();

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
