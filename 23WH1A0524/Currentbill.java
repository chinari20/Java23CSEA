package javapractice;
import java.util.Scanner;
public class Currentbill {
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("enter old reading value: ");
		        int old_reading = sc.nextInt();
		        System.out.print("enter new reading value: ");
		        int new_reading = sc.nextInt();

		        int units = Math.abs(old_reading - new_reading);
		        System.out.println("number of units consumed are: " + units);
		        
		        if(no_of_units <= 50){
		            System.out.println("total amount = " + (units * 1));
		        }else if(no_of_units <=100){
		            System.out.println("total amount = " + (50 * 1+ (units - 50) * 2));
		        } else if(no_of_units <= 200){
		            System.out.println("total amount = " + (50 *1 + 50 *2 + (units - 100) * 3 ));
		        } else if(no_of_units <= 400){
		            System.out.println("total amount = " + (50 * 1 + 50 * 2 + 100 * 3 + (units - 200) * 4));
		        } else if(no_of_units > 400){
		            System.out.println("total amount = " + (50 * 1 + 50 * 2 + 100 * 3 + 200 *4 + (units - 400) *5));
		        }
		        sc.close();
		    }
		}
