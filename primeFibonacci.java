package practiceJava24wh5a0503;
import java.util.ArrayList;
import java.util.List;

public class PrimeFibonacci {
    public static void main(String[] args) {
        int n = 10; 
        List<Integer> primes = findPrimes(n);
        List<Integer> fibonacciNumbers = findFibonacciUpToN(n);

        
        List<Integer> result = new ArrayList<>();
        for (int prime : primes) {
            if (fibonacciNumbers.contains(prime)) {
                result.add(prime);
            }
        }

        
        System.out.println("Prime numbers in Fibonacci series up to " + n + ": " + result);
    }

    
    private static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

   
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    private static List<Integer> findFibonacciUpToN(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        while (a <= n) {
            fibonacci.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fibonacci;
    }
  
	    private static List<Integer> findFibonacciUpToN1(int n) {
	        List<Integer> fibonacci = new ArrayList<>();
	        int a = 0, b = 1;
	        while (a <= n) {
	            fibonacci.add(a);
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        return fibonacci;
	    }
	}
