package java_practice;

public class bubble {
	     static void bubbleSort(int[] array) {
	        int n = array.length;
	        System.out.println("swapped elements :");
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (array[j] > array[j + 1]) {
	                	System.out.println("{"+ array[j] +","+ array[j+1] +"}");
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }      
	        }
	    }
	    public static void main(String[] args) {
	        int[] array = {64, 34, 25, 12, 22, 11, 90};
	        System.out.println("Unsorted array:");
	        printArray(array);
	        bubbleSort(array);
	        System.out.println("Sorted array:");
	        printArray(array);
	        }
	   static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }


}
