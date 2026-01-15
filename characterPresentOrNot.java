package String;

public class characterPresentOrNot {
	public static void main(String[] args) {
		String res = "debashispalai";
		System.out.println(isCharPresent(res, 'a')); // true
		System.out.println(indexOf(res, 'a'));
		System.out.println(lastIndexOf(res, 'l'));
	}

// By traversing the string and comparing each character with the key character.

	static boolean isCharPresent(String s, char key) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == key) {
				return true;
			}
		}
		return false;
	}

// I used indexOf() which internally scans the string and returns -1 if the character is not present.

	static int indexOf(String s, char key) {
		for (int i = 0; i < s.length(); i++) {
			if (key == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	static int lastIndexOf(String s, char key) {
		for (int i = s.length() - 1; i > 0; i--) {
			char ch = s.charAt(i);
			if (ch == key) {
				return i;
			}
		}
		return -1;
	}
}
