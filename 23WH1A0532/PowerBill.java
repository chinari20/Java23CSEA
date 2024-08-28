package sudheepthiapplication;
import java.util.Scanner;

public class PowerBill {

	public static void main(String[] args) {
		int oldReading;
		int newReading;
		int consumerUsed;
		int bill = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter old reading");
		oldReading = obj.nextInt();
		System.out.println("enter new reading");
		newReading = obj.nextInt();
		consumerUsed = newReading - oldReading;
		if(consumerUsed <= 50) {
			bill = consumerUsed*1;
		}
		else if(consumerUsed >50 && consumerUsed<=100) {
			bill =  (50*1)+((consumerUsed-50)*2);
		}
		else if(consumerUsed>100 && consumerUsed<=200) {
			bill = (50*1)+(50*2)+((consumerUsed - 100)*3);
		}
		else if(consumerUsed >200 && consumerUsed<=400) {
			bill = (50*1) + (50*2) + (100*3) + ((consumerUsed-200)*4);
		}
		else if(consumerUsed>400) {
			bill = ( 50*1) + (50*2) +(100*3)+(200*4) + ((consumerUsed-400)*5);
		}
		System.out.printf("bill is %d",bill);
		obj.close();
	}

}
