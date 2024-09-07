// program to display numbers between 1 and given num if they are prime and are in fibonacci series. 
import java.util.Scanner;
class PrimeFibnocci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num: ");
        int num = sc.nextInt();
        System.out.println("primefibonnaci nums are:\n");
        for (int n = 2; n < num ;n++){
            if (isprime(n) == true){
                if (isfibonacci(n) == true){
                    System.out.println(n);
                }
            }
        }
    }
    public static boolean isprime(int n){
        int count = 0;
        for (int i = 1;i <= n;i++){
            if (n % i == 0)
                count += 1;
        }
        if (count == 2)
            return true;
        return false;
    }
    public static boolean isfibonacci(int n){
        int num1 = 0,num2 = 1;
        int num = 0;
        while (num < n){
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
        if (num == n)
            return true;
        return false;
    }
}
