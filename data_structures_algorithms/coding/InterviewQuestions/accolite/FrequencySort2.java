package coding.InterviewQuestions.accolite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencySort2 {

	public static void main(String[] args) {
		
		int[] arr = { 4, 4, 6, 6, 6, 1, 2, 3, 3, 2, 2, 1, 1 };
        Solution(arr);
	}

	private static void Solution(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> entry = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		entry.sort((entry1 , entry2) ->{
			int freq = Integer.compare( entry2.getValue() , entry1.getValue());
			return freq;
		});
		
		System.out.println(entry);
	}
}
