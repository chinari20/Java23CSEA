//to enter number of integers and finding out even sum and odd sum of those integers using for loop
import java.util.Scanner;

public class q3_sum_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of integers to be read: ");
        int num_of_integers = sc.nextInt();

        int num;
        int even_sum = 0;
        int odd_sum = 0;
        
        System.out.println("enter the integers: ");
        for(int i=1; i<=num_of_integers; i++){
            num = sc.nextInt();
            if(num%2 == 0){
                even_sum += num;
            }
            else{
                odd_sum += num;
            }
        }
        System.out.println("even numbers sum = " + even_sum);
        System.out.println("odd numbers sum = " + odd_sum);
        sc.close();
    }
}
