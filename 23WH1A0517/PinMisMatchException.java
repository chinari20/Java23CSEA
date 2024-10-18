// Custom exception for locked accounts
class PinMisMatchException extends Exception {
    public PinMisMatchException(String message) {
        super(message);
    }
}

// Account class representing a bank account
class Account {
    private String holderName;
    private String pin;
    private int attempts;
    private boolean isLocked;

    public Account(String holderName, String pin) {
        this.holderName = holderName;
        this.pin = pin;
        this.attempts = 0;
        this.isLocked = false;
    }

    // Validate the entered PIN
    public boolean validatePin(String inputPin) throws PinMisMatchException {
        if (isLocked) {
            throw new PinMisMatchException("Sorry.. Your Account Has Been Locked");
        }
        if (!inputPin.equals(pin)) {
            attempts++;
            if (attempts >= 3) {
                lockAccount();
                throw new PinMisMatchException("Sorry.. Your Account Has Been Locked");
            }
            return false;
        }
        return true;
    }

    // Lock the account after too many failed attempts
    private void lockAccount() {
        isLocked = true;
    }
}

// ATM class simulating ATM operations
class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    // Access account method
    public void accessAccount(String inputPin) {
        try {
            if (account.validatePin(inputPin)) {
                System.out.println("Access Granted!");
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        } catch (PinMisMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Main class to run the application
public class ATM_PIN_Validator {
    public static void main(String[] args) {
        Account myAccount = new Account("John Doe", "1234");
        ATM atm = new ATM(myAccount);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your PIN: ");
            String pinInput = scanner.nextLine();
            atm.accessAccount(pinInput);
        }
        
        scanner.close();
    }
}
