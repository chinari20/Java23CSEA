package helloWorld;

import java.util.Scanner;

public class CurrrentBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter old readings:");
		int oldReading=sc.nextInt();
		System.out.println("enter new readings:");
		int newReading=sc.nextInt();
		int units=newReading-oldReading;
		int amount=0;
		if(units<=50) {
			System.out.println("the total amount is:"+units*1);
		}
		else if(units>50 &&units<=100) {
			amount=(50*1)+(units-50)*2;
			System.out.println("the total amount is:"+amount);
			
		}
		else if(units>100 &&units<=200) {
			amount=(50*1)+(50*2)+(units-100)*3;
			System.out.println("the total amount is:"+amount);
			
		}
		else if(units>200 && units<=400) {
			amount=(50*1)+(50*2)+(100*3)+(units-200)*4;
			System.out.println("the total amount is:"+amount);
			
		}
		else if(units>400) {
			amount=(50*1)+(50*2)+(100*3)+(50*4)+(units-400)*5;
			System.out.println("the total amount is:"+amount);
			
		}
		else {
			System.out.println("invalid");
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
