// To understand instance variables ( declared inside class and outside all methods )
package PracticePackage;

public class Student {
	int stuId = 531 ;
	
	public static void main(String[] args) {
		Student obj1 = new Student() ;
		Student obj2 = new Student() ;
		obj1.stuId = 532 ;
		// must create object to access instance variable from non-static in static area
		System.out.println(obj1.stuId) ;
		System.out.println(obj2.stuId) ;

	}

}
