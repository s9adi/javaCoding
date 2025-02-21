package coding.InterviewQuestions.accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 6, 6, 6, 1, 2, 3, 3, 2, 2, 1, 1 };
        Solution(arr);
    }

    private static void Solution(int[] array) {

        // Corrected approach
        final int[] sortedArray = Arrays.stream(array)
        .mapToObj(x -> Integer.valueOf(x)) // Convert int to Integer
        .collect(Collectors.groupingBy(k -> k, TreeMap::new, Collectors.counting()))

        .entrySet().stream()
        .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
        .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
        .mapToInt(Integer::intValue) // Convert back to int stream
        .toArray(); // Collect as int[] array

        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int num : array) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashmap.entrySet());

        list.sort((en1, en2) -> (en2.getValue() - en1.getValue()));
        // sorted the list in decreasing order
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i).getKey();
            int value = list.get(i).getValue();
            int looper = 0;
            while (looper < value) {
                array[counter++] = key;
                looper++;
            }
        }

        Arrays.stream(array).forEach(x -> System.out.println(x));

    }
}
