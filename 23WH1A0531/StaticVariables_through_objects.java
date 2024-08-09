// to access static variables using objects 

package PracticePackage;

public class StaticObjCreation {
	static String classNum = "DB304" ; 
	public static void main(String[] args) {
		//StaticObjCreation object1 = new StaticObjCreation() ;
		//StaticObjCreation object2 = new StaticObjCreation() ;
		StaticObjCreation.classNum = "NewStone304" ;
		System.out.println(StaticObjCreation.classNum) ;
		System.out.println(StaticObjCreation.classNum) ;
	}
	public String getStuAttendance(String rollNumber) {
		System.out.println(classNum) ;
		return rollNumber ;
	}
}

// Note : in static members even though we create many objects, only 1 copy is maintained
// and shared to all objects 
