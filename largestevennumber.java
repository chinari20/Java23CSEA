package practiceJava24wh5a0503;
import java.util.*;
public class largestEvenNumber {
	    public static void main(String[] args) {
	        String input = "ad%#2373#@";
	        String result = findLargestEvenNumber(input);
	        System.out.println(result);
	    }
	    public static String findLargestEvenNumber(String str) {
	        Set<Character> digitSet = new HashSet<>();
	        for (char ch : str.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                digitSet.add(ch);
	            }
	        }
	        if (digitSet.isEmpty()) {
	            return "-1";
	        }
	        List<Character> digits = new ArrayList<>(digitSet);
	        Collections.sort(digits, Collections.reverseOrder());
	        char evenDigit = ' ';
	        StringBuilder largestEvenNumber = new StringBuilder();

	        for (char digit : digits) {
	            largestEvenNumber.append(digit);
	            // Check if the digit is even
	            if ((digit - '0') % 2 == 0) {
	                evenDigit = digit;
	            }
	        }
	        if (evenDigit == ' ') {
	            return "-1";
	        }

	        
	        if (largestEvenNumber.charAt(largestEvenNumber.length() - 1) % 2 != 0) {
	            
	            largestEvenNumber.deleteCharAt(largestEvenNumber.length() - 1);
	           
	            largestEvenNumber.append(evenDigit);
	        }

	        return largestEvenNumber.toString();
	    }
	}