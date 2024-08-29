import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int r = s.nextInt();
        for(int i=0;i<r;i++){
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
