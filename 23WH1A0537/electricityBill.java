//program to find the consumption charges of electricity

import java.util.*;

class ElectricityBill {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter old reading\n");
       int oldReading = sc.nextInt();
       System.out.println("enter current reading\n");
       int  currentReading = sc.nextInt();
       int units = currentReading - oldReading;
       int charge = consumptionCharges(units);
       System.out.println("electricity bill = " + charge);
    }
    
    public static int consumptionCharges(int units){
        if (units < 50)
            return units;
        else if (units > 50 && units < 100)
            return 50 + (units - 50)*2;
        else if (units > 100 && units < 200)
            return 50 + 50*2 + (units - 100)*3;
        else if (units > 200 && units < 400)
            return 50 +  50*2 + 100*3 + (units - 200)*4;
        else 
            return 50 + 50*2 + 100*3 + 200*4 + (units - 400)*5;
    }
}
