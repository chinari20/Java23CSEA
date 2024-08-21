package Java_Practice;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*In java array is considered as an object which is created by new */
		
		//approach 1: with initialization
		int studentList[] = new int[4];
		studentList[0] = 501;
		studentList[1] = 502;
		System.out.println(studentList[1]);
		System.out.println(studentList[2]);
		
		
		//approach 2: with initialization 
		int javaMarks[] = {21, 22, 23};
		System.out.println(javaMarks[1]);
		System.out.println("size of array : "+ javaMarks.length);
		for (int i = 0;i<javaMarks.length;i++)
			System.out.println(javaMarks[i]+"\t");
		
		
		//approach 3: without initializing
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values you want to enter :");
		int n = sc.nextInt();
		int MyList[] = new int[n];
		System.out.println("Enter the values into the array :");
		for (int i = 0;i<MyList.length;i++)
			MyList[i] = sc.nextInt();
		System.out.println("size of array : "+ MyList.length);
		System.out.println("The elements are :");
		for (int i = 0; i<MyList.length; i++)
			System.out.println(MyList[i]+"\t");
		sc.close();
	}

}
