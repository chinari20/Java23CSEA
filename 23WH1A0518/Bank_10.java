package practicejava;

class BankA extends Bank_10{
	int getbalance(){
		return 1000;
	}
}
class BankB extends Bank_10{
	int getbalance(){
		return 1500;
	}
}
class BankC extends Bank_10{
	int getbalance(){
		return 2000;
	}
}
	
public class Bank_10 {
	int getbalance() {

		return 0;
	}	
	public static void main(String[] args) {
			BankA bankA = new BankA();

			BankB bankB = new BankB();

			BankC bankC = new BankC();

			System.out.println("Amount deposited in bankA is $" + bankA.getbalance());

			System.out.println("Amount deposited in bankB is $" + bankB.getbalance());

			System.out.println("Amount deposited in bankC is $" + bankC.getbalance());

		

		}

	}