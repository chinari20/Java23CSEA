import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the range of fibonnaci series:");
        int num = s.nextInt();
        int[] a = new int[num];
        a[0]=0;
        a[1] =1;
        int n=0;
        int n1=1;
        for(int i =2;i<num;i++){
            int next_term = n+n1;
            a[i] = next_term;
            n = n1;
            n1 = next_term;
        }
        for(int i = 0;i<a.length;i++){
            if(isPrime(a[i])){
                System.out.println(a[i]);
            }
        }
            }
        }
