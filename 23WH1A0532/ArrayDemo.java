 package example;

public class ArrayDemo {

	public ArrayDemo() {
	}
		
	

	public static void main(String[] args) {
		int studentList[] = {21,22,23,24,25};
		System.out.println(studentList[0]);
		System.out.println("size of array:" + studentList.length);
		for(int i = 0; i< studentList.length;i++) {
			System.out.print(studentList[i] + "\t");
		}
		

	}

}

