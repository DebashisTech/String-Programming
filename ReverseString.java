package String;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("capital")); // latipac
		System.out.println(reverse1("capital")); // latipac
	}

//	in Two-Pointer / In-Place Swap Method
	static String reverse1(String s) {
		char ch[] = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}

//	in String Concatenation Method
	static String reverse(String s) {
		String op = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			op = op + ch;

		}
		return op;

	}
}
