package coding.InterviewQuestions.capgemini;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 8, 9};
        Solution(array);

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void Solution(int[] array){
        // Bubble sort is where we are repeatedly comparing adjacent elements
        // and swapping them if they are in the wrong order.

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // Fixed the increment of j here
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
