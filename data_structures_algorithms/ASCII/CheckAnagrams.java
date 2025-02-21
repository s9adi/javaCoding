package data_structures_algorithms.ASCII;

public class CheckAnagrams {

	public static void main(String[] args) {
		Solution("listen" , "silent");
	}

	private static void Solution(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.err.println("Not Anagram");
			return;
		}
		// Create frequency arrays for each string (ASCII range 0-127)

		int[] frequency1 = new int[128]; // for ASCII characters
		int[] frequency2 = new int[128]; // for ASCII characters

		for (int i = 0; i < s1.length(); i++) {
			frequency1[s1.charAt(i)]++;
			frequency2[s2.charAt(i)]++;
		}
		for (int i = 0; i < 128; i++) {
			if (frequency1[i] != frequency2[i]) {
				System.err.println("Not Anagram");
				return;
			}
		}
		
		System.out.println("Anagram");
	}

}
