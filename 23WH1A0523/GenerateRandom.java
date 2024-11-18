// A multi-thread application that has three threads. First thread generates a random integer every 1 second 
//and if the value is even, the second thread computes the square of the number and prints. If the value is odd, 
//the third thread will print the value of the cube of the number.

package projectjava;
import java.util.Random;
import java.util.Scanner;

class GenerateRandom extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		Random num = new Random();
		int randnum = num.nextInt(100);
		
		if (randnum%2==0) {
			Even e = new Even(randnum);
			e.run();
		}
		else {
			Odd o = new Odd(randnum);
			o.run();
		}
	}
	
}
class Even extends Thread{
	int n;
	Even(int randnum){
		n=randnum;
	}
	public void run() {
		System.out.println("square of "+n +" is "+n*n);
	}
}
class Odd extends Thread{
	int n;
	Odd(int randnum){
		n=randnum;
	}
	public void run() {
		System.out.println("cude of "+n+" is "+n*n*n);
	}
}
class Thread {
	public static void main(String args[]) {
		GenerateRandom g = new GenerateRandom();
		g.run();
	}

}
	
