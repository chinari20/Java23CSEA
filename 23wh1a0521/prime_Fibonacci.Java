import java.util.Scanner;
class Fibinocci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0,b=1;
        int temp=a+b;
        int n;
        n=sc.nextInt();
        while(temp<n){
            int count=0;
            for(int i=1;i<=temp;i++){
                if(temp%i==0){
                    count+=1;
                }
            }
            if(count==2){
                    System.out.println(temp);
                }
            a=b;
            b=temp;
            temp=a+b;
        }
    }
}
