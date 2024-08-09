package practicejava;

public class InstanceVariable {
		long studMobileNo = 9876543210L; // Instance variable
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable(); //creating object
		System.out.println(obj1.studMobileNo);
	}

}
// STATIC VARIABLE : 

// The variable which is declared inside the class and outside all the methods with a keyword static is called a static variable
// We can directly access the static variable from the static area
// the memory is allocated in the method area(static area) at the JVM
// non static - the memory is allocated in the heap when an object is created in the method
// static - the memory is allocated in the method area when the program is compiled

// METHODS TO ACCESS THE STATIC VARIABLES : 1. directly static 
//											2. Using objects 
//											3.using class name

// for a non static variable the memory is allocated for each and every object
// For a static variable the memory is allocated only once and the memory is shared between the objects.
// When a we try to change the data in the static variable using objects it will affect in the other objects also

// LOCAL VARIABLES :

// A variable which is declared inside a method is called a local variable.
// Memory is allocated in the stack memory 
// These can be accessed only in the method where it is declared
