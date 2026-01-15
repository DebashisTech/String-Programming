package String;

public class findTheMissingVowelInString {
	public static void main(String[] args) {
		missingvowel("debashispalai");
	}

	static void missingvowel(String s) {
		String vowels = "aeiou";
		for (int i = 0; i < vowels.length(); i++) {
			char ch = vowels.charAt(i);
			if (s.contains(ch + "") == false) {
				System.out.print( ch + " ");  //o u 
			}
		}
	}

}
