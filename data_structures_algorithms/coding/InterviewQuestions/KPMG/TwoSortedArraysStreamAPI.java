
package coding.InterviewQuestions.KPMG;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Aditya Sharma
 */
public class TwoSortedArraysStreamAPI {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        Solution(arr, arr2);
    }

    private static void Solution(int[] arr , int[] arr2){
        // list using stream API
        int[] array = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr))
            .sorted()
            .toArray();
        
        
    }

}
