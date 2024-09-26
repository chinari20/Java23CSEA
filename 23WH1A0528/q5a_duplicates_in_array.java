import java.util.Scanner;

public class q5a_DuplicatesInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the array
        System.out.print("Enter size of the array: ");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size]; // Declaration of the array
        
        // Reading values into the array
        System.out.println("Enter elements into the array: ");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        // Array to keep track of duplicates
        boolean[] printed = new boolean[arr_size];
        
        // Finding duplicate elements
        System.out.println("Duplicate elements are: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < arr_size; i++) {
            if (printed[i]) {
                // Skip if the element is already printed as a duplicate
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr_size; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    printed[j] = true; // Mark the duplicate element to avoid printing again
                }
            }
            if (isDuplicate) {
                System.out.println(arr[i]);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
        
        sc.close();
    }
}

