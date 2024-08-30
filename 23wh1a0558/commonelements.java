package java23wh1a0558;
import java.util.Scanner;


public class commonelements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your array size:");
		int size=scanner.nextInt();
		String[] array_1=new String[size];
		System.out.println("enter your elements:");
		
		for (int i = 0; i < size; i++) {
            array_1[i] = scanner.next();
        }
		System.out.println("enter your array size:");
		int size_1=scanner.nextInt();
		
		String[] array_2=new String[size_1];
		System.out.println("enter your elements:");
		for (int i = 0; i < size_1; i++) {
            array_2[i] = scanner.next();
        }
		
		for(int k=0;k<size;k++) {
			for(int j=0;j<size_1;j++) {
				if(array_1[k].equals(array_2[j])) {
					System.out.println(array_1[k]);
					
		 
				 }
			 }
			 
		 }
		 
		
	}

}
