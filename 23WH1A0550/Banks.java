package java550;

class Bank {
	public int getBalance() {
		return 0;
	}
}

class BankA extends Bank{
	public int getBalance() {
		return 1000;
	}
}

class BankB extends Bank{
	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank{
	
	public int getBalance() {
		return 2000;
	}
}


public class Banks{
	public static void main(String[] args) {
		Bank bankAobj= new BankA();
		Bank bankBobj= new BankB();
		Bank bankCobj= new BankC();
		System.out.println("Money deposited in Bank A :$"+bankAobj.getBalance());
		System.out.println("Money deposited in Bank B :$"+bankBobj.getBalance());
		System.out.println("Money deposited in Bank C :$"+bankCobj.getBalance());
	}
}
