package PracticePackage;

public class InstVariable {
	int num = 12 ;
	public static void main(String[] args) {
		InstVariable object = new InstVariable() ;
		InstVariable object1 = new InstVariable() ; // can create n objs
		System.out.println(object.num);// access inst value in static using obj
		System.out.println(object1.num);
		object.Sample();
		System.out.println("-------------------") ;
		object.num = 14 ; // changing value of 1 obj
		System.out.println(object.num);
		System.out.println(object1.num); // other obj is not changed
		object.Sample(); // to call method in main

	}
	public void Sample(){
		System.out.println(num); // can access inst value in non-static/inst area 
	}

}
