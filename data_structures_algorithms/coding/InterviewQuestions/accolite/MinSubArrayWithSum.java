package coding.InterviewQuestions.accolite ;

public class MinSubArrayWithSum {

    public static void main(String[] args) {

        int[] array = new int[]{7,2,3,9,5};
        int k = 10;
        System.out.println(Solution(array, k));
        
    }

    private static int Solution(int[] array , int k){

        // contigous array is subarray 
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0 ; end < array.length ; end++){
            sum = sum + array[end];

            while (sum > k){
                minLen = Math.min(minLen, end - start + 1);
                sum = sum - array[start++];
            }
        }

        return minLen==Integer.MAX_VALUE ? 0:minLen;
    }

}
