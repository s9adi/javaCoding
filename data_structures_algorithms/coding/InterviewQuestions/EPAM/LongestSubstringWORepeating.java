package data_structures_algorithms.coding.InterviewQuestions.EPAM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWORepeating {

    public static void main(String[] args) {

    }

    public static void Solution(String string) {
        // abcabcbb
        // Brute Force

        int max = 0;

        for (int i = 0; i < string.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i + 1; j < string.length(); j++) {
                if (set.contains(string.charAt(j))) {
                    max = Math.max(max, j - i);
                    break;
                }
                set.add(string.charAt(j));
            }
        }
    }

    public static void Solution2(String string) {
        // abcdabc
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int len = Integer.MIN_VALUE;

        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                left = map.get(string.charAt(i)) + 1;
            }

            map.put(string.charAt(i), left);
        }
    }
}
