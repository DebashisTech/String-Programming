package String;

//	separates uppercase letters, lowercase letters, digits, and special characters from a string

public class characterCountUpperLowerDigitSpecial {
	public static void main(String[] args) {
		count("ABcd123!#$%DScd^45");
	}

	static void count(String s) {
		String upper = "";
		String lower = "";
		String digit = "";
		String special = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper = upper + ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lower = lower + ch;
			} else if (ch >= '0' && ch <= '9') {
				digit = digit + ch;
			} else {
				special = special + ch;
			}

		}
		System.out.println(upper + lower + digit + special);
	}

}

//	This program iterates through a string, classifies each character as uppercase, lowercase, digit, or special symbol using ASCII comparison, stores them separately, and prints them in a combined order.
