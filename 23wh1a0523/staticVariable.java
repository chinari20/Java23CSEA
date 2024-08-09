package javapractice1;



public class variableStatic {

	static String classRoomNumber = "DB304";  //static variable(memory will be allocated in static area)

	//inside the class outside method with static keyword

	//we can access static variables 1.directly 2.object 3.class name

	public static void main(String args[]) {  //static method

		variableStatic obj1 = new variableStatic();

		variableStatic obj2 = new variableStatic();

		obj1.classRoomNumber = "newstone304";

		System.out.println(obj1.classRoomNumber);   //only one copy is created for all the objects in case of static variables

		System.out.println(obj2.classRoomNumber);

	}

	public String getAttendence(String rollNumber) {   //non-static method

		System.out.println(classRoomNumber);

		return rollNumber;

	}

}
