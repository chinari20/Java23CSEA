import java.util.*;
public class PalindromicNumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int row = 1 ; row <= rows ; row++){
            for(int spaces = 0 ; spaces < rows - row ; spaces++) System.out.print(" ");
            int startnum = row;
            while(startnum >= 1){
                System.out.print(startnum);
                startnum--;
            }
            startnum += 2;
            while (startnum <= row) {
                System.out.print(startnum);
                startnum++;
            }
            System.out.println();
        }
    }
}