//Program to implement the following. A Boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. 
//We have to print the money deposited by him in a particular bank. Create a class 'Bank' with a method 'getBalance' which returns 0.
//Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount
//deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.

package assignment;

public class Bank {
	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	private int balance = 1000;
	int getBalance() {
		return balance;
	}
}
class BankB extends Bank{
	private int balance = 1500;
	int getBalance(){
		return balance;
	}
}
class BankC extends Bank{
	private int balance = 2000;
	int getBalance() {
		return balance;
	}
}
class Main {
	public static void main(String args[]) {
		Bank bankA = new BankA();
		Bank bankB = new BankB();
		Bank bankC = new BankC();
		
		System.out.println("amount deposited in bank A: "+ bankA.getBalance());
		System.out.println("amount deposited in bank B: "+ bankB.getBalance());
		System.out.println("amount deposited in bank C: "+ bankC.getBalance());
	}
}
