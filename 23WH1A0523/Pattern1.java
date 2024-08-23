/*  1
    12
    123
    1234
    12345
    123456    */
import java.util.Scanner;
public class Pattern{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size");
    int size = sc.nextInt();
    for(int i=0;i<size;i++){
      for(int j=1;j<i+1;j++){
        System.out.print(j);
      }System.out.println();
    }
  }
}
