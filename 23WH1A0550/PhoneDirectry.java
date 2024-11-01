package helloWorld;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectry {

    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream("directory.txt");
            Scanner sc = new Scanner(fs); 

            Hashtable<String, String> ht = new Hashtable<>();  

            String[] arrayList;
            String a;

            System.out.println("Welcome to the phone directory");
            System.out.println("Phone numbers are:");

            while (sc.hasNext()) {
                a = sc.nextLine();
                arrayList = a.split("\\s+");

                if (arrayList.length >= 2) {  
                    ht.put(arrayList[0], arrayList[1]);
                    System.out.println(arrayList[0] + ": " + arrayList[1]);
                }
            }
            sc.close(); 

            System.out.println("Welcome to the phone directory");
            System.out.println("Menu:");
            System.out.println("1. Search by name");
            System.out.println("2. Search by mobile number");
            System.out.println("3. Exit");

            Scanner inputScanner = new Scanner(System.in);  

            String opt;
            String name, mobileNumber;

            while (true) {
                System.out.print("Choose an option: ");
                opt = inputScanner.next();

                switch (opt) {
                    case "1":
                        System.out.print("Enter name: ");
                        name = inputScanner.next();
                        if (ht.containsKey(name)) {
                            System.out.println("Mobile number is: " + ht.get(name));
                        } else {
                            System.out.println("Not found");
                        }
                        break;

                    case "2":
                        System.out.print("Enter mobile number: ");
                        mobileNumber = inputScanner.next();
                        boolean found = false;

                        for (Map.Entry<String, String> e : ht.entrySet()) {
                            if (mobileNumber.equals(e.getValue())) {
                                System.out.println("Name is: " + e.getKey());
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Not found");
                        }
                        break;

                    case "3":
                        System.out.println("Menu successfully exited");
                        inputScanner.close(); 
                        return;

                    default:
                        System.out.println("Choose an option between 1 and 3");
                        break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
