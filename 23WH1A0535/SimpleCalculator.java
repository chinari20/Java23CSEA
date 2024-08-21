package Java_Practice;

import java.util.Scanner;

public class SimpleCalculator {

    void add(int number1, int number2) {
        System.out.println("The sum is " + (number1 + number2));
    }

    void sub(int number1, int number2) {
        System.out.println("The difference is " + (number1 - number2));
    }

    void mul(int number1, int number2) {
        System.out.println("The product is " + (number1 * number2));
    }

    void div(int number1, int number2) {
        if (number2 != 0) {
            System.out.println("The quotient is " + (number1 / number2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    void mod(int number1, int number2) {
        if (number2 != 0) {
            System.out.println("The remainder is " + (number1 % number2));
        } else {
            System.out.println("Error: Modulo by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        SimpleCalculator obj = new SimpleCalculator();

        int Operator;
        do {
            System.out.println("Enter the Operation you want to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo (remainder)");
            System.out.println("6. Exit");

            System.out.print("Enter operation: ");
            Operator = sc1.nextInt();

            if (Operator < 1 || Operator > 6) {
                System.out.println("Invalid operation. Please try again.");
                continue;
            }

            if (Operator == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter 1st number: ");
            int number1 = sc1.nextInt();
            System.out.print("Enter 2nd number: ");
            int number2 = sc1.nextInt();

            switch (Operator) {
                case 1:
                    obj.add(number1, number2);
                    break;
                case 2:
                    obj.sub(number1, number2);
                    break;
                case 3:
                    obj.mul(number1, number2);
                    break;
                case 4:
                    obj.div(number1, number2);
                    break;
                case 5:
                    obj.mod(number1, number2);
                    break;
            }
        } while (Operator != 6);

        sc1.close();
    }
}
