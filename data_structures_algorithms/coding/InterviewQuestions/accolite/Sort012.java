package coding.InterviewQuestions.accolite;



public class Sort012{
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0, 2};
        Solution(arr);
        
    }

    public static void swap(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void Solution(int array[]){
        int left = 0 ; int mid = 0 ; int right = array.length - 1;
        // mid is used to sort
        while (mid <= right){
            switch (array[mid]) {
                case 0 -> {
                    swap(array , mid , left);
                    left++ ; mid++;
                }

                case 1 -> mid++;
                case 2 -> {
                    swap(array, mid, right);
                    mid++;
                    right--;
                }
            }
        }
    }
}