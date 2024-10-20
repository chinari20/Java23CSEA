import java.util.ArrayList;
import java.util.List;

public class q11_interface_of_bank {
    public static void main(String[] args) {
            // Late binding: Bank reference pointing to SBI object
            Bank sbiBank = new SBI();
            sbiBank.createAccount("John Doe", 1000);
            sbiBank.creditAmount(500);
            sbiBank.debitAmount(200);
            sbiBank.miniStatement();
            System.out.println("SBI Interest Rate: " + sbiBank.getRateOfInterest());
    
            System.out.println();
    
            // Late binding: Bank reference pointing to Axis object
            Bank axisBank = new Axis();
            axisBank.createAccount("Jane Smith", 2000);
            axisBank.creditAmount(1000);
            axisBank.transferAmount(sbiBank, 300);
            axisBank.miniStatement();
            System.out.println("Axis Interest Rate: " + axisBank.getRateOfInterest());
        }
    }
    
    interface Bank {
        // Create account with customer name and initial balance
        void createAccount(String customerName, double initialDeposit);
    
        // Credit an amount into the account
        void creditAmount(double amount);
    
        // Debit an amount from the account
        void debitAmount(double amount);
    
        // Transfer amount from this account to another
        void transferAmount(Bank receiver, double amount);
    
        // Display mini statement (transaction history)
        void miniStatement();
    
        // Return the fixed rate of interest
        double getRateOfInterest();
    }



class SBI implements Bank {
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();
    private static final double INTEREST_RATE = 4.5; // SBI Interest Rate

    @Override
    public void createAccount(String customerName, double initialDeposit) {
        this.accountHolderName = customerName;
        this.balance = initialDeposit;
        transactionHistory.add("Account created with initial deposit: " + initialDeposit);
        System.out.println("SBI account created for " + customerName);
    }

    @Override
    public void creditAmount(double amount) {
        balance += amount;
        transactionHistory.add("Credited: " + amount);
        System.out.println("Credited " + amount + " to SBI account.");
    }

    @Override
    public void debitAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Debited: " + amount);
            System.out.println("Debited " + amount + " from SBI account.");
        } else {
            System.out.println("Insufficient balance in SBI account.");
        }
    }

    @Override
    public void transferAmount(Bank receiver, double amount) {
        if (balance >= amount) {
            this.debitAmount(amount);
            receiver.creditAmount(amount);
            transactionHistory.add("Transferred: " + amount + " to another account.");
            System.out.println("Transferred " + amount + " to another account.");
        } else {
            System.out.println("Insufficient balance for transfer in SBI account.");
        }
    }

    @Override
    public void miniStatement() {
        System.out.println("SBI Mini Statement for " + accountHolderName);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    @Override
    public double getRateOfInterest() {
        return INTEREST_RATE;
    }
}



class Axis implements Bank {
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();
    private static final double INTEREST_RATE = 5.0; // Axis Interest Rate

    @Override
    public void createAccount(String customerName, double initialDeposit) {
        this.accountHolderName = customerName;
        this.balance = initialDeposit;
        transactionHistory.add("Account created with initial deposit: " + initialDeposit);
        System.out.println("Axis account created for " + customerName);
    }

    @Override
    public void creditAmount(double amount) {
        balance += amount;
        transactionHistory.add("Credited: " + amount);
        System.out.println("Credited " + amount + " to Axis account.");
    }

    @Override
    public void debitAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Debited: " + amount);
            System.out.println("Debited " + amount + " from Axis account.");
        } else {
            System.out.println("Insufficient balance in Axis account.");
        }
    }

    @Override
    public void transferAmount(Bank receiver, double amount) {
        if (balance >= amount) {
            this.debitAmount(amount);
            receiver.creditAmount(amount);
            transactionHistory.add("Transferred: " + amount + " to another account.");
            System.out.println("Transferred " + amount + " to another account.");
        } else {
            System.out.println("Insufficient balance for transfer in Axis account.");
        }
    }

    @Override
    public void miniStatement() {
        System.out.println("Axis Mini Statement for " + accountHolderName);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    @Override
    public double getRateOfInterest() {
        return INTEREST_RATE;
    }
}
