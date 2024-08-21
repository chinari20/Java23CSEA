import java.util.Scanner;
class Student{
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter marks: ");
        Float marks = sc.nextFloat();
        displayData(name,rollNo,marks);
    }
    void displayData(String name,String rollNo,Float marks)
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
}
}

