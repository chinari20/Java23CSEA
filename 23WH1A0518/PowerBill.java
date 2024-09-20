package practicejava;
import java.util.*;
public class PowerBill {

	public static void main(String[] args) {
		int oldReading,currentReading,bill = 0;

		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter the old reading : ");

		oldReading = sc.nextInt();

		

		System.out.println("Enter the current reading : ");

		currentReading = sc.nextInt();

		

		int consumedUnits = currentReading - oldReading;

		

		if(consumedUnits <= 50) {

			bill = consumedUnits * 1;

		}

		else if(consumedUnits > 50 && consumedUnits <= 100) {

			bill = (50 * 1) + (consumedUnits - 50) * 2;

		}

		else if(consumedUnits > 100 && consumedUnits <= 200) {

			bill = (50 * 1) + (50 * 2) + ((consumedUnits - 100)*3);

		}

		else if(consumedUnits > 200 && consumedUnits <= 400) {

			bill = (50 * 1) + (50 * 2) + (100 * 3) + (consumedUnits - 200) * 4;

		}

		else if(consumedUnits > 400){

			bill = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (consumedUnits - 400) * 5;

		}

		

		System.out.println(bill);

		sc.close();


	}

}
