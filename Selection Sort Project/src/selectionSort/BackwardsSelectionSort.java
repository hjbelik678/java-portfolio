package selectionSort;

public class BackwardsSelectionSort {
	//O(n^2)
	public static void backSelectionSort(int[] array) {
		int n = array.length;
		for (int i = n - 1; i > 0; i--) {
	        int maxIndex = i;
	        for (int j = i - 1; j >= 0; j--) {
	            if (array[j] > array[maxIndex]) {
	                maxIndex = j;
	            }
	        }
	        int temp = array[maxIndex];
	        array[maxIndex] = array[i];
	        array[i] = temp;
	    }
    }
	public static void main(String[] args) {
        int[] arr = {64, 28, 12, 22, 9, 24, 63, 90, 35, 52, 71};
        backSelectionSort(arr);
        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
