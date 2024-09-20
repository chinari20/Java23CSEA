import java.util.*;
class commonElements {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the len of array:");
        int l = s.nextInt();
        int[] a = new int[l];
        int[] b = new int[l];
        System.out.println("enter the ele of array1:");
        for(int i =0;i<l;i++){
            a[i] = s.nextInt(); 
        }
        System.out.println("enter the ele of array2:");
         for(int i =0;i<l;i++){
            b[i] = s.nextInt(); 
         }
        for(int i=0;i<l;i++){
            for(int j =0;j<l;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
