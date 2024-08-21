/*JavaSE application to make a Simple Calculator using swi...caseshould be able to add, subtract, multiply and divide two numbers. Scan the two numbers and operator using Scanner class.*/
import java.util.Scanner;
class SimpleCalculator{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("enter the operator('+','-','*','/'): ");
        int operator = scanner.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("addition of 2 numbers is: "+(num1+num2)); 
                break;
            case '-':
                System.out.println("difference of 2 numbers is: "+(num1-num2));
                break;
            case '*':
                System.out.println("multiplication of 2 numbers is: "+(num1*num2));
                break;
            case '/':
                System.out.println("division of 2 numbers is: "+(num1/num2));
                break;
            default:
                System.out.println("enter a valid operator");
        }
    }
}
