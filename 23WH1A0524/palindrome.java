import java.util.*;
class StringsDemo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        String s1 ="";
        for(int i =0;i<s.length();i++){
            s1 = s.charAt(i)+s1;
        }
        if (s.equals(s1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
