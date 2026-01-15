package String;

import java.util.Arrays;

public class findTheMissing {
	public static void main(String[] args) {
		missing("maximum");
	}

	static void missing(String s) {
		boolean b[] = new boolean[26]; // Attendance array
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			b[index] = true;
		}
		System.out.println(Arrays.toString(b));
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int index = ch - 'a';
			if (b[index] == false) {
				System.out.println(ch);
			}
		}
	}

}
