package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//	Write a Java program to find the frequency of each character in a given string ?

public class FrequencyOfCharacter {
	public static void main(String[] args) {
//		frequency("debashis"); // {a=1, b=1, s=2, d=1, e=1, h=1, i=1}
//		frequencyarray("debashis"); // [1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0,
									// 0]
		frequency2("debashis");

	}

// Using HashMap	
	static void frequency(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				int temp = map.get(ch);
				map.put(ch, temp + 1);
			}
		}
		System.out.println(map);
	}

// Using Array (Frequency Array)	
	static void frequencyarray(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			a[index]++;

		}
		System.out.println(Arrays.toString(a));
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int index = ch - 'a';
			if (a[index] != 0) {
				System.out.println(ch + " " + a[index]);
			}
		}
	}

// Without Extra Data Structure	
	static void frequency1(String s) {
		while (s.length() > 0) {
			int previous = s.length();
			char ch = s.charAt(0);
			s = s.replace(ch + "", "");
			int current = s.length();
			System.out.println(ch + " " + (previous - current));
		}
	}

	static void frequency2(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == '\u0000')
				continue;
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';
				}
			}
			System.out.println(ch[i] + " " + count);
			ch[i] = '\u0000';
		}
	}
}
