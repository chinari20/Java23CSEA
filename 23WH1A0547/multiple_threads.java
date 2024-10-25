package java14;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;
class random_num extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		Random num=new Random();
		int choice;
		do {
			int randomnum=num.nextInt(20);
			System.out.println("the random num is:"+randomnum);
			if(randomnum%2==0) {
				Even e=new Even(randomnum);
				e.start();
			}
			else {
				Odd o=new Odd(randomnum);
				o.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("do you want to continue process press 1");
			choice=sc.nextInt();
		}while(choice==1);
		sc.close();
		System.out.println("the system is terminated");
	}
}
class Even extends Thread{
	int n;
	Even(int randomnum){
		n=randomnum;
	}
	public void run() {
		System.out.println("the square of n is"+n*n);
	}
}
class Odd extends Thread{
	int n;
	Odd(int randomnum){
		n=randomnum;
	}
	public void run() {
		System.out.println("the cube of n is"+n*n*n);
	}
}
public class multiple_threads {

	public static void main(String[] args) {
		random_num r=new random_num();
		r.start();

	}

}
