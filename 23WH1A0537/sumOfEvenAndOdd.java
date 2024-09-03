// to print sum of even integers and odd integers seperately

import java.util.Scanner;

class sumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of integers you want to enter:\n");
        int numOfInt = sc.nextInt();
        sum(numOfInt,sc);
    }
    
    public static void sum(int numOfInt,Scanner sc){
        int num,evenSum = 0,oddSum = 0,index;
        for (index = 0;index < numOfInt;index++){
             System.out.println("Enter num ");
            num = sc.nextInt();
            if (num%2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }
        System.out.println("even sum of integers "+ evenSum);
        System.out.println("odd sum of integers "+ oddSum);
    }
}
