//import java.util.Scanner;

public class q5c_CommonElements {

    public static void main(String[] args) {
        // Two string arrays
        String[] array1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] array2 = {"fig", "grape", "banana", "cherry", "apple", "kiwi"};

        System.out.println("Common elements are:");

        // Nested loop to find common elements
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Compare elements from both arrays
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]); // Print the common element
                    break; // Exit the inner loop once a match is found
                }
            }
        }
    }
}
