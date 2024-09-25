import java.util.Scanner;

public class BankApplication {
    private static int maxAccounts = 1000;
    private static int currentAccountCount = 0;
    private static String[] name = new String[maxAccounts];
    private static String[] AadharNumber = new String[maxAccounts];
    private static String[] PanNumber = new String[maxAccounts];
    private static String[] AccountNo = new String[maxAccounts];
    private static float[] Amount = new float[maxAccounts];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char continueChoice = 'y';

        while (continueChoice == 'y') {
            System.out.println("---- Bank Menu ----");
            System.out.println("1. Account Creation");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Transfer Amount");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    createAccount(scan);
                    break;
                case 2:
                    creditAmount(scan);
                    break;
                case 3:
                    debitAmount(scan);
                    break;
                case 4:
                    balanceEnquiry(scan);
                    break;
                case 5:
                    transferAmount(scan);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

            System.out.println("Do you want to continue? (y/n):");
            continueChoice = scan.next().charAt(0);
        }

        System.out.println("THANK YOU for using the bank application.");
    }

    // Method to create an account
    public static void createAccount(Scanner scan) {
        System.out.println("Enter your name:");
        String cname = scan.next();
        name[currentAccountCount] = cname;

        System.out.println("Enter your Aadhar number:");
        String aadhar = scan.next();
        AadharNumber[currentAccountCount] = aadhar;

        System.out.println("Enter your PAN number:");
        String pan = scan.next();
        PanNumber[currentAccountCount] = pan;

        String accNo = "ACC" + (1000 + currentAccountCount); // Account number generation
        AccountNo[currentAccountCount] = accNo;
        Amount[currentAccountCount] = 1000; // Initial deposit

        System.out.printf("Account created successfully! Your account number is: %s\n", accNo);
        currentAccountCount++;
    }

    // Method to credit amount
    public static void creditAmount(Scanner scan) {
        System.out.println("Enter your account number:");
        String accNo = scan.next();
        int accIndex = findAccountIndex(accNo);

        if (accIndex != -1) {
            System.out.println("Enter amount to credit:");
            float creditAmount = scan.nextFloat();
            Amount[accIndex] += creditAmount;
            System.out.printf("Amount credited successfully! Your new balance is: %.2f\n", Amount[accIndex]);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to debit amount
    public static void debitAmount(Scanner scan) {
        System.out.println("Enter your account number:");
        String accNo = scan.next();
        int accIndex = findAccountIndex(accNo);

        if (accIndex != -1) {
            System.out.println("Enter amount to debit:");
            float debitAmount = scan.nextFloat();

            if (Amount[accIndex] >= debitAmount) {
                Amount[accIndex] -= debitAmount;
                System.out.printf("Amount debited successfully! Your new balance is: %.2f\n", Amount[accIndex]);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method for balance enquiry
    public static void balanceEnquiry(Scanner scan) {
        System.out.println("Enter your account number:");
        String accNo = scan.next();
        int accIndex = findAccountIndex(accNo);

        if (accIndex != -1) {
            System.out.printf("Account Holder: %s\n", name[accIndex]);
            System.out.printf("Aadhar Number: %s\n", AadharNumber[accIndex]);
            System.out.printf("PAN Number: %s\n", PanNumber[accIndex]);
            System.out.printf("Current Balance: %.2f\n", Amount[accIndex]);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to transfer amount
    public static void transferAmount(Scanner scan) {
        System.out.println("Enter your account number (from):");
        String fromAccNo = scan.next();
        int fromAccIndex = findAccountIndex(fromAccNo);

        System.out.println("Enter the account number to transfer to:");
        String toAccNo = scan.next();
        int toAccIndex = findAccountIndex(toAccNo);

        if (fromAccIndex != -1 && toAccIndex != -1) {
            System.out.println("Enter amount to transfer:");
            float transferAmount = scan.nextFloat();

            if (Amount[fromAccIndex] >= transferAmount) {
                Amount[fromAccIndex] -= transferAmount;
                Amount[toAccIndex] += transferAmount;
                System.out.printf("Transfer successful! Your new balance is: %.2f\n", Amount[fromAccIndex]);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Utility method to find the account index based on account number
    public static int findAccountIndex(String accNo) {
        for (int i = 0; i < currentAccountCount; i++) {
            if (AccountNo[i].equals(accNo)) {
                return i;
            }
        }
        return -1; // Return -1 if account not found
    }
}
