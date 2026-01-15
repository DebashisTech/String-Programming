package String;

public class SumOfDigit {
	public static void main(String[] args) {
		String res = "a1bc496de5";
		System.out.println(sumOfDigit(res)); // 25
	}

// in character comparison '0' to '9' . because it is fast and memory efficient.”	

	static int sumOfDigit(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') { // '0' ASCII = 48 , '5' ASCII = 53 , '5' - '0' = 5

				sum = sum + (ch - '0');
			}

		}
		return sum;
	}

}
