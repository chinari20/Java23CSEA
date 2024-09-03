import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter old meter reading: ");
        int oldReading = scanner.nextInt();
        
        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();
        
        int units = currentReading - oldReading;
        int totalCost = 0;
        
       
        if (units > 400) {
            totalCost += (units - 400) * 5; 
            units = 400;
        }
        if (units > 200) {
            totalCost += (units - 200) * 4; 
            units = 200;
        }
        if (units > 100) {
            totalCost += (units - 100) * 3; 
            units = 100;
        }
        if (units > 50) {
            totalCost += (units - 50) * 2; 
            units = 50;
        }
        if (units > 0) {
            totalCost += units * 1; 
        }
        
        
        System.out.println("Total electricity bill: Rs." + totalCost);
       
    }
}

Output:
Enter old meter reading: 1000
Enter current meter reading: 2000
Total electricity bill: Rs.4250
