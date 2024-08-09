package Practice;

public class instance1 {
	static int num = 10000;
	public static void main(String[] args) {
		instanceVariable object = new instanceVariable();
		instanceVariable object1 = new instanceVariable();
		object.num = 1234;
		System.out.println(object.num);
		System.out.println(object1.num);
	}
}
