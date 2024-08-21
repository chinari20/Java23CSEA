//to make a simple calculator using switch flow control
import java.util.Scanner;

public class q2_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("enter the operation to be done: ");
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println("addition = " + (num1 + num2));
                break;
            case '-':
                System.out.println("subtraction = " + (num1-num2));
                break;
            case '*':
                System.out.println("multiplication = " + (num1 * num2));
                break;
            case '/':
                System.out.println("division = " + num1/num2);
                break;
            case '%':
                System.out.println("remainder = " + num1%num2);
                break;
            default:
                System.out.println("Invalid operation");

        }
        sc.close();
    }
}
