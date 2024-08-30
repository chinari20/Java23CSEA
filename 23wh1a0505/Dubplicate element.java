package String;
import java.util.Scanner;


public class Dubplicate {

		public static void main(String[]arg) {
			int i;
			System.out.println("enter the size: ");
			Scanner sc = new Scanner(System.in);
			int len = sc.nextInt();
			System.out.println("enter the element");
			int Array[]= new int[10];
			for(i=0;i<len;i++) {
				Array[i]=sc.nextInt();
			}
				for(i=0;i<len;i++) {
					for(int j=i+1;j<len;j++) {
						if(Array[i]==Array[j]) {
							System.out.println(Array[j]);
					
				}
			}
			
		}
		}
}




