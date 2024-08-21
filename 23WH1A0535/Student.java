public class Student{
    int num = 9899;
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.num = 8463;
        Student obj2 = new Student();
        System.out.println(obj1.num);//8463
        System.out.println(obj2.num);//9899
    }
}
// when obj is created a separate copy of instance var is created.
