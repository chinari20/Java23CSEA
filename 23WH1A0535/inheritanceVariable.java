package Practice;

public class instanceVariable {
	static int num = 10000;
	public static void main(String[] args) {
		instanceVariable object = new instanceVariable();
		System.out.println(object.num);//10000 with object
		System.out.println(num);//10000 without object
		System.out.println(instanceVariable.num);//10000 with class (recommended)
	}
}
/*static only 1 copy is created and shared by all objects in non static multiple copies of object are created*/
