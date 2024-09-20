package practicejava;

class BankA extends Bank10{
	int getBalance() {
		return 1000;
	}
}

class BankB extends Bank10 {
	int getBalance() {
		return 1500;
	}

}

class BankC extends Bank10 {
	int getBalance() {
		return 2000;
	}

}

public class Bank10 {
	
	int getBalance() {
		return 0;
	}
	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		System.out.println("Amount deposited in bankA is $" + bankA.getBalance());
		System.out.println("Amount deposited in bankB is $" + bankB.getBalance());
		System.out.println("Amount deposited in bankC is $" + bankC.getBalance());
	
	}
}
