import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final NumberProcessor processor;

    public RandomNumberGenerator(NumberProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            processor.processNumber(number);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
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
        System.out.println("Square of " + number + " is: " + square);
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
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class multithread {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        RandomNumberGenerator generator = new RandomNumberGenerator(processor);
        generator.start();
    }
}
