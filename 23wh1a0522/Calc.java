import java.util.Scanner;

public class Calc{
    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo Division");
        System.out.print("Enter your choice");
        int choice = scanner.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cont = "no";
        do{
            int operation = menu();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(Math.abs(num1-num2));
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
            System.out.println("Do you want to continue(yes/no): ");
            cont = scanner.nextLine();
        }while(cont=="yes");
    }
}
