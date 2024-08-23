package programme;

import java.util.Scanner;

public class SumOfEvenOdd {





	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        
	        System.out.println("Enter the number of integers you want:");
	        int n = scan.nextInt();

	        int evenSum = 0, oddSum = 0;

	      
	        System.out.println("Enter the integers:");
	        for (int i = 0; i <
	        		n; i++) {
	       
	            int num = scan.nextInt();
	            if (num % 2 == 0) {
	                evenSum += num;
	            } else {
	                oddSum += num;
	            }
	        }


	        System.out.println("Even sum is: " + evenSum);
	        System.out.println("Odd sum is: " + oddSum);

	        scan.close();
	    }
	}


