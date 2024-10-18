 package java_practice;

import java.util.Scanner;

   abstract class Shape{
		static int length,breadth,radius,height,base,width;
		abstract public double get_area();
	}
   
	class rectangle extends Shape{
		rectangle(int a,int b){
			length=a;
			breadth=b;
		}
		public double get_area() {
			return length*breadth;
		}
	}
	class circle extends Shape{
		circle(int a){
			radius=a;
		}
		public double get_area() {
			return 3.14*radius*radius;
		}
	}
	class triangle extends Shape{
		triangle(int a,int b){
			base=a;
			height=b;
		}
		public double get_area() {
			return (height*base)/2;
		}
	}
	
public class shape_area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle :");
		int r=sc.nextInt();
		circle c=new circle(r);
		System.out.println(c.get_area());
		System.out.println("enter the length and breadth of rectangle :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		rectangle rec=new rectangle(l,b);
		System.out.println(rec.get_area());
		System.out.println("enter the height and base of triangle :");
		int h=sc.nextInt();
		int ba=sc.nextInt();
		triangle tri=new triangle(h,ba);
		System.out.println(tri.get_area());
		}
}
