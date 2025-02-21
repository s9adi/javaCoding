package data_structures_algorithms.coding.InterviewQuestions.EPAM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterRepeatingMax {
    public static void main(String[] args) {
    Solution("aabbbccccddddd");
    }
    public static void Solution(String string){
        // aabbbccccddddd
        HashMap<String, Long> map = string.chars().mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.groupingBy(m -> m, HashMap::new, Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = map.entrySet().stream().sorted((entry2, entry1) -> {
            return Double.compare(entry1.getValue(), entry2.getValue());
        }).findFirst().get();
        System.out.println(stringLongEntry);
    }
}
