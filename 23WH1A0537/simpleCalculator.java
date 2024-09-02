//program to make a simple calculator

import java.util.*;

class SimpleCalculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first num\n");
       int num1 = sc.nextInt();
       System.out.println("enter second num\n");
       int num2 = sc.nextInt();
       System.out.println("enter operator\n");
       char operator = sc.next().charAt(0);
       int result = performCalculations(num1,num2,operator);
       System.out.println("result = " + result);
    }
    
    public static int performCalculations(int num1,int num2,char operator){
        switch (operator){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1*num2;
            case '/':
                return num1 / num2;
            default:
            System.out.println("invalid operator\n");
                return 0;
        }
    }
}
