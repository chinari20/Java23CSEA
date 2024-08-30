import java.util.Scanner;
public class duplicates_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//reading size of array
		System.out.print("Enter size of the array: ");
		int arr_size = sc.nextInt();
		int arr[] = new int[arr_size]; // declaration of array
		
		//reading values into array
		System.out.print("enter elements into array: ");
		for(int i=0; i<arr_size; i++) {
			arr[i] = sc.nextInt();
		}
		

		int i;
		for(i=0; i<arr_size; i++) {
			for(int j=i+1; j<arr_size; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate elements are: " + arr[j]);
				}
			}
		}	
		sc.close();
	}
}
