package java550;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFibonacci {
    public static ArrayList<Integer> generateFibonacci(int term) {
        ArrayList<Integer> fibonacciNums = new ArrayList<>();
        int f1 = 0, f2 = 1;
        fibonacciNums.add(f1);
        fibonacciNums.add(f2);
        while (f2 <= term) {
            int temp = f1 + f2;
            fibonacciNums.add(temp);
            f1 = f2;
            f2 = temp;
        }
        return fibonacciNums;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrimeFibonacci(int term) {
        ArrayList<Integer> fibonacciNums = generateFibonacci(term);
        System.out.println("Prime Fibonacci numbers up to " + term + ":");
        for (int fib : fibonacciNums) {
            if (isPrime(fib)) {
                System.out.print(fib + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for the Fibonacci sequence:");
        int term = sc.nextInt();
        printPrimeFibonacci(term);
        sc.close();
    }
}
