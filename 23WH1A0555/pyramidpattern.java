package bhavani;

public class pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i,j,k;
			for(i = 1; i <= 7 ;i++) {
				for(j = 1; j <= 7 - i; j++) {
					System.out.print(" ");
				}
			
				for(k = 1; k <= i*2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i = 6; i >= 1 ; i--) {
				for(j = 7 - i; j >= 1; j--) {
					System.out.print(" ");
				}
			
				for(k = i*2 - 1; k >= 1; k--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}