//Henry B
package homework9;

public class sumTo_Main {
	public static void main(String[] args) {
		System.out.println("the reciprocal sum is " + sumTo(9));
	}
	
	public static double sumTo(int n) {
		double starting = 0.0;
		return summ(starting, n);
	}
	private static double summ(double sum, int n) {
		sum += 1.0/n;
		n--;
		if(n > 0) {
			//recursive case
			return summ(sum, n);
		}else {
			//base case
			return sum;
		}
	}
}
