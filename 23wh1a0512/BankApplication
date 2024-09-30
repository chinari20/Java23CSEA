import java.util.Scanner;

class Customer {
    String name;
    String aadharNumber;
    String pan;
    double balance;
    String accountNumber;

    public Customer(String name, String aadharNumber, String pan, String accountNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.pan = pan;
        this.balance = 0; // Initial balance
        this.accountNumber = accountNumber;
    }
}

public class BankApplication {
    private static final int MAX_CUSTOMERS = 100;
    private static Customer[] customers = new Customer[MAX_CUSTOMERS];
    private static int customerCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Mini Statement/Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    creditAmount(scanner);
                    break;
                case 3:
                    debitAmount(scanner);
                    break;
                case 4:
                    balanceEnquiry(scanner);
                    break;
                case 5:
                    transferAmount(scanner);
                    break;
                case 6:
                    System.out.println("Thank you for using the Bank Application!");
                    break;
                default:
                    System.out.println("Invalid option! Please select a valid option.");
            }

            if (option != 6) {
                System.out.print("Do you want to continue? (y/n): ");
                choice = scanner.nextLine();
            } else {
                choice = "n";
            }

        } while (choice.equalsIgnoreCase("y"));

        scanner.close();
    }

    private static void createAccount(Scanner scanner) {
        if (customerCount >= MAX_CUSTOMERS) {
            System.out.println("Cannot create more accounts. Maximum limit reached.");
            return;
        }

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        String aadharNumber = scanner.nextLine();
        System.out.print("Enter PAN number: ");
        String pan = scanner.nextLine();
        String accountNumber = "AC" + (customerCount + 1); // Simple account number generation

        customers[customerCount++] = new Customer(name, aadharNumber, pan, accountNumber);
        System.out.println("Account created successfully! Account Number: " + accountNumber);
    }

    private static void creditAmount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to credit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        for (Customer customer : customers) {
            if (customer != null && customer.accountNumber.equals(accountNumber)) {
                customer.balance += amount;
                System.out.println("Amount credited successfully! New Balance: $" + customer.balance);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void debitAmount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to debit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        for (Customer customer : customers) {
            if (customer != null && customer.accountNumber.equals(accountNumber)) {
                if (customer.balance >= amount) {
                    customer.balance -= amount;
                    System.out.println("Amount debited successfully! New Balance: $" + customer.balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void balanceEnquiry(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (Customer customer : customers) {
            if (customer != null && customer.accountNumber.equals(accountNumber)) {
                System.out.println("Account Holder: " + customer.name);
                System.out.println("Current Balance: $" + customer.balance);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    private static void transferAmount(Scanner scanner) {
        System.out.print("Enter your account number: ");
        String fromAccount = scanner.nextLine();
        System.out.print("Enter recipient's account number: ");
        String toAccount = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Customer fromCustomer = null;
        Customer toCustomer = null;

        for (Customer customer : customers) {
            if (customer != null) {
                if (customer.accountNumber.equals(fromAccount)) {
                    fromCustomer = customer;
                }
                if (customer.accountNumber.equals(toAccount)) {
                    toCustomer = customer;
                }
            }
        }

        if (fromCustomer == null) {
            System.out.println("Sender's account not found!");
            return;
        }

        if (toCustomer == null) {
            System.out.println("Recipient's account not found!");
            return;
        }

        if (fromCustomer.balance >= amount) {
            fromCustomer.balance -= amount;
            toCustomer.balance += amount;
            System.out.println("Transfer successful! New Balance: $" + fromCustomer.balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
