package String;

//	In Java, every character has a numeric value (called ASCII value).

/*
A–Z → Uppercase
a–z → Lowercase
0–9 → Digit
Else → Special
*/

public class characterCount {
	public static void main(String[] args) {
		count("ABcd123!#$%DScd^45");
	}

	static void count(String s) {
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int special = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}

		}
		System.out.println("Uppercase letters: " + upper);
		System.out.println("Lowercase letters: " + lower);
		System.out.println("Digits: " + digit);
		System.out.println("Special symbols: " + special);
	}
}
