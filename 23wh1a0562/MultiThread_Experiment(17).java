package lab_practice;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;
class GenerateRandomThread  extends Thread{
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		Random num = new Random();
		int choice;
		do {
			int randnum = num.nextInt(20);
			System.out.println("Generated Random Number is "+ randnum);
			
			if(randnum % 2 == 0)
			{
				EvenThread e = new EvenThread(randnum);
				e.start();
			}
			else
			{
				OddThread o = new OddThread(randnum);
				o.start();
			}
			try {
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			System.out.println("Do you want to Continue the process(Press 1 or Press 0): ");
			choice = scanner.nextInt();
			
		}while(choice == 1);
		System.out.println("Process is Terminated");
	}
}

class EvenThread extends Thread {
	int num;
	EvenThread(int randnum)
	{
		this.num = randnum;
	}
	public void run()
	{
		System.out.println("Square of "+num+" is "+(num*num));
	}
}
class OddThread extends Thread {
	int num;
	OddThread(int randnum)
	{
		this.num = randnum;
	}
	public void run()
	{
		System.out.println("Cube of "+num+" is "+(num*num*num));
	}
}
public class Threads{
	public static void main(String []args)
	{
		GenerateRandomThread g = new GenerateRandomThread();
		g.start();
	}
}

Output:
Generated Random Number is 6
Square of 6 is 36
Do you want to Continue the process(Press 1 or Press 0): 
1
Generated Random Number is 13
Cube of 13 is 2197
Do you want to Continue the process(Press 1 or Press 0): 
1
Generated Random Number is 16
Square of 16 is 256
Do you want to Continue the process(Press 1 or Press 0): 
1
Generated Random Number is 10
Square of 10 is 100
Do you want to Continue the process(Press 1 or Press 0): 
0
Process is Terminated



 
