// A multi-thread application that has three threads. 
// First thread generates a random integer every 1 second and if the value is even, 
// the second thread computes the square of the number and prints.
// If the value is odd, the third thread will print the value of the cube of the number.
package java_programs;
import java.util.Random;

public class MyThread {
	public static void main(String args[]) {
		Random rand = new Random();
		int num = rand.nextInt(0,1000);
		System.out.println(num);
		if(num % 2 == 0) {
			EvenThread thread1 = new EvenThread();
			thread1.run(num);
		}
		else {
			OddThread thread2 = new OddThread();
			thread2.run(num);
		}
	}
}
class EvenThread extends MyThread{
	public void run(int n) {
		System.out.println("square: "+ n*n);
	}
}
class OddThread extends MyThread{
	public void run(int n) {
		System.out.println("cube: "+ n*n*n);
	}
}
