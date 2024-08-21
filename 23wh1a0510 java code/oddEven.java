// sum of odd and eve numbers
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter range : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int esum = 0;
        int osum = 0;
        for(int i = 1 ; i<=range ; i++){
            if(i%2 == 0){
                esum = i+esum;
            }
            else{
                osum =i+osum;
            }
        }
        System.out.println("sum of even numbers : " + esum);
        System.out.println("sum of odd numbers : " + osum);
    }
}