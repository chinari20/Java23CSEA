package project;
import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator extends Thread {
    private final NumberProcessor processor;
    private volatile boolean running = true; 

    public RandomNumberGenerator(NumberProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (running) {
            int number = random.nextInt(100); 
            System.out.println("Generated: " + number);
            processor.processNumber(number);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stopRunning() {
        running = false; 
    }
}

class NumberProcessor {
    public synchronized void processNumber(int number) {
        if (number % 2 == 0) {
            new SquareCalculator(number).start();
        } else {
            new CubeCalculator(number).start();
        }
    }
}

class SquareCalculator extends Thread {
    private final int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    }
}

class CubeCalculator extends Thread {
    private final int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }
}

public class MultiThreaded {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        RandomNumberGenerator generator = new RandomNumberGenerator(processor);
        generator.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to stop...");
        scanner.nextLine(); 

        generator.stopRunning(); 
        try {
            generator.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopped the generator.");
        scanner.close();
    }
}
