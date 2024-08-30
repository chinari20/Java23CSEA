package helloWorld;
import java.util.Scanner;
public class DuplicateValue {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of an Array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the elements into array:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j]) {
					System.out.println("the duplicate element is:"+ array[i]);
				}	
			}
		}
	}
}