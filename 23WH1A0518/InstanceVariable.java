package practicepack;

public class InstanceVariable {
	String classRoomNumber = "DB304";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable object1 = new InstanceVariable();
		InstanceVariable object2 = new InstanceVariable();
		object1.classRoomNumber = "newStone304";
		System.out.println(object1.classRoomNumber);
		System.out.println(object2.classRoomNumber);
	}
	public String getAttendence(String rollNumber) {
		System.out.println(classRoomNumber);
		return rollNumber;
	}

}
