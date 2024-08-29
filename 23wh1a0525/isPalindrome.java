import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder word = new StringBuilder(name); 
        if(name.equals(word.reverse().toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
}