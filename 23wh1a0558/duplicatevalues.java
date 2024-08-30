package java23wh1a0558;

public class strings {
	public static void main(String[] args){
		int[] input_arr= {1,2,3,3,4,4,5};
		System.out.println("duplicate elements are :");
		for(int i=0;i<input_arr.length;i++) {
			for(int j=i+1;j<input_arr.length;j++) {
				if(input_arr[i]==input_arr[j]) {
					System.out.println(input_arr[j]);
					break;
				}
			}
		}
	}

}
