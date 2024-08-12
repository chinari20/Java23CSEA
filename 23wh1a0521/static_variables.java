package java_practice;
public class static_program {
	static String classRoomNumber="DB304";
	static int num1;
	public static void main(String[] args) {
		int num;
		static_program obj1=new static_program();
		static_program obj2=new static_program();
		obj1.classRoomNumber="newstone305";
		System.out.println(static_program.classRoomNumber);
		System.out.println(obj2.classRoomNumber);
		System.out.println(static_program.num1);
	}
	public String getAttendance(String rollnum) {
		System.out.println(classRoomNumber);

		return rollnum;
	}
}
