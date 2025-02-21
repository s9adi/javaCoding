
package coding.InterviewQuestions.KPMG;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class GroupAnagrams {
    

    // Given an array of words, print all anagrams together. 
    // For example, if the given array is {“cat”, “dog”, “tac”, “god”, “act”},
 // then output may be “cat tac act dog god”

 public static void main(String[] args) {
        String[] array = {"cat" , "dog", "act" , "tac" , "god"};

        Solution(array);
 }

    private static void Solution(String[] array){
        Map<String, List<String>> list = new HashMap<>();

        for(int i = 0 ; i < array.length ; i++){
            char[] charArray = array[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (list.containsKey(key)){
                list.get(key).add(array[i]);
            }else {
                list.put(key, new ArrayList<>());
            }
        }

        list.entrySet().stream().forEach(x -> System.out.println(x));
    }
}
