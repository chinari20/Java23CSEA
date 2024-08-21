package JAVA556;

public class StaticProgram {

	static String classRoomNumber="DB304";

	static int num1;

			public static void main(String[] args) {

				int num;

				StaticProgram obj1=new StaticProgram();

				StaticProgram obj2=new StaticProgram();

				obj1.classRoomNumber="newstone305";

				System.out.println(StaticProgram.classRoomNumber);

				System.out.println(obj2.classRoomNumber);

				System.out.println(StaticProgram.num1);

				

			}

			public String getAttendance(String rollnum) {

				System.out.println(classRoomNumber);

				

				return rollnum;

			}




	}


