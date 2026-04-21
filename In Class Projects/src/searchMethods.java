
public class searchMethods {

	public static void main(String[] args) {
		int[] a = {-4, 2, 7, 9, 15, 19, 25, 28, 30, 36, 42, 50, 56, 68, 85, 92};
		System.out.println(binarySearchHelper(a, 50));

	}
	public static int binarySearchHelper(int[] a, int target) {
		int max = a.length-1;
		return binarySearch(a, 0, max, target);
	}
	
	public static int binarySearch(int []a, int min, int max, int target) {
		//min and max are indices
		//target is the actual value we are looking for
	    int mid = (min + max) / 2;
	    if (a[mid] < target) {
	        return binarySearch(a, target, mid + 1, max);
	    } else if (a[mid] > target) {
	        return binarySearch(a, target, min, mid - 1);
	    } else {
	        return mid;
	    }
	}
}
