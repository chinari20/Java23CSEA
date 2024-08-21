import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		int oldReading,currentReading,units,powerBill;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter old reading");
		oldReading=sc.nextInt();
		System.out.println("Enter present reading");
		currentReading=sc.nextInt();
		units =currentReading-oldReading;
		System.out.println("Number of units are "+units);
		if(units >=0 && units <50) {
			powerBill=units*1;
			
		}
		else if(units>=50 && units<100) {
			powerBill=units*2;
		}
		else if(units>=100 && units<200) {
			powerBill=units*3;
			
		}
		else if(units>=200 && units <400) {
			powerBill=units*4;
		}
		else {
			powerBill=units*5;
		}
		System.out.println("Power bill is :"+powerBill);
	}

}
