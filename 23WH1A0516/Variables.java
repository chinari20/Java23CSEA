package practicejava;

public class Variables {
	static String name = "Vaishnavi"; // Static variable
	public String getName(int num) {
		System.out.println(num);// Non static Method
		return name;
	}
	public static void main(String[] args) { // "main" is a  static method
		
		System.out.println(name);
		
		int num1 = 34 ; // local variable
		Variables obj1 = new Variables(); 
		
		System.out.println(obj1.getName(num1));
		
		obj1.name = "Vaishu";
		
		Variables obj2 = new Variables();
		
		System.out.println(Variables.name);
		System.out.println(Variables.name);
		
		System.out.println(num1);
		
		
		

	}

}
