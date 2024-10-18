package project;
import java.util.*;
public class ass8 {

  public static void main(String[] args) {
        String input = "ad%#2373#@";
        System.out.println(findLargestEvenNumber(input));
    }

    public static String findLargestEvenNumber(String str) {
        Set<Character> digitSet = new HashSet<>();
        
        // Extract digits and add to the set to remove duplicates
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitSet.add(ch);
            }
        }

        // If no digits found, return -1
        if (digitSet.isEmpty()) {
            return "-1";
        }

        // Create a list from the set and sort it in descending order
        List<Character> digits = new ArrayList<>(digitSet);
        Collections.sort(digits, Collections.reverseOrder());

        // Check for the largest even number
        StringBuilder largestEven = new StringBuilder();
        boolean evenFound = false;

        for (char digit : digits) {
            largestEven.append(digit);
            if (digit % 2 == 0) {
                evenFound = true;
            }
        }

        // If no even digit was found, return -1
        if (!evenFound) {
            return "-1";
        }

        // To form the largest even number, we need to ensure the last digit is even
        // Check if the last character in the current largest number is even
        char lastEvenDigit = '0';
        for (char digit : digits) {
            if (digit % 2 == 0) {
                lastEvenDigit = digit;
                break;
            }
        }

        // Remove the last character (which is odd if we reached here) and append the even digit
        if (largestEven.charAt(largestEven.length() - 1) % 2 != 0) {
            largestEven.setCharAt(largestEven.length() - 1, lastEvenDigit);
        }

        return largestEven.toString();
    }
}
