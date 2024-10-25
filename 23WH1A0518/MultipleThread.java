//Multiple Thread
package java_518;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random; 
class GenerateRandom extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		Random num = new Random();
		int choice;
		do {
			int randnum = num.nextInt(100);
			System.out.println("Generate Random Number is "+ randnum);
			if (randnum % 2 == 0) {
				EvenThread e= new EvenThread(randnum);
				e.start();
			}
			else {
				OddThread o = new OddThread(randnum);
				o.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Do you want to continue the process(press 1 or 0):");
			choice = sc.nextInt();
		}
		while(choice == 1);
		sc.close();
		System.out.println("The process is terminated");
	}
}
class EvenThread extends Thread{
	int num;
	EvenThread(int randnum){
		num = randnum;
	}
	public void run() {
		System.out.println("The Square of "+num+" is: "+num*num);
	}
}
class OddThread extends Thread{
	int num;
	OddThread(int randnum){
		num = randnum;
	}
	public void run() {
		System.out.println("The Cube of "+num+" is: "+num*num*num);
	}
}
public class MultipleThread {

	public static void main(String[] args) {
		GenerateRandom g = new GenerateRandom(); 
		g.start();
	}

}
