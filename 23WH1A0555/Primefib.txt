import java.util.*;
class primefibonocci{
    public static boolean isprime(int a){
            int cnt = 0;
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    cnt+=1;
                }
            }
            if(cnt==2){
                return true;}
            else{
                return false;
            }
            
    }
    public static void main(String[] args) {
        int n1 = 0,n2 = 1;
        int n3;
        for(int i=1;i<10;i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            if(isprime(n3)&&n3<10){
                System.out.println(n3);
            }
            
        }
        System.out.println("Try programiz.pro");
    }
}