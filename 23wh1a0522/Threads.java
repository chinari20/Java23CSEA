package javaprograms;

import java.util.Random;

class Even extends Thread {
    private int num;

    public Even(int num) {
        this.num = num;
    }

    public void run() {
        squareNum();
    }

    public void squareNum() {
        System.out.println("Square of number " + num + " is: " + (num * num));
    }
}

class Odd extends Thread {
    private int num;

    public Odd(int num) {
        this.num = num;
    }

    public void run() {
        cubeNum();
    }

    public void cubeNum() {
        System.out.println("Cube of number " + num + " is: " + (num * num * num));
    }
}

class RandonNumber extends Thread {
    public void run() {
        Random rand = new Random();
        int randomNum = rand.nextInt(1000);

        if (randomNum % 2 == 0) {
            Even e = new Even(randomNum);
            e.start();
        } else {
            Odd o = new Odd(randomNum);
            o.start();
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        RandonNumber rnum = new RandonNumber();
        rnum.start();
    }
}
