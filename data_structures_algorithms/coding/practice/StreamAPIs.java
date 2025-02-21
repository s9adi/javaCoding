package coding.practice;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        String result = names.stream()
                .collect(Collectors.joining(", ", "[  ", "]"));

        System.out.println(result); // Output: [Alice, Bob, Charlie]
    }
}
