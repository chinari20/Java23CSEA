package project;
import java.util.Scanner;
public class DuplicateElements {
	public static void main(String[] args) {
		int i,j;
		System.out.println("enter size: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		System.out.println("enter elements: ");
		int[] arr = new int[10];
		for(i = 0;i<len;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(i = 0;i<len;i++) {
			for(j = i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
				}
			}
		}
	}

}
