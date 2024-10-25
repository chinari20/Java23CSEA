package JAVA556;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;

class random_num extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		Random num=new Random();
		int choice;

 do {

 int randomnum=num.nextInt(10);
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
	Thread.sleep(500); 
 }catch(InterruptedException e) {
	 System.out.println(e);
 }

System.out.println("Do you want to continue process, then press 1");
choice=sc.nextInt();

 }while(choice==1);
 
 	sc.close();
 	System.out.println("The system is terminated");

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
public class MultiThread {
	public static void main(String[] args) {
		random_num r=new random_num();
		r.start();
 }
 }