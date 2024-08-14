import java.util.*;

public class powerBill {
    public static int bill(int oldReading , int newReading){
        int flag = 0;
        int reading = newReading - oldReading;
        int bill = 0;
        if(flag == 0){
            flag++;
            if (reading <= 50) return reading + bill;
            else{
                bill += 50;
                reading -= 50;
            }
        }
        if(flag == 1){
            flag ++;
            if (reading <= 50) return 2 * reading + bill;
            else{
                bill += 100;
                reading -= 50;
            }
        }
        if(flag == 2){
            flag ++;
            if (reading <= 100) return 3 * reading + bill;
            else{
                bill += 300;
                reading -= 100;
            }
        }
        if(flag == 3){
            flag ++;
            if (reading <= 200) return 4 * reading + bill;
            else{
                bill += 800;
                reading -= 200;
            }
        }
        return bill + reading * 5;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the old and new readings: ");
        int oldReading = sc.nextInt();
        int newReading = sc.nextInt();
        int bill = bill(oldReading, newReading);
        System.out.println(bill);
    }
}
