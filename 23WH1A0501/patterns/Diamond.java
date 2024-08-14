import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int halftrinaglemaxwidth = sc.nextInt();
        // Upper half
        for(int row = 1 ; row <= halftrinaglemaxwidth ; row ++){
            for(int spaces = 0 ; spaces < halftrinaglemaxwidth - row ; spaces++) System.out.print(" ");
            for (int star = 0 ; star < 2 * row - 1 ; star++) System.out.print("*");
            System.out.println();
        }
        //Lower half - just reverse outer loop of upper and remove starting iteration
        for(int row = halftrinaglemaxwidth - 1 ; row >= 1 ; row--){
            for(int spaces = 0 ; spaces < halftrinaglemaxwidth - row ; spaces++) System.out.print(" ");
            for (int star = 0 ; star < 2 * row - 1 ; star++) System.out.print("*");
            System.out.println();
        }

    }
}
