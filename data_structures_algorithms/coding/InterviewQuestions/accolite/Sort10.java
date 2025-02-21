package coding.InterviewQuestions.accolite;

public class Sort10 {

    // you are having array which contains 1 and 0s. Sort the array.
    public static void main(String[] args){


    }

    private static void Solution(int array[]){
        int left = 0 ; int right  = array.length - 1;

        while (left < right){
            while(array[left]  == 0 && left < right){
                left++;
            }
            while (array[right] == 1 && left < right ){
                right--;
            }

            if (left < right ){
                int temp = array[left];
                array[left] = array[right] ;
                array[right] = temp;
            }
        }
    }
    
}
