package practicejava;

import java.util.Scanner;

public class Prime_Fib {

	public static void main(String[] args) {
		int num,t1=0,t2=1,next_term=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(next_term<=num){
			
			int count = 0;
			for(int i=1;i<=next_term;i++){
				if(next_term%i == 0){
					count+=1;
				}
			}
			if(count == 2){
				System.out.println(next_term);
			}
			t1 = t2;
			t2 = next_term;
			next_term = t1+t2;
			
		}
	}
}