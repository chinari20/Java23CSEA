/*  1
    212
    32123
    4321234
*/
import java.util.Scanner;

public class Pattern{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size");
    int size = sc.nextInt();
    for(int i=0;i<size;i++){
      for(int j=i;j>0;j--){
        System.out.print(j);
      }
      for(int k=2;k<=i;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
