import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int oldreading,newreading;
        Scanner sc = new Scanner(System.in);
        oldreading = sc.nextInt();
        newreading = sc.nextInt();
        int diff;
        int bill = 0;
        diff = newreading - oldreading;
        if(diff<50){
            bill = diff*1;
        }
        else if(diff<100){
            bill = 50*1 + (diff-50)*2;
        }
        else if(diff<200){
            bill = 50*1 + 50*2 + (diff-100)*3;
        }
        else if(diff<400){
            bill = 50*1 + 50*2 + 100*3 + (diff-200)*4;
        }
        else{
             bill = 50*1 + 50*2 + 100*3 + 200*4 + (diff-400)*5;
        }
        System.out.println(bill);
    }
}


