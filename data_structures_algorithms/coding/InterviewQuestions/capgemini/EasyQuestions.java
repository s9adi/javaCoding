package coding.InterviewQuestions.capgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EasyQuestions {

	public static void main(String[] args) {
		TwoStringsAnaGrams("silent", "listen");
		MergeAndSorting2Arrays(new int[] {1, 3, 5}, new int[]{2, 4, 6});
	}

	private static void TwoStringsAnaGrams(String s1, String s2) {

		// Check if lengths are the same
		if (s1.length() != s2.length()) {
			System.err.println("False");
			return;
		}

		// Create a map to store the frequency of characters in s1
		Map<Character, Integer> set = new HashMap<>();
		for (char ch : s1.toCharArray()) {
			set.put(ch, set.getOrDefault(ch, 0) + 1);
		}

		// Loop through each character in s2 and decrement its count in the map
		for (char ch : s2.toCharArray()) {
			if (set.containsKey(ch)) {
				set.put(ch, set.get(ch) - 1);
				if (set.get(ch) == 0) {
					set.remove(ch); // Remove character once its count reaches 0
				}
			} else {
				System.err.println("False");
				return;
			}
		}

		// If the map is empty, the strings are anagrams
		if (set.isEmpty()) {
			System.out.println("True");
		} else {
			System.err.println("False");
		}
	}

	private static void MergeAndSorting2Arrays(int[] array1, int[] array2) {
	
		//You are given two arrays. Merge them, sort the merged array, and then find the middle value.
		
//        int[] array1 = {1, 3, 5};
//        int[] array2 = {2, 4, 6};
		
		int[] mergedArray = new int[array1.length + array2.length];
		
		int start1 = 0;
		int start2 = 0;
		int fin = 0 ;
		while (start1 < array1.length && start2 < array2.length) {
			if(array1[start1] > array2[start2]) {
				mergedArray[fin++] = array2[start2++];
			}else if(array1[start1] < array2[start2]) {
				mergedArray[fin++] = array1[start1++];
			}else {
				mergedArray[fin++] = array1[start1++];
			}
		}
		
        while (start1 < array1.length) {
            mergedArray[fin++] = array1[start1++];
        }

        while (start2 < array2.length) {
            mergedArray[fin++] = array2[start2++];
        }
		
		Arrays.stream(mergedArray).forEach(x -> System.out.print(x + "\t"));
	}

	
}
