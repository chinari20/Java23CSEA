
import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the old reading of electricity bill: ");
        int oldReadings = scanner.nextInt();
        System.out.print("Enter the new reading of electricity bill: ");
        int newReadings = scanner.nextInt();
        int units = newReadings - oldReadings;
        int temp_units = 0;
        int cost = 0;
        if(units>400){
            temp_units = units - 400;
            cost =  (temp_units * 5) + 1250;
        }
        else if(units>200 && units<=400){
            temp_units = units - 200;
            cost = (temp_units * 4) + 450;
        }
        else if(units>100 && units<=200){
            temp_units = units - 100;
            cost = (temp_units * 3) + 150;
        }
        else if(units>50 && units<=100){
            temp_units = units - 50;
            cost = (temp_units * 2) + 50;
        }
        else{
            cost = units;
        }
        System.out.printf("Number of units consumed : %d\n",units);
        System.out.printf("Electricity bill : %d/-",cost);
    }
}
