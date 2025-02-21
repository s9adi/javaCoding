package coding.InterviewQuestions.capgemini;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        // Rotate Array {1,2,3,4,5,6,7,8} , k =2
        // this array will become {7,8,1,2,3,4,5,6}

        // if we reverse the array - {8 ,7,6,5,4,3,2,1}
        // now we have to reverse the array from the k = 2 location

        int[] array = { 1, 2, 3, 4 };
        int k = 2;
        // Arrays.stream(array).forEach(x -> System.out.println(x));
        // Solution(array, k);
        Approach2(array,k);
    }

    private static void Solution(int[] array, int number) {
        int len = array.length;
        number = number % len;

        reverse(array, 0, len - 1);
        reverse(array, 0, number - 1);
        reverse(array, number, len - 1);

        Arrays.stream(array).forEach(x -> System.out.println(x));

    }

    private static void reverse(int[] array, int i, int j) {
        while (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private static void Approach2(int[] array, int k) {
        int len = array.length;
        int count  = 0 ;
        k = k%len ;

        while (count < k){
            int temp = array[len-1];
            for(int i = len-1 ; i >0 ; i--){
                array[i] = array[i - 1];
            }
            array[0] = temp;
            count++;
        }
        Arrays.stream(array).forEach(s -> System.out.println(s));
    }
    
}
