package coding.practice;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EYinterview {

    public static void main(String[] args) {
        Solution();
    }

    public static void Solution(){

        String string = "AdityaSharma";



// I have print frequency of each character
       HashMap<String, Long> map = string.toLowerCase().chars().mapToObj(x -> String.valueOf((char) x))
            .collect(Collectors.groupingBy(Function.identity() , LinkedHashMap::new , Collectors.counting()));

            map.entrySet().stream().forEach(x ->System.out.println(x));

    }
}
