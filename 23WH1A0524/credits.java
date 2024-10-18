package java524;
import java.util.*;
public class credits {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter credits");
		int x= s.nextInt();
		try {
			creditScore(x);
		} catch (exception_example e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}
	public static void creditScore(int score) throws exception_example{
		if(score<50) {
			throw new exception_example();
		}
		else {
			System.out.println("sufficent credits");
		}
	}
}
