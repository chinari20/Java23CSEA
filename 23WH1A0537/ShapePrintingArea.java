import java.util.Scanner;
import java.util.*;

abstract class Shape{
    int dim1;
    int dim2;
    abstract void printArea();
    
}

class Rectangle extends Shape{
    public Rectangle(int length,int breath){
        this.dim1 = length;
        this.dim2 = breath;
    }
    
    @Override
    void printArea(){
        int area = dim1 * dim2;
        System.out.println("the area of rectangle is: " + area);
    }
}

class Triangle extends Shape{
    public Triangle(int base,int height){
        this.dim1 = base;
        this.dim2 = height;
    }
    
    @Override
    void printArea(){
        double area = 0.5 * dim1 * dim2;
        System.out.println("area of triangle is: " + area);
        
    }
}

class Circle extends Shape{
    public Circle(int radius){
        this.dim1 = radius;
        this.dim2 = 0;
    }
    
    @Override
    void printArea(){
        double area = Math.PI * dim1 * dim1;
        System.out.println("area of circle is: " + area);
    }
}

public class ShapeApplication{
    public static void main(String args[]){
        Shape rectangle = new Rectangle(4,5);
        rectangle.printArea();
        Shape triangle = new Triangle(3,6);
        triangle.printArea();
        Shape circle = new Circle(7);
        circle.printArea();
        
    }
}
