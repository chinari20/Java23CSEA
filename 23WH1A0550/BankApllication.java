package helloWorld;import java.util.Scanner;
class Account {
    private String name;
    private String aadharNumber;
    private String panNumber;
    private double balance;
    public Account(String name, String aadharNumber, String panNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.balance = 0.0;
    }
    public String getName() {
        return name;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void creditAmount(double amount) {
        balance += amount;
    }
    public boolean debitAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}



public class BankAplllication {

    private static Account[] accounts = new Account[100];

    private static int accountCount = 0;

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        while (true) {

            System.out.println("Bank Application Menu:");

            System.out.println("1. Account Creation");

            System.out.println("2. Credit Amount");

            System.out.println("3. Debit Amount");

            System.out.println("4. Mini Statement/Balance Enquiry");

            System.out.println("5. Transfer Amount");

            System.out.println("6. Continue (y/n)");



            int choice = scanner.nextInt();

            scanner.nextLine(); // consume the newline character



            switch (choice) {

                case 1:

                    createAccount();

                    break;

                case 2:

                    creditAmount();

                    break;

                case 3:

                    debitAmount();

                    break;

                case 4:

                    miniStatement();

                    break;

                case 5:

                    transferAmount();

                    break;

                case 6:

                    System.out.print("Continue? (y/n): ");

                    String continueChoice = scanner.nextLine();

                    if (!continueChoice.equalsIgnoreCase("y")) {

                        System.out.println("Exiting the application.");

                        return;

                    }

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }



    private static void createAccount() {

        System.out.print("Enter customer name: ");

        String name = scanner.nextLine();

        System.out.print("Enter Aadhar number: ");

        String aadharNumber = scanner.nextLine();

        System.out.print("Enter PAN number: ");

        String panNumber = scanner.nextLine();



        // Check if the account already exists

        for (int i = 0; i < accountCount; i++) {

            if (accounts[i].getAadharNumber().equals(aadharNumber)) {

                System.out.println("Account with this Aadhar number already exists.");

                return;

            }

        }



        // Create a new account

        Account account = new Account(name, aadharNumber, panNumber);

        if (accountCount < accounts.length) {

            accounts[accountCount++] = account;

            System.out.println("Account created successfully.");

        } else {

            System.out.println("Account storage is full.");

        }

    }



    private static Account findAccountByAadhar(String aadharNumber) {

        for (int i = 0; i < accountCount; i++) {

            if (accounts[i].getAadharNumber().equals(aadharNumber)) {

                return accounts[i];

            }

        }

        return null;

    }



    private static void creditAmount() {

        System.out.print("Enter Aadhar number: ");

        String aadharNumber = scanner.nextLine();

        System.out.print("Enter amount to credit: ");

        double amount = scanner.nextDouble();

        scanner.nextLine(); // consume the newline character



        Account account = findAccountByAadhar(aadharNumber);

        if (account != null) {

            account.creditAmount(amount);

            System.out.println("Amount credited successfully.");

        } else {

            System.out.println("Account not found.");

        }

    }



    private static void debitAmount() {

        System.out.print("Enter Aadhar number: ");

        String aadharNumber = scanner.nextLine();

        System.out.print("Enter amount to debit: ");

        double amount = scanner.nextDouble();

        scanner.nextLine(); // consume the newline character



        Account account = findAccountByAadhar(aadharNumber);

        if (account != null) {

            if (account.debitAmount(amount)) {

                System.out.println("Amount debited successfully.");

            } else {

                System.out.println("Insufficient balance.");

            }

        } else {

            System.out.println("Account not found.");

        }

    }



    private static void miniStatement() {

        System.out.print("Enter Aadhar number: ");

        String aadharNumber = scanner.nextLine();



        Account account = findAccountByAadhar(aadharNumber);

        if (account != null) {

            System.out.println("Account Details:");

            System.out.println("Name: " + account.getName());

            System.out.println("Aadhar Number: " + account.getAadharNumber());

            System.out.println("PAN Number: " + account.getPanNumber());

            System.out.println("Balance: " + account.getBalance());

        } else {

            System.out.println("Account not found.");

        }

    }



    private static void transferAmount() {

        System.out.print("Enter sender's Aadhar number: ");

        String fromAadhar = scanner.nextLine();

        System.out.print("Enter receiver's Aadhar number: ");

        String toAadhar = scanner.nextLine();

        System.out.print("Enter amount to transfer: ");

        double amount = scanner.nextDouble();

        scanner.nextLine(); // consume the newline character



        Account fromAccount = findAccountByAadhar(fromAadhar);

        Account toAccount = findAccountByAadhar(toAadhar);



        if (fromAccount != null && toAccount != null) {

            if (fromAccount.debitAmount(amount)) {

                toAccount.creditAmount(amount);

                System.out.println("Amount transferred successfully.");

            } else {

                System.out.println("Insufficient balance.");

            }

        } else {

            System.out.println("One or both accounts not found.");

        }

    }

}


/*public class BankAplllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
