package practicejava;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		for(int row = 0;row < noOfRows;row++){
			for(int col = 0;col < noOfRows - row;col++){
				System.out.print(" ");
			}
		
			for(int col = 0;col <= row;col++){
				System.out.print("* ");				
			}
			System.out.println();
	}
	
		for(int row = noOfRows - 1;row > 0;row--){
			for(int col = 0;col <= noOfRows - row;col++){
				System.out.print(" ");
			}
		
			for(int col = 0;col < row;col++){
				System.out.print("* ");				
			}
			System.out.println();
		}
	}
}