abstract class Shape {
    int dimension1;
    int dimension2;

    // Abstract method to print the area
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

    @Override
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.dimension1 = radius;
        this.dimension2 = 0; // Not used for Circle
    }

    @Override
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Circle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 5);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}
