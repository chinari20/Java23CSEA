//reverse of a number
import java.util.Scanner;
public class Reverse{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = scanner.nextInt();
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
    System.out.print(rev);  
    }
}
