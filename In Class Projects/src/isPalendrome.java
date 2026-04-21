
// recursive coding practice
public class isPalendrome {
	
	public static boolean isPalendromic(String S) {
		if(S.length()<2) {
			// base case
			return true;
		}else if(S.charAt(0)==S.charAt(S.length())){
			// recursive case
			return isPalendromic(S.substring(1,S.length()-1));
		}else {
			return false;
		}
	}
	
	public static boolean main(String[] args) {
		return isPalendromic("racecar");
	}
}
