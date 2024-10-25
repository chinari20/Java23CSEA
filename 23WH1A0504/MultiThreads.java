package javap;
import java.util.*;
import java.util.Random;
public class Threads extends Thread{
	Random rand = new Random();
	static int num ;
	public void run() {
		while(true) {
			num = rand.nextInt(1000);
			System.out.println("number is " + num);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class EvenThreads extends Thread{
public void run() {
	while(true) {

		if(Threads.num % 2 == 0) {
			System.out.println("number is even");
			System.out.println("square  = " +Threads.num * Threads.num);
		}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
class OddThreads extends Thread{
public void run() {
	while(true) {
		if(Threads.num % 2 != 0) {
			System.out.println("number is odd");
			System.out.println("cube = " + Threads.num * Threads.num * Threads.num);
		}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
	}
}
}

class Threads1{
	public static void main(String[] args) {
		Threads t = new Threads();
		EvenThreads e = new EvenThreads();
		OddThreads o = new OddThreads();
			t.start();
			e.start();
			o.start();	
	}
}
