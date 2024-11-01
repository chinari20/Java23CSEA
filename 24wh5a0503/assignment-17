package nikhi24;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;
	
class GenerateRandom extends Thread {
	public void run() {
			Scanner sc =new Scanner(System.in);
			Random num =new Random();
			int choice;
			{
				int randnum= num.nextInt(100);
				System.out.println("Generated number is :"+randnum);
				if(randnum % 2 == 0) {
					Even e =new Even(randnum);
					e.start();
				}
				else {
					Odd o=new Odd(randnum);
					o.start();
				}
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
		}
			
			sc.close();
			
		}
	}
	class Even extends Thread{
		int n;
		Even(int randnum){
			this.n=randnum;
		}
		public void run() {
			System.out.println("the Squareof"+n+"is "+n*n);
		}
	}
	class Odd extends Thread{
		int n;
		Odd(int randnum){
			this.n=randnum;
		}
		public void run() {
			System.out.println("the cube of"+n+"is"+n*n*n);
		}
	}
public class Threads{
		public static void main(String args[]) {
			GenerateRandom g =new GenerateRandom();
			g.start();
		}
}
