package coding.InterviewQuestions.KPMG;

import java.util.HashMap;
import java.util.Map;

public class LongstSubStngNonRep {

    public static void main(String[] args) {
        Solution("abcdefghajkl");
    }

    private static void Solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = Integer.MIN_VALUE;
        for (int end = 0; end < s.length(); end++) {
            Character c = s.charAt(end);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }
            map.put(c, end);
            length = Math.max(length, end-start+1);
        }
    }

}
