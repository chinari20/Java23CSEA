// To understand Static variables

package PracticePackage;

public class StudentAttendence {
	int studentId = 531 ; // instance variable
	static String classRoomNumber = "DB304" ; // static variable
	public static void main(String[] args) {
		System.out.println(classRoomNumber) ; // this is static area as static is mentioned during declaration of main
	}
	public String getAttendence (String rollNumber ) {
		System.out.println(classRoomNumber); // this is non-static area
		return rollNumber ;
	}
}
// we are able to access the static variable in both static and non-static areas directly
