package activity;
import java.util.*;
public class Bank {
	int getBalance() {
		return 0;
	}
	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		int balanceA = bankA.getBalance();
		int balanceB = bankB.getBalance();
		int balanceC = bankC.getBalance();
		System.out.println("Amount deposited in bank A: " + balanceA);
		System.out.println("Amount deposited in bank B: " + balanceB);
		System.out.println("Amount deposited in bank C: " + balanceC);
	}

}
class BankA extends Bank {
	int getBalance() {
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to deposit in bank A: ");
		amount = sc.nextInt();
		return amount;
	}
}
class BankB extends Bank {
	int getBalance() {
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to deposit in bank B: ");
		amount = sc.nextInt();
		return amount;
	}
}
class BankC extends Bank {
	int getBalance() {
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to deposit in bank : ");
		amount = sc.nextInt();
		return amount;
	}
}

	
