import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        // reading a word as an input
        String word = sc.nextLine();
        String reveString = "";

        // reversing the word
        for(int i = word.length() - 1; i >= 0; i--){
            reveString += word.charAt(i);
        }

        System.out.println(reveString);

        // Check whether the word is a palindrome
        if(word.equals(reveString)){
            System.out.println("The given word is palindrome");
        }
        else{
            System.out.println("The given word is not a palindrome");
        }

        sc.close();
    }
}
