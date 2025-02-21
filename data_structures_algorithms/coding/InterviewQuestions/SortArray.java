package coding.InterviewQuestions;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Solution();
    }

    private static void Solution() {
        int[] array = {1, 0, 0, 1, 1, 1, 0, 0};
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] == 1 && array[right] == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            if (array[left] == 0) {
                left++;
            }
            if (array[right] == 1) {
                right--;
            }
        }

        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
    }
}
