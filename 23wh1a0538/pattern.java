import java.util.*;
class pattern {
    public static void main(String[] args) {
        int r = 5,c= 9;
        for(int i =1;i<=5;i++){
            int k = i;
            for(k = i;k>0;k--){
                System.out.print(k);
            }
            for(int j=k+2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}