public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
