package coding.InterviewQuestions.KPMG ;

public class BinarySearch {

    // {11,11,22,22,22,33,33,44,44,44,55,55,55}
    // find the last occurence of 44 
    // output should be 9


    public static void main(String[] args) {
        int[] array = new int[]{11,11,22,22,22,33,33,44,44,44,55,55,55};
        int target = 44;
        int result = Solution2(array, target);

        System.out.println(result);
    }

    private static int Solution(int[] array , int target){

        for (int i = array.length - 1 ; i >= 0 ; i--){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int Solution2(int[] array , int target){

        int first = 0;
        int last = array.length - 1 ;
        int result = -1;
        while (first <= last){
            int mid = (first + last)/2 ;

            if (array[mid] == target){
                result = mid;
                first = mid+1;
            }

            else if (array[mid] < target){
                first = mid - 1;

            }else {
                last = mid -1;
            }
        }
        return result;
    }
    
}



