package project;

import java.util.Scanner;

class CreditsNotSufficientException extends Exception {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}

class CreditChecker {
    public void checkCredits(int credits) throws CreditsNotSufficientException {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Insufficient credits: " + credits);
        }
        System.out.println("Sufficient credits: " + credits);
    }
}

public class ass14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditChecker checker = new CreditChecker();

        try {
            checker.checkCredits(30);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        anotherMethod(checker, 70);
        anotherMethod(checker, 20);
        scanner.close();
    }

    public static void anotherMethod(CreditChecker checker, int credits) {
        try {
            checker.checkCredits(credits);
        } catch (CreditsNotSufficientException e) {
            System.out.println("Caught in anotherMethod: " + e.getMessage());
        }
    }
}


