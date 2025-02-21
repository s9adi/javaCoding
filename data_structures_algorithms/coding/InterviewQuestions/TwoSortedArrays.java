package coding.InterviewQuestions;

import java.util.Arrays;

public class TwoSortedArrays {

    public static void main(String[] args) {
        
        int[] array = {1,2,9};
        int[] array2 = {1,3,4,5,6};
        Solution(array, array2);
    }

    public static void Solution(int[] array , int[] array2){
        int output[] = new int[array.length + array2.length];
       
        int k = 0;
        int i = 0 ;
        int j = 0;
        while(i<array.length && j<array2.length){
            if (array[i] >= array2[j]){
                output[k++] = array2[j++];
            }else {
                output[k++] = array[i++];
            }
        }

        while (i < array.length){
            output[k++] = array[i++];
        }
        while (j< array.length){
            output[k++] = array2[j++];
        }

        Arrays.stream(output).forEach(s -> System.out.println(s));
    }
}
