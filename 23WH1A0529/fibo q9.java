import java.util.Scanner;

public class PrimeFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Generate Fibonacci series up to n
        int a = 0, b = 1;
        while (a <= n) {
            if (isPrime(a) && a > 1) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
