package JAVA556;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,charge;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the old reading");
		int oldReading=sc.nextInt();
		System.out.println("Enter the new reading");
		int newReading=sc.nextInt();
		int units=newReading-oldReading;
		
		if(units<=50) {
			System.out.println("charge is"+units*1);
		}
		else if(units>50 && units<=100) {
			temp=units-50;
		    charge=temp*2+50;
			System.out.println("charge "+charge);
		}
		else if(units > 100 && units<=200) {
			temp=units-100;
			charge=temp*3+150;
			System.out.println("charge "+charge);
			
		}
		else if(units > 200 && units <=400) {
			temp=units-200;
			charge=temp*4+450;
			System.out.println("charge "+charge);
		}
		else {
			temp=units-400;
			charge=temp*5+1250;
			System.out.println("charge "+charge);
		}
		

	}


	}


