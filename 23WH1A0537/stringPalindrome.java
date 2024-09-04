//to print given string is a palindrome or not
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = sc.next();
        int len = word.length(); 
        String result = isPalindrome(word,len);
        System.out.println(result);
    }
    
    public static String isPalindrome(String word,int len){
        for (int index = 0; index < len/2; index++){
            if (word.charAt(index) != word.charAt(len-index-1))
                return "not a palindrome";
        }
        return "it is a palindrome";
    }
}
