package javaprograms;
import java.util.Scanner;
public class Electricity_bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter old reading: ");
		int old_reading = sc.nextInt();
		
		System.out.println("enter new reading: ");
		int new_reading = sc.nextInt();
		
		int no_units = Math.abs(new_reading - old_reading);
		System.out.println("no.of units:"+ no_units);
		int rate1 = 1;
		int rate2 = 2;
		int rate3 = 3;
		int rate4 = 4;
		int rate5 = 5;
		
		if(no_units <= 50) {
			System.out.println("total amount= "+ (no_units)*rate1);
		}
		else if(no_units <= 100) {
			System.out.println("total amount= "+ (50*rate1 + (no_units -50)*rate2));
		}
		else if(no_units <= 200) {
			System.out.println("total amount= "+ (50*rate1 + 100*rate2 +(no_units-100)*rate3));
		}
		else if(no_units <= 400) {
			System.out.println("total amount= "+ (50*rate1 + 100*rate2 + 200*rate3 + (no_units-200)*rate4));
		}
		else if(no_units > 400) {
			System.out.println("total amount= "+(50*rate1 + 100*rate2 + 200*rate3 + 400*rate4+ (no_units-400)*rate5));
		}
		sc.close();
		
		

	}

}
