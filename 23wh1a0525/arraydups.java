import java.util.*;
class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,2,4,5};
        for(int i = 0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        
    }
}