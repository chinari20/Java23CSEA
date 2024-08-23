package program;
import java.util.*;

public class even_and_odd {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	int counter;
	int number = 0;
	int sumeven =0;
	int sumodd =0;
    number = sc.nextInt();

    System.out.println("The numbers you entered are: ");

    for (int i =0; i !=number; i=i)
            {
                if (i % 2 == 0)
                    sumeven = sumeven + i;
                else
                    sumodd = sumodd + i;
                i = sc.nextInt();
            }
    System.out.println("Even sum: " + sumeven);
    System.out.println("Odd sum: " + sumodd);
}

}
