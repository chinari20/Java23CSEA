import java.util.Scanner;

abstract class Shape{
    static int length,breadth,radius,base,height;
    abstract public double printArea();
}

class rectangle extends Shape{
    rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public double printArea(){
        return length * breadth;
    }
}

class circle extends Shape{
    circle(int r){
        radius = r;
    }
    public double printArea(){
        return 3.14 * (radius * radius);
    }
}

class triangle extends Shape{
    triangle(int B, int h){
        base = B;
        height = h;
    }
    public double printArea(){
        return 0.5 * base * height;
    }
}


public class q13_area_of_shapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        rectangle R = new rectangle(l, b);
        System.out.println("Area of rectangle = " + R.printArea());

        System.out.println("enter radius of circle: ");
        int r = sc.nextInt();
        circle C = new circle(r);
        System.out.println("Area of circle = " + C.printArea());

        System.out.println("enter base and height of triangle: ");
        int B = sc.nextInt();
        int h = sc.nextInt();
        triangle T = new triangle(B, h);
        System.out.println("Area of triangle = " + T.printArea());

        sc.close();
    }
}