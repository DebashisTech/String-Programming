package String;


// first check the reverse Then equal or not with original

public class PallindromeString {
	public static void main(String[] args) {
		System.out.println(isPallindrome("madam")); // true
		System.out.println(isPallindromeOrNot("MadaM")); // true
	}

// Using StringBuilder (Built-in reverse)

	static boolean isPallindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev.equals(rev);
	}

// Using Recursion

	static boolean isPallindromeOrNot(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
