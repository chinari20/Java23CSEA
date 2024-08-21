package java_practice;

public class static_program {
	static String classRoomNumber="db304";
	static int num;
	public static void main(String[] args){
		static_program object1=new static_program();
		static_program object2=new static_program();
		object1.classRoomNumber="newStone304";
		
		System.out.println(object1.classRoomNumber);

		System.out.println(object2.classRoomNumber);
		System.out.println(static_program.classRoomNumber);
		System.out.println(static_program.num);
		System.out.println(object2.classRoomNumber);
		
	}
	
	public String getAttencdene(String rollNumber) {
	
		System.out.println(classRoomNumber);
		//System.out.println(a);
	
		return rollNumber;
	}

}
