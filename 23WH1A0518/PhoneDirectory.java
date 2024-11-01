package JavaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneDirectory {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("details.txt");
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
