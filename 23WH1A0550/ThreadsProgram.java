package cse550;

import java.util.Random;
import java.util.Scanner;

class Even implements Runnable {
    int a;

    Even(int randomNum) {
        a = randomNum;
    }

    public void run() {
        System.out.println("The generated number is Even");
        System.out.println("The square of the number is: " + (a * a));
    }
}

class Odd implements Runnable {
    int a;

    Odd(int randomNum) {
        a = randomNum;
    }

    public void run() {
        System.out.println("The generated number is Odd");
        System.out.println("The cube of the number is: " + (a * a * a));
    }
}

class GenerateRandom extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int choice;
        do {
            int randomNum = num.nextInt(100);
            System.out.println("Generated number is: " + randomNum);
            Thread thread;

            if (randomNum % 2 == 0) {
                thread = new Thread(new Even(randomNum));
            } else {
                thread = new Thread(new Odd(randomNum));
            }
            thread.start();

            try {
                thread.join(); // Wait for the thread to finish
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Do you want to continue (press 1 for yes, 2 for no): ");
            choice = sc.nextInt();
        } while (choice == 1);
        
        sc.close();
        System.out.println("The process is terminated");
    }
}

public class ThreadsProgram {
    public static void main(String[] args) {
        GenerateRandom g = new GenerateRandom();
        g.start();
    }
}
1