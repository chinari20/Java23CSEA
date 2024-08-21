
import java.util.Scanner;
public class powerBill {
	public static void main(String[] args) {
	    System.out.println("enter the old readings : ");
	    System.out.println("enter the current readings : ");
		Scanner sc = new Scanner(System.in);
		int oreadings = sc.nextInt();
		int creadings = sc.nextInt();
		int units = creadings - oreadings;
		int bill =0;
		if(units<=50 && units>0){
		    bill = units*1;
		}
		else if(units<=100 && units>50){
		    bill = 50 + ((units-50)*2);
		} 
			else if(units<=200 && units>100){
		    bill = 50 + 100+ ((units-100)*3);
		}
	    	else if(units<=400 && units>200){
		    bill = 50 + 100+ 300+ ((units-200)*4);
		}
			else if(units>400){
		    bill = 50 + 100 + 300 + 800+((units-400)*2);
		}
		System.out.println(bill);
	}
}
