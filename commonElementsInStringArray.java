import java.util.Scanner;
public class commonElementsinArray {
public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first array : ");
        String[] array1 = scanner.nextLine().split(" ");
        System.out.print("Enter the second array: ");
        String[] array2 = scanner.nextLine().split(" ");
        String[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: ");
        for (String element : commonElements) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
    public static String[] findCommonElements(String[] array1, String[] array2) {
        String[] commonElements = new String[Math.min(array1.length, array2.length)];
        int index = 0;
        for (String element1 : array1) {  
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    commonElements[index] = element1;
                    index++;
                    break;
                }
            }
        }

        return commonElements;
    }
}

