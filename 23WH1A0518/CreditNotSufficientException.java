package com.LabAssignment;
class CreditsNotSufficientException extends RuntimeException {
    public CreditsNotSufficientException(String message) {
        super(message);
    }
}
public class CreditNotSufficientException {

	public static void main(String[] args) {
		try {
            processTransaction(60);  // This will trigger the exception
        } catch (CreditsNotSufficientException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Continuing the flow...");
    }

    static void processTransaction(int credits) {
        checkCredits(credits);  // Call to check credits
        // Other transaction logic here...
        System.out.println("Transaction processed successfully.");
    }

    static void checkCredits(int credits) {
        if (credits < 50) {
            throw new CreditsNotSufficientException("Insufficient credits: " + credits + ". Minimum required is 50.");
        } else {
            System.out.println("Sufficient credits: " + credits);
        }
    }
}
