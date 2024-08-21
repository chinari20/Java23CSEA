
public class javaprog1 {
	int mobileNumber = 7799222; //non-static
    static String classRoomNumber = "DB304"; //static
    public static void main(String[] args){
    	javaprog1 object1 = new javaprog1();
    	javaprog1 object2 = new javaprog1();
    	object1.classRoomNumber = "newStone304";
    	System.out.println(object1.classRoomNumber);
        System.out.println(object2.classRoomNumber);
    }
    public static String getAttendance(String rollNumber) { 
    	int number1; //local variable should be initialised before using
        System.out.println(classRoomNumber);
        return rollNumber;
    }
    
}
