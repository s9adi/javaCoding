package coding.InterviewQuestions;

public class MissingInteger {

    public static void main(String[] args) {
        int sol = Solution(new int[] {2,5,3,4});
        System.out.println(sol);
    }

    private static int Solution(int [] array){
        // this is asked in KPMG

        // int array[] = {4,5,6,7,9}

        // we are assuming that the array is not sorted so we are sorting it first 
        int n = array.length;
        for (int i =0 ; i < array.length ; i++){
            while (array[i] >0 && array[i] <= n && array[array[i] - 1] !=array[i]){ // we have the highest element to be n since one number is missing 
                int temp = array[array[i] - 1];
                array[array[i] -1] = array[i];
                array[i] = temp;
            }
        }
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] != i+1){
                return i+1;
            } 
        }
                return n+1;
    }
}
