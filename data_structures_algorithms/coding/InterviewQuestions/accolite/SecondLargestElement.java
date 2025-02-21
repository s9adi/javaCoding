package coding.InterviewQuestions.accolite;

public class SecondLargestElement {

    public static void main(String[] args){
        int[] array = { -1, 0, 1, 2, -1, -4 };
        Solution(array);
    }
    
    private static void Solution(int[] array){
        int max  = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > max){
                secondMax = max ;
                max = array[i];
            }else if (array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }

        System.out.println("max :" + max + "\nSecondMax :" + secondMax);
    }
}
