package helloWorld;
import java.util.Scanner;
abstract class Shape{
	int dimension1,dimension2;
	abstract void printArea();
}
class Rectangle extends Shape{
	Rectangle(int length,int width){
		this.dimension1=length;
		this.dimension2=width;
	}
	void printArea() {
		int area=dimension1*dimension2;
		System.out.println("Area of rectangle"+area);
	}
}
class Triangle extends Shape{
	Triangle(int base,int height){
		this.dimension1=base;
		this.dimension2=height;
	}
	void printArea() {
		double area=0.5*dimension1*dimension2;
		System.out.println("Area of triangle:"+area);
		
	}
}
class Circle extends Shape{
	Circle(int radius){
		this.dimension1=radius;
	}
	void printArea() {
		double area=Math.PI*dimension1*dimension1;
		System.out.println("Area of triangle:"+area);
		
	}
}


public class ShapesProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lengthof rectangle");
		int length=sc.nextInt();
		System.out.println("enter the width of rectangle");
		int width=sc.nextInt();
		Shape rectangle =new Rectangle(length,width);
		rectangle.printArea();
		
		System.out.println("enter the base triangle");
		int base=sc.nextInt();
		System.out.println("enter the height of triangle");
		int height=sc.nextInt();
		Shape triangle =new Triangle(base,height);
		triangle.printArea();
		
		System.out.println("enter the radius of circle");
		int radius=sc.nextInt();
		Shape circle =new Circle(radius);
		circle.printArea();
	}

}
