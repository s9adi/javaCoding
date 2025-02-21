package coding.InterviewQuestions.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        int[] array = {11,2,3,4,5,6,7};

        // Convert the array to Stream, map to Integer objects, and sort using a lambda expression
        List<Integer> sortedList = Arrays.stream(array) // Create an IntStream
                .mapToObj(Integer::valueOf) // Convert each int to Integer
                .sorted((a, b) -> b-a) // Sort using a lambda expression (ascending order)
                .collect(Collectors.toList()); // Collect to a List
                

        System.out.println(sortedList);
    }


}
