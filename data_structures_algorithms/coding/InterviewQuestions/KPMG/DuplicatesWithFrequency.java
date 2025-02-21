package coding.InterviewQuestions.KPMG;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aditya Sharma
 */
public class DuplicatesWithFrequency {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8 ,4,2,2,4,3,3,3,3,6,6,6,6,1,1,1,1};
        Solution(array);
    }

    private static void Solution(int[] array){
        Map<Integer , Integer> map = new HashMap<>();

        for (int i = 0 ; i < array.length ; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) +1);
        }

        System.out.println(map);
    }
}
