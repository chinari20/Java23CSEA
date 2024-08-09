package PracticePackage;

public class StaticVariable {
	static int num = 12 ;
	public static void main(String[] args) {
		System.out.println(num); // can access static in static directly
		System.out.println("-------------------------");
		
		// creating obj to call non-static method and access static through objs 
		
		StaticVariable object = new StaticVariable() ;
		StaticVariable object2 = new StaticVariable() ;// can create n obj
		
		System.out.println(object.num);
		System.out.println(object2.num);
		
		object.Sample(); //to call method
		object2.Sample();
		
		System.out.println("-------------------------");
		
		//num = 14 ; can do like this to change value
		object.num = 14 ;
		
		System.out.println(object.num);
		System.out.println(object2.num);
		object.Sample();
		object.Sample();
	}
	public void Sample(){
		System.out.println(num); // can access static value in non-static area 
	}
}
// note : we can also access static variables with class name : Syn = classname.variablename
