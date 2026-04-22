import java.util.Arrays;

public class SortMethods {

	public static void main(String[] args) {
        int[] a = {4, 2, 8, 34, 14, 36, 1, 6, 3};
        
        // 1. Just call the method. It modifies 'a' directly.
        mergeSort(a);
        
        // 2. Use Arrays.toString() to print the contents of the array.
        System.out.println(Arrays.toString(a));
    }
	
	// Rearranges the elements of a into sorted order using
	// the merge sort algorithm.
	public static void mergeSort(int[] a) {
		if (a.length >= 2) {
		    // split array into two halves
		    int[] left  = Arrays.copyOfRange(a, 0, a.length/2);
		    int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
	
		    // sort the two halves
		    mergeSort(left);
		    mergeSort(right);
	
		    // merge the sorted halves into a sorted whole
		    merge(a, left, right);
		}
	}

	
	// Merges the left/right elements into a sorted result.
	// Precondition: left/right are sorted
	public static void merge(int[] result, int[] left, 
	                                       int[] right) {
	    int i1 = 0;   // index into left array
	    int i2 = 0;   // index into right array

	    for (int i = 0; i < result.length; i++) {
	        if (i2 >= right.length ||
	           (i1 < left.length && left[i1] <= right[i2])) {
	            result[i] = left[i1];    // take from left
	            i1++;
	        } else {
	            result[i] = right[i2];   // take from right
	            i2++;
	        }
	    }
	}
}
