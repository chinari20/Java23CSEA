// Base class
class Bank {
    public int getBalance() {
        return 0;
    }
}

// Subclass for Bank A
class BankA extends Bank {
    @Override
    public int getBalance() {
        return 1000;
    }
}

// Subclass for Bank B
class BankB extends Bank {
    @Override
    public int getBalance() {
        return 1500;
    }
}

// Subclass for Bank C
class BankC extends Bank {
    @Override
    public int getBalance() {
        return 2000;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Money deposited in Bank A: $" + bankA.getBalance());
        System.out.println("Money deposited in Bank B: $" + bankB.getBalance());
        System.out.println("Money deposited in Bank C: $" + bankC.getBalance());
    }
}
