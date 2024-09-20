package javap;

import java.util.Scanner;

public class Array_com {

	public static void main(String[] args) {
			Scanner n = new Scanner(System.in);
			int s = n.nextInt();
			int[] a = new int[s] ;
			int[] b = new int[s] ;
			
			for(int i=0;i<s;i++) {
				a[i] = n.nextInt();
			}
			for(int i=0;i<s;i++) {
				b[i] = n.nextInt();
			}
			for(int i=0;i<s;i++) {
				for(int j=0;j<s;j++) {
					if(a[i] == b[j]) {
						System.out.println(a[i]);
					}
				}
	}
	}
}
