package selectionSort;

public class DualSelectionSort {
	//O(n^2)
	public static void dualSelectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
	        int minIndex = i;
	        int maxIndex = i;

	        for (int j = i + 1; j < n - i; j++) {
	            if (array[j] < array[minIndex]) {
	                minIndex = j;
	            } else if (array[j] > array[maxIndex]) {
	                maxIndex = j;
	            }
	        }
	        //swap min index
	        int temp = array[minIndex];
	        array[minIndex] = array[i];
	        array[i] = temp;

	        if (maxIndex == i) {
	            maxIndex = minIndex;
	        }
	        
	        //swap max index
	        temp = array[maxIndex];
	        array[maxIndex] = array[n - i - 1];
	        array[n - i - 1] = temp;
	    }
	}
	public static void main(String[] args) {
        int[] arr = {64, 28, 12, 22, 9, 24, 63, 90, 35, 52, 71};
        dualSelectionSort(arr);
        System.out.print("Sorted is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
