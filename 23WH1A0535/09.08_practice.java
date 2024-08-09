//program1:-

package java_practice;

public class VariablesDemo {

	int mobileNumber = 123456789;//instance variable

	static String classRoomNumber = "DB304";//static variable

	public static void main(String[] args) {

		int number1 = 10;//local variable

		System.out.println(number1);//we must initialize before accessing the local variable.

		System.out.println(classRoomNumber);

		VariablesDemo object1=new VariablesDemo();//to access the static variables using class name.

		VariablesDemo object2=new VariablesDemo();//there exists only 1 static value which is stored in all the objects that are declared.so, all objects have the same static value.

		object1.classRoomNumber="newStone304";

		System.out.println(object1.classRoomNumber);

		System.out.println(object2.classRoomNumber);//both these print statements give the same value because all the objects have the same static value.

		VariablesDemo object3=new VariablesDemo();//here we are declaring a new object t access the getAttendence method.

		System.out.println(object3.getAttendence("27"));//here we are calling the getAttendence method and giving values for the variables in that method.

	}

	public String getAttendence(String rollNumber) {//this is a function or method.

		System.out.println(classRoomNumber);

		return rollNumber;

	}

}

//instance variable or non static variable: these variables are declared inside the class and outside the method.

//static variable: these variables are declared inside the class and outside the method or object and can be accessed directly.

//local variable: it needs to be initialized inside the method and can be accessed only in that method area.

//applications of these variables are 





//program2:-

package java_practice;

public class Practice1 {

	String StudentName = "key";

	static int StudentId = 333;

	public static void main(String[] args) {

		//System.out.println(StudentName); cannot be written because we Cannot make a static reference to the non-static field StudentName

		System.out.println(StudentId);

		Practice1 object1=new Practice1();

		Practice1 object2=new Practice1();

		Practice1 object3=new Practice1();

		object2.StudentName = "vaishu";//here we are giving a new value to the object of instance variable.

		System.out.println(object1.StudentName);

		object3.StudentId = 302;

		System.out.println(object3.StudentId);

		System.out.println(object2.StudentName);

	}

}
