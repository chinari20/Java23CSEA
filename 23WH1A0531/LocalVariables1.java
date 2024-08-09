// to understand local variables( declared within methods, memory is allocated to the stack and will be removed from stack after usage)

package PracticePackage;

public class LocalVariables {
	static int num = 12 ;
	public static void main(String[] args) {
		System.out.println(num) ;
		LocalVariables obj1 = new LocalVariables();
		System.out.println(obj1.getStdId("23"));

	}
	public int getStdId (String rollNum ) {
		int num2 = 10 ;
		System.out.println(num2) ;
		return num ;
	}
	
	
}
