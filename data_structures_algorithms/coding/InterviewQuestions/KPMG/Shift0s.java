package coding.InterviewQuestions.KPMG;

import java.util.Arrays;

public class Shift0s {

    public static void main(String[] args) {
        int[] array = new int[]{1,0,0,4,5,0};
        Solution(array);
    }

    private static void Solution(int[] array){
        // shifting to right 

        int digitpointer = 0;

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] != 0){
                array[digitpointer++] = array[i];
            }
        }
        while (digitpointer< array.length){
            array[digitpointer++] = 0;
        }

        Arrays.stream(array).forEach(x -> System.out.println(x));

    }

}
