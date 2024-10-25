package javapractice524;
import java.util.Random;
class multithreadApplication extends Thread {
	Random r = new Random();
	static int num;
	public void run() {
		while(true) {
			num=r.nextInt(1000);
			System.out.println("number generated is"+num);
			try{
				Thread.sleep(1000);
				}
			catch (InterruptedException e) {
				e.printStackTrace();
				}
		}
	}
	}
class evenThread extends Thread{
	public void run() {
		while(true) {
			if(multithreadApplication.num%2==0) {
				System.out.println("number is even");
				System.out.println("squre of num is"+multithreadApplication.num*multithreadApplication.num);
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	}
}

class oddThread extends Thread{
	public void run() {
		while(true) {
			if(multithreadApplication.num%2!=0) {
				System.out.println("number is odd");
				System.out.println("cube of the number"+multithreadApplication.num*multithreadApplication.num*multithreadApplication.num);
				try {
					Thread.sleep(1000);
					}
				catch(InterruptedException e) {
					e.printStackTrace();
					}
				}
		}
	}
	}
class main {
	public static void main(String[]args) {
		multithreadApplication ob1= new multithreadApplication();
		evenThread ob2 = new evenThread();
		oddThread ob3 = new oddThread();
		ob1.start();
		ob2.start();
		ob3.start();
			
		}
}
