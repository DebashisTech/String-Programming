package String;

public class countNoOfVowelInAString {
	public static void main(String[] args) {
		String s = "debashispalai";
		System.out.print(presentString(s));  // 6
	}

	static int presentString(String s) {
		String vowel = "aeiou";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

}
