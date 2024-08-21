import java.util.Scanner;
class Student{
    String  name,rollNo;
    float marks;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
         name = sc.nextLine();
        System.out.print("Enter roll number: ");
         rollNo = sc.nextLine();
        System.out.print("Enter marks: ");
         marks = sc.nextFloat();
    }
    void displayData()
    {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
class Main{
    public static void main(String[] args) {
        Student sc = new Student();
        sc.getData();
        sc.displayData();
}
}

