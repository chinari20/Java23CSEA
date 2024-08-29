import java.util.*;

public class CommonElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        // reading the size and values into array1 
        System.out.print("Enter the size of array 1 : ");
        int size1 = sc.nextInt();
        String[] arr1 = new String[size1];
        sc.nextLine();
        for(int i = 0; i < size1; i++){
            System.out.print("Enter element " + (i + 1) + " of array 1: ");
            arr1[i] = sc.nextLine();
        }

        // reading the size and values into array2
        System.out.print("Enter the size of array 2 : ");
        int size2 = sc.nextInt();
        String[] arr2 = new String[size2];
        sc.nextLine();
        for(int i = 0; i < size2; i++){
            System.out.print("Enter element " + (i + 1) + " of array 2: ");
            arr2[i] = sc.nextLine();
        }

        // Checking the common elements in both the arrays
        for(int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}
