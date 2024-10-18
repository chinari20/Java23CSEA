public class BubbleSort {
	public static void main(String[] args){
		int[] nums = {4,7,9,2,46,84,12,89,53};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					System.out.println("Swaping elements: "+ nums[i] +" and "+ nums[j]);
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.print("Descending order : ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
