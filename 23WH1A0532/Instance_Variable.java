package practice;

public class Instance_Variable {
	int studentMobile = 99823;

	public static void main(String[] args) {
		Instance_Variable object1 = new Instance_Variable();
		Instance_Variable object2 = new Instance_Variable();
		object1.studentMobile= 10000;
		System.out.println(object1.studentMobile);
		System.out.println(object2.studentMobile);
		// TODO Auto-generated method stub

	}

}
