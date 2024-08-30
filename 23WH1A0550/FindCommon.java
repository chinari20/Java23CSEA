package helloWorld;
import java.util.Scanner;
public class FindCommon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] array1=new String[n];
		System.out.println("enter the elements of first array:");
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextLine();
		}
		System.out.println("enter the size of second array:");
		int n1=sc.nextInt();
		sc.nextLine();
		String[] array2=new String[n1];
		System.out.println("enter the elements of second array:");
		for(int i=0;i<n1;i++) {
			array2[i]=sc.nextLine();
		}
		System.out.println("Common element is:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
				}
			}
		}
	}
}