import java.util.Scanner;

public class q1_electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter old reading value: ");
        int old_reading = sc.nextInt();
        System.out.print("enter new reading value: ");
        int new_reading = sc.nextInt();

        int no_of_units = Math.abs(old_reading - new_reading);
        System.out.println("number of units consumed are: " + no_of_units);
        int rate1 = 1;
        int rate2 = 2;
        int rate3 = 3;
        int rate4 = 4;
        int rate5 = 5;

        if(no_of_units <= 50){
            System.out.println("total amount = " + (no_of_units * rate1));
        }else if(no_of_units <=100){
            System.out.println("total amount = " + (50 * rate1 + (no_of_units - 50) * rate2));
        } else if(no_of_units <= 200){
            System.out.println("total amount = " + (50 * rate1 + 50 * rate2 + (no_of_units - 100) * rate3 ));
        } else if(no_of_units <= 400){
            System.out.println("total amount = " + (50 * rate1 + 50 * rate2 + 100 * rate3 + (no_of_units - 200) * rate4));
        } else if(no_of_units > 400){
            System.out.println("total amount = " + (50 * rate1 + 50 * rate2 + 100 * rate3 + 200 * rate4 + (no_of_units - 400) * rate5));
        }
        sc.close();
    }
}
