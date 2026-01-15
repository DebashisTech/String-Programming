package String;


// it contains every letter of the English alphabet (A–Z) at least once.

public class pangramCheck {
	public static void main(String[] args) {
		String s = "debashispalai";
		System.out.println(pangram(s));
	}

	static boolean pangram(String s) {
		boolean b[] = new boolean[26]; // Attendance array
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			b[index] = true;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int index = ch - 'a';
			if (b[index] == false) {
				return false;
			}
		}
		return true;
	}
}
