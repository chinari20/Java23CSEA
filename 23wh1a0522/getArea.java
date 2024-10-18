import java.util.*;

abstract class Shape{
	int length;
	int bredth;
	int radius;
	int base;
	int heigth;
	abstract public double Area();
}
class circle extends Shape{
	circle(int radius){
		this.radius=radius;
	}
	public double Area() {
		double area = 3.14*radius*radius;
		return area;
	}
}
class rectangle extends Shape{
	rectangle(int length,int bredth){
		this.length=length;
		this.bredth=bredth;
	}
	public double Area() {
		double area = length*bredth;
		return area;
	}
}
class triangle extends Shape{
	triangle(int base,int heigth){
		this.base=base;
		this.heigth=heigth;
	}
	public double Area() {
		double area = 0.5*base*heigth;
		return area;
	}
}
public class getArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//circle
		System.out.println("Enter the radius of circle: ");
		int r = sc.nextInt();
		circle c = new circle(r);
		System.out.println(c.Area());
		//rectangle
		System.out.println("Enter the length and bredth of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		rectangle rec = new rectangle(l,b);
		System.out.println(rec.Area());
		//triangle
		System.out.println("Enter the base and height of triangle: ");
		int base = sc.nextInt();
		int h = sc.nextInt();
		triangle tri = new triangle(base,h);
		System.out.println(tri.Area());		
	}
}
